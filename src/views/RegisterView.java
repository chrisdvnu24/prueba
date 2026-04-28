package views;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RegisterView extends JFrame
{
    private JTextField usuario;
    private JPasswordField pass;
    private JButton crearBtn;
    private JButton volverBtn;
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
        panel.setBounds(250, 50, 500, 500);
        panel.setLayout(null);
        panel.setBackground(new Color(45, 45, 45));
        this.add(panel);

        JLabel titulo = new JLabel("Nueva cuenta");
        titulo.setBounds(100, 30, 300, 50);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo);

        JLabel lblUser = new JLabel("Usuario:");
        lblUser.setBounds(60, 110, 300, 30);
        lblUser.setForeground(Color.WHITE);
        panel.add(lblUser);

        usuario = new JTextField();
        usuario.setBorder(null);

        JLabel iconUser = new JLabel();
        try 
        {
            ImageIcon userIcon = new ImageIcon(getClass().getResource("/prueba/user.png"));
            Image imgUser = userIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            iconUser.setIcon(new ImageIcon(imgUser));
        } 
        catch (Exception e)
        {
        }

        userPanel = new JPanel(new BorderLayout());
        userPanel.setBounds(60, 140, 380, 35);
        userPanel.setBackground(Color.WHITE);
        userPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
        
        JPanel userIconPanel = new JPanel(new BorderLayout());
        userIconPanel.setBackground(Color.WHITE);
        userIconPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        userIconPanel.add(iconUser, BorderLayout.CENTER);
        
        userPanel.add(userIconPanel, BorderLayout.WEST);
        userPanel.add(usuario, BorderLayout.CENTER);
        panel.add(userPanel);

        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(60, 190, 300, 30);
        lblPass.setForeground(Color.WHITE);
        panel.add(lblPass);

        pass = new JPasswordField();
        pass.setBorder(null);

        JLabel iconPass = new JLabel();
        try 
        {
            ImageIcon passIcon = new ImageIcon(getClass().getResource("/prueba/lock.png"));
            Image imgPass = passIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            iconPass.setIcon(new ImageIcon(imgPass));
        } 
        catch (Exception e)
        {
        }

        passPanel = new JPanel(new BorderLayout());
        passPanel.setBounds(60, 220, 380, 35);
        passPanel.setBackground(Color.WHITE);
        passPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
        
        JPanel passIconPanel = new JPanel(new BorderLayout());
        passIconPanel.setBackground(Color.WHITE);
        passIconPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        passIconPanel.add(iconPass, BorderLayout.CENTER);
        
        passPanel.add(passIconPanel, BorderLayout.WEST);
        passPanel.add(pass, BorderLayout.CENTER);
        panel.add(passPanel);

        crearBtn = new JButton("Crear cuenta");
        crearBtn.setBounds(125, 300, 250, 45);
        crearBtn.setBackground(new Color(255, 155, 68));
        crearBtn.setForeground(Color.WHITE);
        crearBtn.setFocusPainted(false);
        crearBtn.setBorder(new LineBorder(Color.WHITE, 2, true));
        panel.add(crearBtn);

        volverBtn = new JButton("Volver al Login");
        volverBtn.setBounds(150, 430, 200, 35);
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

    public JPanel getUserContainer()
    {
        return userPanel;
    }

    public JPanel getPassContainer()
    {
        return passPanel;
    }
}