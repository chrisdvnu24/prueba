package prueba;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame 
{
    public Ventana() 
    {
        this.setTitle("Login");
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);

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
        banner.setHorizontalAlignment(JLabel.CENTER);
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
        
        // Contenedor registro
        JPanel register_container = new JPanel();
        register_container.setSize(500, 600);
        register_container.setLocation(500, 0);
        register_container.setLayout(null);
        register_container.setOpaque(true);
        register_container.setBackground(new Color(41, 41, 41));
        this.add(register_container);
        
        JLabel bio_tag = new JLabel("BIOGRAFÍA");
        bio_tag.setBounds(120, 30, 250, 75);
        bio_tag.setFont(new Font("Arial", Font.BOLD, 22));
        bio_tag.setBackground(Color.WHITE);
        bio_tag.setOpaque(true);
        bio_tag.setHorizontalAlignment(JLabel.CENTER);
        register_container.add(bio_tag);
        
        JTextArea bio = new JTextArea();
        bio.setBounds(120, 160, 250, 120);
        register_container.add(bio);
        
        JCheckBox sweet_option = new JCheckBox("Dulce");
        sweet_option.setBounds(120, 330, 100 ,50);
        sweet_option.setOpaque(false);
        sweet_option.setForeground(Color.WHITE);
        register_container.add(sweet_option);

        JCheckBox salty_option = new JCheckBox("Salado");
        salty_option.setBounds(220, 330, 100, 50);
        salty_option.setOpaque(false);
        salty_option.setForeground(Color.WHITE);
        register_container.add(salty_option);
        
        
        JCheckBox healthy_option = new JCheckBox("Saludable");
        healthy_option.setBounds(320, 330, 100, 50);
        healthy_option.setOpaque(false);
        healthy_option.setForeground(Color.WHITE);
        healthy_option.setBorderPainted(true);
        register_container.add(healthy_option);
        
        JRadioButton accept_terms = new JRadioButton("Acepto los términos");
        accept_terms.setBounds(120, 400, 150, 50);
        accept_terms.setForeground(Color.WHITE);
        accept_terms.setOpaque(false);
        register_container.add(accept_terms);

        JRadioButton reject_terms = new JRadioButton("Rechazo los términos");
        reject_terms.setBounds(290, 400, 180, 50);
        reject_terms.setForeground(Color.WHITE);
        reject_terms.setOpaque(false);
        register_container.add(reject_terms);
        
        ButtonGroup terms = new ButtonGroup();
        terms.add(reject_terms);
        terms.add(accept_terms);
        
        String [] colonias = {"Camino real", "La fuente", "Agua escondida"};
        
        JComboBox list = new JComboBox(colonias);
        list.setBounds(123, 450, 200, 50);
        register_container.add(list);
       
        this.setVisible(true);
    }
}