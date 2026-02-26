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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame 
{
	public Ventana() 
	{
		this.setSize(1000, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		//this.setResizable(false);
		//login();
		//registro();
		usuarios();
		this.setVisible(true);
	}

	public void login() 
	{
		this.setTitle("Login");
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
	}

	public void registro() 
	{
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

		JLabel nombre_usuario = new JLabel("NOMBRE DE USUARIO:");
		nombre_usuario.setBounds(60, 120, 300, 30);
		nombre_usuario.setForeground(Color.WHITE);
		nombre_usuario.setFont(new Font("Arial", Font.BOLD, 16));
		register_container.add(nombre_usuario);

		JTextField usuario_registro = new JTextField();
		usuario_registro.setBounds(60, 155, 380, 35);
		usuario_registro.setFont(new Font("Arial", Font.PLAIN, 16));
		register_container.add(usuario_registro);

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
		sweet_option.setBounds(60, 360, 100, 30);
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

		String[] colonias = {"Camino real", "La fuente", "Agua escondida"};
		JComboBox list = new JComboBox<>(colonias);
		list.setBounds(60, 470, 250, 35);
		register_container.add(list);

		JButton crearCuenta = new JButton("Crear cuenta");
		crearCuenta.setBounds(120, 520, 250, 45);
		crearCuenta.setFont(new Font("Arial", Font.BOLD, 20));
		crearCuenta.setBackground(Color.WHITE);
		register_container.add(crearCuenta);
	}

	public void usuarios()
	{
		JPanel users = new JPanel();
		users.setSize(800,500);
		users.setLocation(100, 50);
		users.setBackground(Color.WHITE);
		users.setLayout(null);    		
		this.add(users);   

		JLabel users_title = new JLabel("USUARIOS");
		users_title.setBounds(350, 50, 100, 40);
		users_title.setOpaque(true);
		users_title.setBackground(Color.decode("#F27A61"));
		users_title.setHorizontalAlignment(SwingConstants.CENTER);
		users.add(users_title);

		JButton export = new JButton("Exportar");
		export.setBounds(30, 120, 150, 40);
		users.add(export);

		JButton add = new JButton("Añadir");
		add.setBounds(210, 120, 150, 40);
		users.add(add);

		String[] table_head = {"No. control", "Nombre", "Apellidos", "Semestre", "Promedio", "Accion"};

		String[][] table_content = 
			{
					{"20231001", "Juan", "Pérez García", "3", "8.7", "EDITAR"},
					{"20231002", "María", "López Hernández", "5", "9.2", "EDITAR"},
					{"20231003", "Carlos", "Ramírez Ruiz", "1", "7.5", "EDITAR"},
					{"20231004", "Ana", "Martínez Sosa", "4", "9.8", "EDITAR"},
					{"20231005", "Luis", "Torres Castro", "2", "8.0", "EDITAR"},
					{"20231006", "Elena", "Gómez Vargas", "6", "8.9", "EDITAR"},
					{"20231007", "Roberto", "Jiménez Díaz", "8", "9.5", "EDITAR"},
					{"20231008", "Lucía", "Méndez Salazar", "3", "7.2", "EDITAR"},
					{"20231009", "Fernando", "Álvarez Tello", "7", "8.4", "EDITAR"},
					{"20231010", "Sofía", "Ortega Luna", "2", "9.1", "EDITAR"},
					{"20231011", "Ricardo", "Peralta Soto", "5", "8.3", "EDITAR"},
					{"20231012", "Gabriela", "Ríos Valdés", "4", "9.6", "EDITAR"},
					{"20231013", "Hugo", "Morales Nava", "1", "7.9", "EDITAR"},
					{"20231014", "Valeria", "Castillo Meza", "6", "8.8", "EDITAR"},
					{"20231015", "Andrés", "Cano Herrera", "3", "9.0", "EDITAR"},
					{"20231016", "Paola", "Durán Vega", "8", "7.6", "EDITAR"},
					{"20231017", "Mauricio", "Guzmán Flores", "2", "8.1", "EDITAR"},
					{"20231018", "Beatriz", "Corona Rojas", "7", "9.4", "EDITAR"},
					{"20231019", "Javier", "Solís Peña", "5", "8.5", "EDITAR"},
					{"20231020", "Claudia", "Ibáñez Campos", "4", "9.9", "EDITAR"}
			};

		JTable users_table = new JTable(table_content, table_head);
		users_table.setLocation(30, 180);
		users_table.setSize(800, 400);
		users_table.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));    		
		users.add(users_table);


		JScrollPane tableScroll = new JScrollPane(users_table);
		tableScroll.setBounds(30, 180, 740, 300);
		users.add(tableScroll);
	}


	public static void main(String[] args) 
	{
		new Ventana();
	}
}