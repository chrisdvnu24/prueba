package views;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RegisterView extends JFrame
{
    private JTextField nombre;
    private JTextField usuario;
    private JPasswordField pass;
    private JButton crearBtn;
    private JButton volverBtn;
    private JPanel nombrePanel;
    private JPanel userPanel;
    private JPanel passPanel;

    public RegisterView()
    {
        setTitle("Registro");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(28, 28, 28));

        JPanel panel = new JPanel();
        panel.setBounds(250, 50, 500, 530);
        panel.setLayout(null);
        panel.setBackground(new Color(45, 45, 45));
        this.add(panel);

        JLabel titulo = new JLabel("Nueva cuenta");
        titulo.setBounds(100, 20, 300, 50);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo);

        JLabel lblNombre = new JLabel("Nombre completo:");
        lblNombre.setBounds(60, 90, 300, 30);
        lblNombre.setForeground(Color.WHITE);
        panel.add(lblNombre);

        nombre = new JTextField();
        nombre.setBorder(null);

        nombrePanel = new JPanel(new BorderLayout());
        nombrePanel.setBounds(60, 120, 380, 35);
        nombrePanel.setBackground(Color.WHITE);
        nombrePanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
        nombrePanel.add(nombre, BorderLayout.CENTER);
        panel.add(nombrePanel);

        JLabel lblUser = new JLabel("Correo electrónico:");
        lblUser.setBounds(60, 170, 300, 30);
        lblUser.setForeground(Color.WHITE);
        panel.add(lblUser);

        usuario = new JTextField();
        usuario.setBorder(null);

        userPanel = new JPanel(new BorderLayout());
        userPanel.setBounds(60, 200, 380, 35);
        userPanel.setBackground(Color.WHITE);
        userPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
        userPanel.add(usuario, BorderLayout.CENTER);
        panel.add(userPanel);

        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(60, 250, 300, 30);
        lblPass.setForeground(Color.WHITE);
        panel.add(lblPass);

        pass = new JPasswordField();
        pass.setBorder(null);

        passPanel = new JPanel(new BorderLayout());
        passPanel.setBounds(60, 280, 380, 35);
        passPanel.setBackground(Color.WHITE);
        passPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
        passPanel.add(pass, BorderLayout.CENTER);
        panel.add(passPanel);

        crearBtn = new JButton("Crear cuenta");
        crearBtn.setBounds(125, 350, 250, 45);
        crearBtn.setBackground(new Color(255, 155, 68));
        crearBtn.setForeground(Color.WHITE);
        crearBtn.setFocusPainted(false);
        crearBtn.setBorder(new LineBorder(Color.WHITE, 2, true));
        panel.add(crearBtn);

        volverBtn = new JButton("Volver al Login");
        volverBtn.setBounds(150, 450, 200, 35);
        volverBtn.setBackground(new Color(90, 90, 90));
        volverBtn.setForeground(Color.WHITE);
        volverBtn.setFocusPainted(false);
        volverBtn.setBorder(new LineBorder(Color.WHITE, 2, true));
        panel.add(volverBtn);
    }

    public void registerView()
    {
        setVisible(true);
    }

    public void limpiarCampos()
    {
        nombre.setText("");
        usuario.setText("");
        pass.setText("");
    }

    public String getNombre()
    {
        return nombre.getText();
    }

    public String getUsername()
    {
        return usuario.getText();
    }

    public String getPassword()
    {
        return new String(pass.getPassword());
    }

    public JButton getBtnCrear()
    {
        return crearBtn;
    }

    public JButton getBtnVolver()
    {
        return volverBtn;
    }

    public JPanel getNombreContainer()
    {
        return nombrePanel;
    }

    public JPanel getUserContainer()
    {
        return userPanel;
    }

    public JPanel getPassContainer()
    {
        return passPanel;
    }
}