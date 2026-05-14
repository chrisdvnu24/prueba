package controllers;

import views.UsersView;
import views.HomeView;
import views.RegisterView;
import models.User;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsersController 
{
    private UsersView view;
    private HomeView vistaHome;

    public UsersController(HomeView vistaHome)
    {
        this.view = new UsersView();
        this.vistaHome = vistaHome;

        this.view.getBtnVolver().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                view.dispose();
                vistaHome.setVisible(true);
            }
        });

        this.view.getBtnNuevoRegistro().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                abrirVentanaRegistro();
            }
        });
    }

    private void abrirVentanaRegistro()
    {
        RegisterView formRegistro = new RegisterView();
        
        formRegistro.getBtnCrear().setText("Guardar");
        formRegistro.getBtnVolver().setText("Cancelar");
        
        formRegistro.registerView();

        formRegistro.getBtnVolver().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                formRegistro.dispose();
            }
        });

        formRegistro.getBtnCrear().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String nombre_val = formRegistro.getNombre();
                String user_val = formRegistro.getUsername();
                String pass_val = formRegistro.getPassword();

                if (nombre_val.isEmpty() || user_val.isEmpty() || pass_val.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Rellena todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                User nuevoUsuario = new User();
                nuevoUsuario.setNombre_completo(nombre_val);
                nuevoUsuario.setUsername(user_val);
                nuevoUsuario.setPassword(pass_val);

                if (nuevoUsuario.registrarUsuario(nuevoUsuario))
                {
                    JOptionPane.showMessageDialog(null, "¡Registro guardado exitosamente!");
                    formRegistro.dispose();
                    view.cargarTabla();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error al guardar el registro en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public void showUsers()
    {
        this.view.showView();
    }
}