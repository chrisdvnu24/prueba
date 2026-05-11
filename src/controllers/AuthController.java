package controllers;

import views.AuthView;
import views.RegisterView;
import views.HomeView;
import models.AuthModel;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthController
{
    private AuthView vistaLogin;
    private RegisterView vistaRegistro;
    private HomeView vistaHome;
    private AuthModel modelo;

    public AuthController()
    {
        this.vistaLogin = new AuthView();
        this.vistaRegistro = new RegisterView();
        this.vistaHome = new HomeView();
        this.modelo = new AuthModel();

        this.vistaLogin.getBtnLogin().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                authUsuario();
            }
        });

        this.vistaLogin.getBtnIrRegistro().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                vistaLogin.dispose();
                vistaRegistro.registerView();
            }
        });

        this.vistaRegistro.getBtnCrear().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                registrarUsuario();
            }
        });

        this.vistaRegistro.getBtnVolver().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                vistaRegistro.dispose();
                vistaLogin.loginView();
            }
        });

        this.vistaHome.getBtnGoToUsers().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                vistaHome.setVisible(false);
                UsersController panelUsuarios = new UsersController(vistaHome);
                panelUsuarios.showUsers();
            }
        });
    }

    public void showLogin()
    {
        vistaLogin.loginView();
    }

    private void authUsuario()
    {
        String user_val = vistaLogin.getUsername();
        String pass_val = vistaLogin.getPassword();

        if (modelo.autenticar(user_val, pass_val))
        {
            vistaLogin.dispose();
            vistaHome.showView();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            vistaLogin.getUserContainer().setBorder(new LineBorder(Color.RED, 1, true));
            vistaLogin.getPassContainer().setBorder(new LineBorder(Color.RED, 1, true));
        }
    }

    private void registrarUsuario()
    {
        String nombre_val = vistaRegistro.getNombre();
        String user_val = vistaRegistro.getUsername();
        String pass_val = vistaRegistro.getPassword();

        if (nombre_val.isEmpty() || user_val.isEmpty() || pass_val.isEmpty())
        {
            vistaRegistro.getNombreContainer().setBorder(new LineBorder(Color.RED, 1, true));
            vistaRegistro.getUserContainer().setBorder(new LineBorder(Color.RED, 1, true));
            vistaRegistro.getPassContainer().setBorder(new LineBorder(Color.RED, 1, true));
            JOptionPane.showMessageDialog(null, "Rellena todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int resultado = modelo.registrar(user_val, pass_val, nombre_val);

        if (resultado == 1)
        {
            vistaRegistro.getNombreContainer().setBorder(new LineBorder(Color.GREEN, 1, true));
            vistaRegistro.getUserContainer().setBorder(new LineBorder(Color.GREEN, 1, true));
            vistaRegistro.getPassContainer().setBorder(new LineBorder(Color.GREEN, 1, true));
            JOptionPane.showMessageDialog(null, "¡Registro exitoso! Ya puedes iniciar sesión.");
            vistaRegistro.limpiarCampos();
        }
        else if (resultado == 2)
        {
            vistaRegistro.getUserContainer().setBorder(new LineBorder(Color.RED, 1, true));
            JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya está registrado.", "Usuario duplicado", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.", "Error crítico", JOptionPane.ERROR_MESSAGE);
        }
    }
}