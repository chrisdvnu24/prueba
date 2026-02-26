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
        this.setSize(1000, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(new Color(28, 28, 28));
        contenedor.setSize(500, 650);
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
        register_container.setSize(500, 650);
        register_container.setLocation(500, 0);
        register_container.setLayout(null);
        register_container.setBackground(new Color(28, 28, 28));
        this.add(register_container);

        JLabel bio_tag = new JLabel("REGISTRO");
        bio_tag.setBounds(100, 30, 300, 70);
        bio_tag.setFont(new Font("Arial", Font.BOLD, 40));
        bio_tag.setBackground(Color.WHITE);
        bio_tag.setOpaque(true);
        bio_tag.setHorizontalAlignment(SwingConstants.CENTER);
        register_container.add(bio_tag);

        // NOMBRE DE USUARIO
        JLabel nombre_usuario = new JLabel("NOMBRE DE USUARIO:");
        nombre_usuario.setBounds(60, 120, 300, 30);
        nombre_usuario.setForeground(Color.WHITE);
        nombre_usuario.setFont(new Font("Arial", Font.BOLD, 16));
        register_container.add(nombre_usuario);

        JTextField usuario_registro = new JTextField();
        usuario_registro.setBounds(60, 155, 380, 35);
        usuario_registro.setFont(new Font("Arial", Font.PLAIN, 16));
        register_container.add(usuario_registro);

        // BIO
        JLabel bio_label = new JLabel("BIO");
        bio_label.setBounds(60, 205, 200, 30);
        bio_label.setForeground(Color.WHITE);
        bio_label.setFont(new Font("Arial", Font.BOLD, 16));
        register_container.add(bio_label);

        JTextArea bio = new JTextArea();
        bio.setBounds(60, 240, 380, 80);
        bio.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        register_container.add(bio);

        JLabel preferencias = new JLabel("PREFERENCIAS");
        preferencias.setBounds(60, 330, 200, 30);
        preferencias.setForeground(Color.WHITE);
        preferencias.setFont(new Font("Arial", Font.BOLD, 16));
        register_container.add(preferencias);

        JCheckBox sweet_option = new JCheckBox("Dulce");
        sweet_option.setBounds(60, 360, 100 ,30);
        sweet_option.setOpaque(false);
        sweet_option.setForeground(Color.WHITE);
        register_container.add(sweet_option);

        JCheckBox salty_option = new JCheckBox("Salado");
        salty_option.setBounds(170, 360, 100, 30);
        salty_option.setOpaque(false);
        salty_option.setForeground(Color.WHITE);
        register_container.add(salty_option);

        JCheckBox healthy_option = new JCheckBox("Saludable");
        healthy_option.setBounds(280, 360, 120, 30);
        healthy_option.setOpaque(false);
        healthy_option.setForeground(Color.WHITE);
        register_container.add(healthy_option);

        JLabel terminos = new JLabel("TÉRMINOS");
        terminos.setBounds(60, 400, 200, 30);
        terminos.setForeground(Color.WHITE);
        terminos.setFont(new Font("Arial", Font.BOLD, 16));
        register_container.add(terminos);

        JRadioButton accept_terms = new JRadioButton("Acepto los términos");
        accept_terms.setBounds(60, 430, 180, 30);
        accept_terms.setForeground(Color.WHITE);
        accept_terms.setOpaque(false);
        register_container.add(accept_terms);

        JRadioButton reject_terms = new JRadioButton("No acepto los términos");
        reject_terms.setBounds(250, 430, 200, 30);
        reject_terms.setForeground(Color.WHITE);
        reject_terms.setOpaque(false);
        register_container.add(reject_terms);

        ButtonGroup terms = new ButtonGroup();
        terms.add(reject_terms);
        terms.add(accept_terms);

        String [] colonias = {"Camino real", "La fuente", "Agua escondida"};

        JComboBox list = new JComboBox(colonias);
        list.setBounds(60, 470, 250, 35);
        register_container.add(list);

        JButton crearCuenta = new JButton("Crear cuenta");
        crearCuenta.setBounds(120, 520, 250, 45);
        crearCuenta.setFont(new Font("Arial", Font.BOLD, 20));
        crearCuenta.setBackground(Color.WHITE);
        register_container.add(crearCuenta);
        this.setVisible(true);
    }
}