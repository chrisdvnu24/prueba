package views;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class AuthView extends JFrame
{
    private JTextField usuario;
    private JPasswordField pass;
    private JButton loginBtn;
    private JButton irRegistroBtn;
    private JPanel userPanel;
    private JPanel passPanel;

    public AuthView()
    {
        setTitle("Login");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel fondo = new JLabel();
        fondo.setBounds(0, 0, 1000, 650);
        try
        {
            fondo.setIcon(new ImageIcon(getClass().getResource("/prueba/fondo.jpg")));
        }
        catch (Exception e)
        {
        }
        this.add(fondo);

        JPanel panel = new JPanel();
        panel.setBounds(300, 120, 400, 400);
        panel.setBackground(new Color(0, 0, 0, 180));
        panel.setLayout(null);
        fondo.add(panel);

        JLabel titulo = new JLabel("Login");
        titulo.setBounds(100, 40, 200, 40);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo);

        JLabel iconUser = new JLabel();
        JLabel iconPass = new JLabel();
        try
        {
            ImageIcon userIcon = new ImageIcon(getClass().getResource("/prueba/user.png"));
            Image imgUser = userIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            iconUser.setIcon(new ImageIcon(imgUser));

            ImageIcon passIcon = new ImageIcon(getClass().getResource("/prueba/lock.png"));
            Image imgPass = passIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            iconPass.setIcon(new ImageIcon(imgPass));
        }
        catch (Exception e)
        {
        }

        JLabel labelUsuario = new JLabel("Usuario");
        labelUsuario.setBounds(80, 95, 260, 20);
        labelUsuario.setForeground(Color.WHITE);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(labelUsuario);

        usuario = new JTextField();
        usuario.setBorder(null);

        userPanel = new JPanel(new BorderLayout());
        userPanel.setBounds(80, 120, 260, 35);
        userPanel.setBackground(Color.WHITE);
        userPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
        userPanel.add(iconUser, BorderLayout.WEST);
        userPanel.add(usuario, BorderLayout.CENTER);
        panel.add(userPanel);

        JLabel labelPass = new JLabel("Contraseña");
        labelPass.setBounds(80, 165, 260, 20);
        labelPass.setForeground(Color.WHITE);
        labelPass.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(labelPass);

        pass = new JPasswordField();
        pass.setBorder(null);

        passPanel = new JPanel(new BorderLayout());
        passPanel.setBounds(80, 190, 260, 35);
        passPanel.setBackground(Color.WHITE);
        passPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
        passPanel.add(iconPass, BorderLayout.WEST);
        passPanel.add(pass, BorderLayout.CENTER);
        panel.add(passPanel);

        loginBtn = new JButton("Iniciar sesión");
        loginBtn.setBounds(125, 260, 150, 45);
        loginBtn.setBackground(new Color(255, 155, 68));
        loginBtn.setFocusPainted(false);
        loginBtn.setBorder(new LineBorder(Color.WHITE, 2, true));
        panel.add(loginBtn);

        irRegistroBtn = new JButton("¿Aún no tienes cuenta?");
        irRegistroBtn.setBounds(100, 320, 200, 30);
        irRegistroBtn.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(irRegistroBtn);
    }

    public void loginView()
    {
        setVisible(true);
    }

    public String getUsername()
    {
        return usuario.getText();
    }

    public String getPassword()
    {
        return new String(pass.getPassword());
    }

    public JButton getBtnLogin()
    {
        return loginBtn;
    }

    public JButton getBtnIrRegistro()
    {
        return irRegistroBtn;
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