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
            JOptionPane.showMessageDialog(null, "¡Conexión exitosa!");
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
        String user_val = vistaRegistro.getUsername();
        String pass_val = vistaRegistro.getPassword();

        if (user_val.isEmpty() || pass_val.isEmpty())
        {
            vistaRegistro.getUserContainer().setBorder(new LineBorder(Color.RED, 1, true));
            vistaRegistro.getPassContainer().setBorder(new LineBorder(Color.RED, 1, true));
            JOptionPane.showMessageDialog(null, "Rellena todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            vistaRegistro.getUserContainer().setBorder(new LineBorder(Color.GREEN, 1, true));
            vistaRegistro.getPassContainer().setBorder(new LineBorder(Color.GREEN, 1, true));
            JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente");
        }
    }
}