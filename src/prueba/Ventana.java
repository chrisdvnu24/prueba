package prueba;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
		//this.setSize(360, 480);
		this.setSize(1000, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		//this.setResizable(false);
		
		/*
		JMenuBar barra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		
		JMenuItem open = new JMenuItem("Abrir");
		JMenuItem close = new JMenuItem("Cerrar");
		JMenuItem save = new JMenuItem("Guardar");
		JMenuItem newFile = new JMenuItem("Nuevo");
		
		archivo.add(open);
		archivo.add(close);
		archivo.add(save);
		archivo.add(newFile);
		
		barra.add(archivo);
		archivo.addSeparator();

		JMenu submenu = new JMenu("Otros");
		archivo.add(submenu);
		
		JMenuItem menuItem = new JMenuItem("Hola mundo");
		submenu.add(menuItem);
		
		menuItem = new JMenuItem("A");
		submenu.add(menuItem);
		
		this.setJMenuBar(barra);
		*/
		
		//calculadoraLayout();
		login();
		//registro();
		//usuarios();
		//calculadora();
		//interes();
		//pruebaIcono();
		//pintar();
		//casa();
		
		this.setVisible(true);
	}

	public void login() 
	{
	    this.setTitle("Login");
	    this.getContentPane().removeAll();
	    this.setLayout(null);

	    // fondo
	    JLabel fondo = new JLabel();
	    fondo.setBounds(0, 0, 1000, 650);
	    fondo.setIcon(new ImageIcon(getClass().getResource("fondo.jpg")));
	    fondo.setLayout(null);
	    this.add(fondo);

	    // panel
	    JPanel panel = new JPanel();
	    panel.setBounds(300, 120, 400, 400);
	    panel.setBackground(new Color(0, 0, 0, 180));
	    panel.setLayout(null);
	    fondo.add(panel);

	    // titulo
	    JLabel titulo = new JLabel("Login");
	    titulo.setBounds(100, 40, 200, 40);
	    titulo.setFont(new Font("Arial", Font.BOLD, 28));
	    titulo.setForeground(Color.WHITE);
	    titulo.setHorizontalAlignment(SwingConstants.CENTER);
	    panel.add(titulo);

	    // icons
	    ImageIcon userIcon = new ImageIcon(getClass().getResource("user.png"));
	    ImageIcon passIcon = new ImageIcon(getClass().getResource("lock.png"));

	    // tamaño icons
	    Image imgUser = userIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	    userIcon = new ImageIcon(imgUser);

	    Image imgPass = passIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	    passIcon = new ImageIcon(imgPass);

	    JLabel iconUser = new JLabel(userIcon);
	    JLabel iconPass = new JLabel(passIcon);

	    // user
	    JLabel labelUsuario = new JLabel("Usuario");
	    labelUsuario.setBounds(80, 95, 260, 20);
	    labelUsuario.setForeground(Color.WHITE);
	    labelUsuario.setFont(new Font("Arial", Font.BOLD, 14));
	    panel.add(labelUsuario);

	    JTextField usuario = new JTextField();
	    usuario.setFont(new Font("Arial", Font.PLAIN, 16));
	    usuario.setBorder(null);

	    JPanel userPanel = new JPanel(new BorderLayout());
	    userPanel.setBounds(80, 120, 260, 35);
	    userPanel.setBackground(Color.WHITE);
	    userPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));

	    userPanel.add(iconUser, BorderLayout.WEST);
	    userPanel.add(usuario, BorderLayout.CENTER);

	    panel.add(userPanel);

	    // password
	    JLabel labelPass = new JLabel("Contraseña");
	    labelPass.setBounds(80, 165, 260, 20);
	    labelPass.setForeground(Color.WHITE);
	    labelPass.setFont(new Font("Arial", Font.BOLD, 14));
	    panel.add(labelPass);

	    JPasswordField pass = new JPasswordField();
	    pass.setFont(new Font("Arial", Font.PLAIN, 16));
	    pass.setBorder(null);

	    JPanel passPanel = new JPanel(new BorderLayout());
	    passPanel.setBounds(80, 190, 260, 35);
	    passPanel.setBackground(Color.WHITE);
	    passPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));

	    passPanel.add(iconPass, BorderLayout.WEST);
	    passPanel.add(pass, BorderLayout.CENTER);

	    panel.add(passPanel);

	    // button
	    JButton loginBtn = new JButton("Iniciar sesión");
	    loginBtn.setBounds(125, 260, 150, 45);
	    loginBtn.setFocusPainted(false);
	    loginBtn.setFont(new Font("Arial", Font.BOLD, 18));
	    loginBtn.setBackground(new Color(255, 155, 68));
	    loginBtn.setBorder(new LineBorder(Color.WHITE, 2, true));
	    panel.add(loginBtn);

	    loginBtn.addMouseListener(new java.awt.event.MouseAdapter()
	    {
	        public void mouseEntered(java.awt.event.MouseEvent evt)
	        {
	            loginBtn.setBackground(new Color(249, 176, 113));
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt)
	        {
	            loginBtn.setBackground(new Color(255, 155, 68));
	        }
	    });

	    loginBtn.addActionListener(new ActionListener()
	    {
	        @Override
	        public void actionPerformed(ActionEvent e)
	        {
	            String username_val = usuario.getText();
	            String password_val = new String(pass.getPassword());

	            // datos duros
	            String correctUsername = "admin@gmail.com";
	            String correctPassword = "1234";

	            // validación
	            boolean emptyField = false;

	            if(username_val.equals(""))
	            {
	                userPanel.setBorder(new LineBorder(Color.RED, 1, true));
	                emptyField = true;
	            }
	            else
	            {
	                userPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
	            }

	            if(password_val.equals(""))
	            {
	                passPanel.setBorder(new LineBorder(Color.RED, 1, true));
	                emptyField = true;
	            }
	            else
	            {
	                passPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
	            }

	            if(emptyField)
	            {
	                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos correctamente", "Advertencia", JOptionPane.WARNING_MESSAGE);
	                return;
	            }

	            // validar datos
	            if(username_val.equals(correctUsername) && password_val.equals(correctPassword))
	            {
	                JOptionPane.showMessageDialog(null, "¡Bienvenido " + username_val + "!", "Login", JOptionPane.INFORMATION_MESSAGE);
	                userPanel.setBorder(new LineBorder(Color.GREEN, 1, true));
	                passPanel.setBorder(new LineBorder(Color.GREEN, 1, true));
	            }
	            else
	            {
	                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
	                userPanel.setBorder(new LineBorder(Color.RED, 1, true));
	                passPanel.setBorder(new LineBorder(Color.RED, 1, true));
	            }
	        }
	    });

	    this.repaint();
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
		
		crearCuenta.addActionListener(new ActionListener() 
		    {
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						String username_val = usuario_registro.getText();
						
						if (username_val.equals(""))
						{
						    usuario_registro.setBorder(new LineBorder(Color.RED, 1, true));
						}
						else
						{
						    usuario_registro.setBorder(new LineBorder(Color.GREEN, 1, true));

						}
						
						
					}
		    });
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
	
	public void calculadora()
	{
		this.setTitle("Calculadora");
		this.getContentPane().removeAll();
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(28, 28, 28));

		JTextField pantalla = new JTextField("0");
		pantalla.setBounds(30, 30, 290, 70);
		pantalla.setFont(new Font("Arial", Font.BOLD, 30));
		pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		pantalla.setEditable(false);
		pantalla.setBackground(Color.BLACK);
		pantalla.setForeground(Color.WHITE);
		this.add(pantalla);

		JButton ce = new JButton("CE");
		ce.setBounds(30, 120, 65, 50);
		ce.setFont(new Font("Arial", Font.BOLD, 18));
		ce.setBackground(Color.ORANGE);
		ce.setForeground(Color.WHITE);
		this.add(ce);

		JButton div = new JButton("/");
		div.setBounds(105, 120, 65, 50);
		div.setFont(new Font("Arial", Font.BOLD, 18));
		div.setBackground(new Color(240, 157, 94));
		div.setForeground(Color.WHITE);
		this.add(div);

		JButton mul = new JButton("*");
		mul.setBounds(180, 120, 65, 50);
		mul.setFont(new Font("Arial", Font.BOLD, 18));
		mul.setBackground(new Color(240, 157, 94));
		mul.setForeground(Color.WHITE);
		this.add(mul);

		JButton menos = new JButton("-");
		menos.setBounds(255, 120, 65, 50);
		menos.setFont(new Font("Arial", Font.BOLD, 18));
		menos.setBackground(new Color(240, 157, 94));
		menos.setForeground(Color.WHITE);
		this.add(menos);

		JButton b7 = new JButton("7");
		b7.setBounds(30, 180, 65, 50);
		b7.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(b7);

		JButton b8 = new JButton("8");
		b8.setBounds(105, 180, 65, 50);
		b8.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(b8);

		JButton b9 = new JButton("9");
		b9.setBounds(180, 180, 65, 50);
		b9.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(b9);

		JButton mas = new JButton("+");
		mas.setBounds(255, 180, 65, 110);
		mas.setFont(new Font("Arial", Font.BOLD, 18));
		mas.setBackground(new Color(240, 157, 94));
		mas.setForeground(Color.WHITE);
		this.add(mas);
		
		JButton b4 = new JButton("4");
		b4.setBounds(30, 240, 65, 50);
		b4.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(b4);

		JButton b5 = new JButton("5");
		b5.setBounds(105, 240, 65, 50);
		b5.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(b5);

		JButton b6 = new JButton("6");
		b6.setBounds(180, 240, 65, 50);
		b6.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(b6);

		JButton b1 = new JButton("1");
		b1.setBounds(30, 300, 65, 50);
		b1.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(b1);

		JButton b2 = new JButton("2");
		b2.setBounds(105, 300, 65, 50);
		b2.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(b2);

		JButton b3 = new JButton("3");
		b3.setBounds(180, 300, 65, 50);
		b3.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(b3);

		JButton igual = new JButton("=");
		igual.setBounds(255, 300, 65, 110);
		igual.setFont(new Font("Arial", Font.BOLD, 18));
		igual.setBackground(new Color(240, 157, 94));
		igual.setForeground(Color.WHITE);
		this.add(igual);

		JButton b0 = new JButton("0");
		b0.setBounds(30, 360, 140, 50);
		b0.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(b0);

		JButton punto = new JButton(".");
		punto.setBounds(180, 360, 65, 50);
		punto.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(punto);

		this.repaint();
	}
	
	public void calculadoraLayout() 
	{
	    this.setTitle("Calculadora");
	    this.setLayout(new BorderLayout(10,10));
	    
	    // Es la linea debajo de la pantalla
	    this.getContentPane().setBackground(new Color(18,18,18));

	    // Pantalla
	    JTextField screen = new JTextField("0");
	    screen.setFont(new Font("Arial", Font.BOLD, 40));
	    screen.setHorizontalAlignment(SwingConstants.RIGHT);
	    screen.setEditable(false);
	    
	    // Color gris oscuro = 10 10 10
	    screen.setBackground(new Color(10,10,10));
	    screen.setForeground(Color.WHITE);
	    screen.setPreferredSize(new Dimension(400,80));

	    this.add(screen, BorderLayout.NORTH);

	    // Panel botones
	    JPanel buttonPanel = new JPanel();
	    buttonPanel.setLayout(new GridLayout(5,4,10,10));
	    buttonPanel.setBackground(new Color(18,18,18));

	    // Fila 1
	    JButton ce = new JButton("CE");
	    ce.setFont(new Font("Arial", Font.BOLD, 20));
	    ce.setBackground(new Color(120,45,45));
	    ce.setForeground(Color.WHITE);
	    ce.setFocusPainted(false);
	    ce.setBorderPainted(false);
	    buttonPanel.add(ce);

	    JButton div = new JButton("/");
	    div.setFont(new Font("Arial", Font.BOLD, 20));
	    div.setBackground(new Color(255,149,0));
	    div.setForeground(Color.WHITE);
	    div.setFocusPainted(false);
	    div.setBorderPainted(false);
	    buttonPanel.add(div);

	    JButton mul = new JButton("*");
	    mul.setFont(new Font("Arial", Font.BOLD, 20));
	    mul.setBackground(new Color(255,149,0));
	    mul.setForeground(Color.WHITE);
	    mul.setFocusPainted(false);
	    mul.setBorderPainted(false);
	    buttonPanel.add(mul);

	    JButton menos = new JButton("-");
	    menos.setFont(new Font("Arial", Font.BOLD, 20));
	    menos.setBackground(new Color(255,149,0));
	    menos.setForeground(Color.WHITE);
	    menos.setFocusPainted(false);
	    menos.setBorderPainted(false);
	    buttonPanel.add(menos);

	    // Fila 2
	    JButton b7 = new JButton("7");
	    b7.setFont(new Font("Arial", Font.BOLD, 20));
	    b7.setBackground(new Color(50,50,50));
	    b7.setForeground(Color.WHITE);
	    b7.setFocusPainted(false);
	    b7.setBorderPainted(false);
	    buttonPanel.add(b7);

	    JButton b8 = new JButton("8");
	    b8.setFont(new Font("Arial", Font.BOLD, 20));
	    b8.setBackground(new Color(50,50,50));
	    b8.setForeground(Color.WHITE);
	    b8.setFocusPainted(false);
	    b8.setBorderPainted(false);
	    buttonPanel.add(b8);

	    JButton b9 = new JButton("9");
	    b9.setFont(new Font("Arial", Font.BOLD, 20));
	    b9.setBackground(new Color(50,50,50));
	    b9.setForeground(Color.WHITE);
	    b9.setFocusPainted(false);
	    b9.setBorderPainted(false);
	    buttonPanel.add(b9);

	    JButton mas = new JButton("+");
	    mas.setFont(new Font("Arial", Font.BOLD, 20));
	    mas.setBackground(new Color(255,149,0));
	    mas.setForeground(Color.WHITE);
	    mas.setFocusPainted(false);
	    mas.setBorderPainted(false);
	    buttonPanel.add(mas);

	    // Fila 3
	    JButton b4 = new JButton("4");
	    b4.setFont(new Font("Arial", Font.BOLD, 20));
	    b4.setBackground(new Color(50,50,50));
	    b4.setForeground(Color.WHITE);
	    b4.setFocusPainted(false);
	    b4.setBorderPainted(false);
	    buttonPanel.add(b4);

	    JButton b5 = new JButton("5");
	    b5.setFont(new Font("Arial", Font.BOLD, 20));
	    b5.setBackground(new Color(50,50,50));
	    b5.setForeground(Color.WHITE);
	    b5.setFocusPainted(false);
	    b5.setBorderPainted(false);
	    buttonPanel.add(b5);

	    JButton b6 = new JButton("6");
	    b6.setFont(new Font("Arial", Font.BOLD, 20));
	    b6.setBackground(new Color(50,50,50));
	    b6.setForeground(Color.WHITE);
	    b6.setFocusPainted(false);
	    b6.setBorderPainted(false);
	    buttonPanel.add(b6);

	    JButton igual = new JButton("=");
	    igual.setFont(new Font("Arial", Font.BOLD, 20));
	    igual.setBackground(new Color(255,149,0));
	    igual.setForeground(Color.WHITE);
	    igual.setFocusPainted(false);
	    igual.setBorderPainted(false);
	    buttonPanel.add(igual);

	    // Fila 4
	    JButton b1 = new JButton("1");
	    b1.setFont(new Font("Arial", Font.BOLD, 20));
	    b1.setBackground(new Color(50,50,50));
	    b1.setForeground(Color.WHITE);
	    b1.setFocusPainted(false);
	    b1.setBorderPainted(false);
	    buttonPanel.add(b1);

	    JButton b2 = new JButton("2");
	    b2.setFont(new Font("Arial", Font.BOLD, 20));
	    b2.setBackground(new Color(50,50,50));
	    b2.setForeground(Color.WHITE);
	    b2.setFocusPainted(false);
	    b2.setBorderPainted(false);
	    buttonPanel.add(b2);

	    JButton b3 = new JButton("3");
	    b3.setFont(new Font("Arial", Font.BOLD, 20));
	    b3.setBackground(new Color(50,50,50));
	    b3.setForeground(Color.WHITE);
	    b3.setFocusPainted(false);
	    b3.setBorderPainted(false);
	    buttonPanel.add(b3);

	    JButton b0 = new JButton("0");
	    b0.setFont(new Font("Arial", Font.BOLD, 20));
	    b0.setBackground(new Color(50,50,50));
	    b0.setForeground(Color.WHITE);
	    b0.setFocusPainted(false);
	    b0.setBorderPainted(false);
	    buttonPanel.add(b0);

	    // Fila 5
	    JButton punto = new JButton(".");
	    punto.setFont(new Font("Arial", Font.BOLD, 20));
	    punto.setBackground(new Color(50,50,50));
	    punto.setForeground(Color.WHITE);
	    punto.setFocusPainted(false);
	    punto.setBorderPainted(false);
	    buttonPanel.add(punto);

	    buttonPanel.add(new JLabel());
	    buttonPanel.add(new JLabel());
	    buttonPanel.add(new JLabel());

	    this.add(buttonPanel, BorderLayout.CENTER);

	    this.revalidate();
	    this.repaint();
	}
	
	public void interes()
	{
		this.setTitle("Interes");
	    this.setSize(400,500);
	    this.setLayout(new BorderLayout(2,20));
	    this.getContentPane().setBackground(Color.WHITE);

	    // Panel titulo
	    JPanel titulo = new JPanel();
	    titulo.setBackground(Color.WHITE);
	    
	    JLabel texto = new JLabel("Calcular interés");
	    texto.setFont(new Font("Serif", Font.BOLD, 22));
	    texto.setForeground(Color.RED);
	    
	    titulo.add(texto);
	    this.add(titulo, BorderLayout.NORTH);
	    
	    JPanel formulario = new JPanel();
	    formulario.setBackground(new Color(144,238,144));
	    formulario.setLayout(new GridLayout(5,2,10,10));
	    
	    formulario.add(new JLabel("Capital:"));
	    JTextField capital = new JTextField();
	    formulario.add(capital);
	    
	    formulario.add(new JLabel("Tiempo:"));
	    JTextField tiempo = new JTextField();
	    formulario.add(tiempo);
	    
	    formulario.add(new JLabel("Tasas interés:"));
	    JTextField tasa = new JTextField();
	    formulario.add(tasa);
	    
	    JButton calcular = new JButton("Calcular");
	    formulario.add(calcular);
	    
	    JButton cancelar = new JButton("Cancelar");
	    formulario.add(cancelar);
	    
	    this.add(formulario, BorderLayout.CENTER);
	    
	    JPanel resultado = new JPanel();
	    
	    resultado.setBackground(new Color(240,128,128));
	    resultado.setLayout(new GridLayout(2,2,10,10));

	    resultado.add(new JLabel("Interés:"));
	    JTextField interes = new JTextField();
	    resultado.add(interes);
	    
	    resultado.add(new JLabel("Monto:"));
	    JTextField monto = new JTextField();
	    resultado.add(monto);
	    
	    this.add(resultado, BorderLayout.SOUTH);
	    
	    
	}
	
	public void pruebaIcono()
	{
	    this.setTitle("Ajolote");

		// icono ventana
	
	    ImageIcon icono = new ImageIcon(getClass().getResource("img/axolotl.png"));
	    Image img = icono.getImage();
	    this.setIconImage(img);

	    ImageIcon logo = new ImageIcon(getClass().getResource("img/axolotl.png"));
	    Image escalado = logo.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	    logo = new ImageIcon(escalado);

	    JLabel imagen = new JLabel(logo);
	    imagen.setBounds(10, 10, 200, 200);

	    this.add(imagen);
	}
	
	public void pintar()
	{
		JPanel pane = new JPanel() 
		{
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                g2d.setStroke(new BasicStroke(2));
                g2d.setColor(Color.BLUE);
                g2d.drawLine(0, 0, 100, 100);
                
                g2d.setStroke(new BasicStroke(2));
                g2d.setColor(Color.RED);
                g2d.drawLine(200, 200, 500, 200);
                
                g2d.setColor(Color.GREEN);
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRect(250, 250, 100, 100);
                
                g2d.setColor(Color.CYAN);
                g2d.setStroke(new BasicStroke(2));
                g2d.drawOval(400, 100, 90, 30);
                
                g2d.setColor(Color.MAGENTA);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawArc(300, 100, 100, 100, 0, 180);
               
                g2d.setColor(Color.YELLOW);
                g2d.drawPolygon(new int [] {200, 100, 300}, new int [] {100, 300, 500}, 3);
                
                g2d.setColor(Color.ORANGE);
                g2d.fillRect(500, 300, 100, 100);
                
                g2d.setColor(Color.BLUE);
                g2d.fillOval(400,  200,  100,  100);
                
                g2d.fillArc(300,  300,  100,  100, 0,  300);
                
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fillPolygon(new int [] {600, 300, 500}, new int [] {400, 300, 500}, 3);
                
            }
        };
        
        pane.setSize(1000, 700);
        pane.setLocation(0 ,0);
        this.add(pane);
	}
	
	public void casa()
	{
		JPanel pane = new JPanel() 
		{
            @Override
            protected void paintComponent(Graphics g) 
            {
            	super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                // cielo
                g2d.setColor(Color.decode("#0A1744"));
                g2d.fillRect(0,0,1000,300);
                
                // estrellas
                g2d.setColor(Color.WHITE);
                
                g2d.fillOval(50,40,3,4);
                g2d.fillOval(120,70,2,2);
                g2d.fillOval(200,50,4,4);
                g2d.fillOval(300,90,2,2);
                g2d.fillOval(420,30,3,3);
                g2d.fillOval(500,80,2,2);
                g2d.fillOval(600,60,3,3);
                g2d.fillOval(720,40,2,2);
                g2d.fillOval(800,70,3,3);
                g2d.fillOval(900,50,2,2);
                g2d.fillOval(150,110,4,4);
                g2d.fillOval(350,120,2,2);
                g2d.fillOval(650,100,4,4);
                g2d.fillOval(850,120,4,2);

                // luna
                g2d.setColor(new Color(230,230,200));
                g2d.fillOval(800,50,80,80);
                
                g2d.setStroke(new BasicStroke(4));
                g2d.setColor(new Color(255,255,230));
                g2d.drawOval(800,50,80,80);
                
                g2d.setStroke(new BasicStroke(1));
                
                // luna - crateres
                g2d.setColor(new Color(200,200,180));
                g2d.fillOval(820,70,10,10);
                g2d.fillOval(850,80,8,8);
                g2d.fillOval(830,95,6,6);
                
                // pasto
                g2d.setColor(Color.decode("#1E5F1B"));
                g2d.fillRect(0,300,1000,400);

                // casa
                g2d.setColor(Color.decode("#E8E8E8"));
                g2d.fillRect(350,220,200,150);

                // techo
                g2d.setColor(Color.decode("#A52A2A"));
                g2d.fillPolygon(new int[]{330,470,570}, new int[]{220,120,220}, 3);

                // puerta
                g2d.setColor(Color.decode("#5C3A21"));
                g2d.fillRect(430,270,50,100);

                // perilla
                g2d.setColor(Color.decode("#919190"));
                g2d.fillOval(470,320,8,8);

                // ventana
                g2d.setColor(Color.decode("#FFF2A8"));
                g2d.fillRect(500,250,50,40);

                // cruz ventana
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.drawLine(525,250,525,290);
                g2d.drawLine(500,270,550,270);

                // chimenea
                g2d.setColor(Color.decode("#6E6E6E"));
                g2d.fillRect(480,160,30,40);
                
                // humo
                g2d.setColor(new Color(220,220,220));

                g2d.fillOval(495,130,18,18);
                g2d.fillOval(505,110,22,22);
                g2d.fillOval(495,90,26,26);
                g2d.fillOval(510,65,30,30);

                // cerca 
                
                g2d.setColor(Color.decode("#C49D5C"));
                g2d.fillRect(600,300,20,50);
                g2d.fillPolygon(new int[]{600,610,620}, new int[]{300,270,300},3);

                g2d.fillRect(640,300,20,50);
                g2d.fillPolygon(new int[]{640,650,660}, new int[]{300,270,300},3);

                g2d.fillRect(680,300,20,50);
                g2d.fillPolygon(new int[]{680,690,700}, new int[]{300,270,300},3);

                g2d.fillRect(720,300,20,50);
                g2d.fillPolygon(new int[]{720,730,740}, new int[]{300,270,300},3);

                g2d.fillRect(760,300,20,50);
                g2d.fillPolygon(new int[]{760,770,780}, new int[]{300,270,300},3);

                g2d.fillRect(800,300,20,50);
                g2d.fillPolygon(new int[]{800,810,820}, new int[]{300,270,300},3);
                
            }
        };
        
        pane.setSize(1000, 700);
        pane.setLocation(0 ,0);
        this.add(pane);
	}


	public static void main(String[] args) 
	{
		new Ventana();
	}
}