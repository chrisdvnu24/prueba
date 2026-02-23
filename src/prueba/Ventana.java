package prueba;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame 
{
    public Ventana() 
    {
        this.setTitle("Login");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(new Color(28, 28, 28));
        contenedor.setSize(500, 600);
        contenedor.setLocation(0, 0);
        contenedor.setLayout(null);
        this.add(contenedor);

        JLabel banner = new JLabel("LOGIN");
        banner.setOpaque(true);
        banner.setBackground(Color.WHITE);
        banner.setForeground(Color.BLACK);
        banner.setFont(new Font("Arial", Font.BOLD, 40));
        banner.setHorizontalAlignment(SwingConstants.CENTER);
        banner.setSize(300, 70);
        banner.setLocation(100, 30);
        contenedor.add(banner);

        JLabel labelUsuario = new JLabel("USUARIO:");
        labelUsuario.setForeground(Color.WHITE);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 16));
        labelUsuario.setSize(250, 30);
        labelUsuario.setLocation(50, 130);
        contenedor.add(labelUsuario);

        JTextField usuario = new JTextField();
        usuario.setFont(new Font("Arial", Font.PLAIN, 16));
        usuario.setSize(380, 35);
        usuario.setLocation(50, 165);
        contenedor.add(usuario);

        JLabel labelPass = new JLabel("CONTRASEÑA:");
        labelPass.setForeground(Color.WHITE);
        labelPass.setFont(new Font("Arial", Font.BOLD, 16));
        labelPass.setSize(250, 30);
        labelPass.setLocation(50, 220);
        contenedor.add(labelPass);

        JPasswordField pass = new JPasswordField();
        pass.setSize(380, 35);
        pass.setLocation(50, 255);
        contenedor.add(pass);

        JCheckBox recordar = new JCheckBox("Recordarme");
        recordar.setOpaque(false);
        recordar.setForeground(Color.WHITE);
        recordar.setSize(120, 30);
        recordar.setLocation(50, 300);
        contenedor.add(recordar);

        JLabel olvido = new JLabel("¿Olvidó su contraseña?");
        olvido.setForeground(Color.WHITE);
        olvido.setSize(150, 30);
        olvido.setLocation(280, 300);
        contenedor.add(olvido);

        JButton botonAcceder = new JButton("Acceder");
        botonAcceder.setFont(new Font("Arial", Font.BOLD, 22));
        botonAcceder.setBackground(Color.WHITE);
        botonAcceder.setSize(180, 50);
        botonAcceder.setLocation(150, 380);
        contenedor.add(botonAcceder);

        this.setVisible(true);
    }
}