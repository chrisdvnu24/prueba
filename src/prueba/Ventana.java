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
	// Variables globales
	boolean turnoDeX = true; 
    int[][] matrizLogica = new int[3][3]; 
    BotonGato[][] botones = new BotonGato[3][3]; 
    int victoriasX = 0;
    int victoriasO = 0;
    JLabel lblX, lblO, lblTurno;
    
    Color colorX = new Color(92, 222, 255); // Azul cian
    Color colorO = new Color(255, 92, 92);  // Rojo
    
    Color fondoBoton = new Color(60, 60, 60); 	 // Gris
    Color textoBoton = Color.WHITE; 			
    Color colorBorde = new Color(100, 100, 100); // Gris claro
    
    Color fondoVentana = new Color(28, 28, 28); // Gris oscuro
    Color fondoTablero = new Color(45, 45, 45); // Gris intermedio
	public Ventana() 
	{
		
		
		//this.setSize(360, 480);
		this.setSize(1000, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		//this.setResizable(false);
		
		
		
		//calculadoraLayout();
		//login();
		//registro();
		//usuarios();
		//calculadora();
		//interes();
		//pruebaIcono();
		//pintar();
		//casa();
		//mario();
		//menu();
		diseñoGato();
		
		this.setVisible(true);
	}

	
	public void router(String target)
    {
        this.getContentPane().removeAll();

        if (target.equals("login"))
        {
            this.login();
        }
        else if (target.equals("registro"))
        {
            this.registro();
        }
        else if (target.equals("recuperar"))
        {
        		this.recuperar();
        }
        
        else if (target.equals("alta"))
        {
        		this.alta();
        }
        
        else if (target.equals("baja"))
        {
        		this.baja();
        }
        
        else if (target.equals("consultar"))
        {
        		this.consultar();
        }
        
       
        else if (target.equals("ayudaUsuario"))
        {
        		this.ayudaUsuario();
        }
        
        else if (target.equals("ayudaSistema"))
        {
        		this.ayudaSistema();
        }
        
        else if (target.equals("ayudaContrasena"))
        {
        		this.ayudaContrasena();
        }
        this.revalidate();
        this.repaint();
    }
	
	public void menu()
	{
		// barra menu
	    JMenuBar barra = new JMenuBar();
	    JMenu navegacion = new JMenu("Cuenta");
	    
	    JMenuItem itemLogin = new JMenuItem("Ir a Login");
	    JMenuItem itemRegistro = new JMenuItem("Ir a Registro");
	    JMenuItem itemRecuperar = new JMenuItem("Recuperar contrasena");
	    
	    // eventos menu
	    itemLogin.addActionListener(e -> login());
	    itemRegistro.addActionListener(e -> registro());
	    itemRecuperar.addActionListener(e -> recuperar());
	    
	    navegacion.add(itemLogin);
	    navegacion.add(itemRegistro);
	    navegacion.add(itemRecuperar);
	    
	    barra.add(navegacion);
	    
	    JMenu usuarios = new JMenu("Usuarios");
	    
	    JMenuItem itemAlta = new JMenuItem("Dar de alta");
	    JMenuItem itemBaja = new JMenuItem("Dar de baja");
	    JMenuItem itemConsultar = new JMenuItem("Consultar usuario");
	    
	    // eventos menu
	    itemAlta.addActionListener(e -> alta());
	    itemBaja.addActionListener(e -> baja());
	    itemConsultar.addActionListener(e -> consultar());
	    
	    usuarios.add(itemAlta);
	    usuarios.add(itemBaja);
	    usuarios.add(itemConsultar);
	    
	    barra.add(usuarios);
	    
	    JMenu ayuda = new JMenu("Ayuda");
	    
	    JMenuItem itemAyudaUsuario = new JMenuItem("Crear un usuario");
	    JMenuItem itemAyudaSistema = new JMenuItem("Acceder al sistema");
	    JMenuItem itemAyudaContrasena = new JMenuItem("Contrasena olvidada");
	    
	    // eventos menu
	    itemAyudaUsuario.addActionListener(e -> ayudaUsuario());
	    itemAyudaSistema.addActionListener(e -> ayudaSistema());
	    itemAyudaContrasena.addActionListener(e -> ayudaContrasena());
	    
	    ayuda.add(itemAyudaUsuario);
	    ayuda.add(itemAyudaSistema);
	    ayuda.add(itemAyudaContrasena);
	    
	    barra.add(ayuda);
	    
	    this.setJMenuBar(barra);
	}
	



    public void login()
    {
        this.setTitle("Login");
        this.getContentPane().removeAll();
        this.setLayout(null);

        // background img
        JLabel fondo = new JLabel();
        fondo.setBounds(0, 0, 1000, 650);
        try
        {
            fondo.setIcon(new ImageIcon(getClass().getResource("fondo.jpg")));
        }
        catch (Exception e)
        {
            System.out.println("No se encontró fondo.jpg");
        }
        fondo.setLayout(null);
        this.add(fondo);

        // Panel transparente del centro
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

        // cargar iconos de usuario y candado
        JLabel iconUser = new JLabel();
        JLabel iconPass = new JLabel();
        try
        {
            ImageIcon userIcon = new ImageIcon(getClass().getResource("user.png"));
            Image imgUser = userIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            iconUser.setIcon(new ImageIcon(imgUser));

            ImageIcon passIcon = new ImageIcon(getClass().getResource("lock.png"));
            Image imgPass = passIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            iconPass.setIcon(new ImageIcon(imgPass));
        }
        catch (Exception e)
        {
            // en caso de que los iconos fallen, no hacer nada
        }

        // campo usuario
        JLabel labelUsuario = new JLabel("Usuario");
        labelUsuario.setBounds(80, 95, 260, 20);
        labelUsuario.setForeground(Color.WHITE);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(labelUsuario);

        JTextField usuario = new JTextField();
        usuario.setBorder(null);

        JPanel userPanel = new JPanel(new BorderLayout());
        userPanel.setBounds(80, 120, 260, 35);
        userPanel.setBackground(Color.WHITE);
        userPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
        userPanel.add(iconUser, BorderLayout.WEST);
        userPanel.add(usuario, BorderLayout.CENTER);
        panel.add(userPanel);

        // campo contraseña
        JLabel labelPass = new JLabel("Contraseña");
        labelPass.setBounds(80, 165, 260, 20);
        labelPass.setForeground(Color.WHITE);
        labelPass.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(labelPass);

        JPasswordField pass = new JPasswordField();
        pass.setBorder(null);

        JPanel passPanel = new JPanel(new BorderLayout());
        passPanel.setBounds(80, 190, 260, 35);
        passPanel.setBackground(Color.WHITE);
        passPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
        passPanel.add(iconPass, BorderLayout.WEST);
        passPanel.add(pass, BorderLayout.CENTER);
        panel.add(passPanel);

        // boton login con hover
        JButton loginBtn = new JButton("Iniciar sesión");
        loginBtn.setBounds(125, 260, 150, 45);
        loginBtn.setBackground(new Color(255, 155, 68));
        loginBtn.setFocusPainted(false);
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
                String user_val = usuario.getText();
                String pass_val = new String(pass.getPassword());

                // datos prueba login
                String correctUser = "admin@gmail.com";
                String correctPass = "1234";

                boolean error = false;

                // validar credenciales (para que no sean vacias)
                if (user_val.equals(""))
                {
                    userPanel.setBorder(new LineBorder(Color.RED, 1, true));
                    error = true;
                }
                else
                {
                    userPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
                }

                if (pass_val.equals(""))
                {
                    passPanel.setBorder(new LineBorder(Color.RED, 1, true));
                    error = true;
                }
                else
                {
                    passPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
                }

                if (error)
                {
                    JOptionPane.showMessageDialog(null, "Rellena los campos", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // validar credenciales
                if (user_val.equals(correctUser) && pass_val.equals(correctPass))
                {
                    JOptionPane.showMessageDialog(null, "¡Bienvenido!");
                    userPanel.setBorder(new LineBorder(Color.GREEN, 1, true));
                    passPanel.setBorder(new LineBorder(Color.GREEN, 1, true));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                    userPanel.setBorder(new LineBorder(Color.RED, 1, true));
                    passPanel.setBorder(new LineBorder(Color.RED, 1, true));
                }
            }
        });

        // boton saltar al registro
        JButton registro1 = new JButton("¿Aún no tienes cuenta?");
        registro1.setBounds(100, 320, 200, 30);
        registro1.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(registro1);

        registro1.addActionListener(e -> router("registro"));
        
        JButton recuperar = new JButton("Olvidaste tu contrasena?");
        recuperar.setBounds(90, 360, 220, 30);
        recuperar.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(recuperar);

        recuperar.addActionListener(e -> router("recuperar"));


        this.revalidate();
        this.repaint();
    }

    public void registro()
    {
        this.setTitle("Registro");
        this.getContentPane().removeAll();
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(28, 28, 28));

        // Cuadro principal
        JPanel regPanel = new JPanel();
        regPanel.setBounds(250, 50, 500, 500);
        regPanel.setLayout(null);
        regPanel.setBackground(new Color(45, 45, 45));
        this.add(regPanel);

        JLabel tituloReg = new JLabel("Nueva cuenta");
        tituloReg.setBounds(100, 30, 300, 50);
        tituloReg.setFont(new Font("Arial", Font.BOLD, 30));
        tituloReg.setForeground(Color.WHITE);
        tituloReg.setHorizontalAlignment(SwingConstants.CENTER);
        regPanel.add(tituloReg);

        // Usuario
        JLabel lblUser = new JLabel("Usuario:");
        lblUser.setBounds(60, 110, 300, 30);
        lblUser.setForeground(Color.WHITE);
        regPanel.add(lblUser);

        JTextField usuario_registro = new JTextField();
        usuario_registro.setBorder(null);

        JLabel iconUser = new JLabel();
        try 
        {
            ImageIcon userIcon = new ImageIcon(getClass().getResource("user.png"));
            Image imgUser = userIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            iconUser.setIcon(new ImageIcon(imgUser));
        } 
        catch (Exception e)
        {
            System.out.println("No se encontró user.png");
        }

        JPanel userPanel = new JPanel(new BorderLayout());
        userPanel.setBounds(60, 140, 380, 35);
        userPanel.setBackground(Color.WHITE);
        userPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));

        JPanel userIconPanel = new JPanel(new BorderLayout());
        userIconPanel.setBackground(Color.WHITE);
        userIconPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        userIconPanel.add(iconUser, BorderLayout.CENTER);

        userPanel.add(userIconPanel, BorderLayout.WEST);
        userPanel.add(usuario_registro, BorderLayout.CENTER);
        regPanel.add(userPanel);

        // Contraseña
        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(60, 190, 300, 30);
        lblPass.setForeground(Color.WHITE);
        regPanel.add(lblPass);

        JPasswordField pass_registro = new JPasswordField();
        pass_registro.setBorder(null);

        JLabel iconPass = new JLabel();
        try
        {
            ImageIcon passIcon = new ImageIcon(getClass().getResource("lock.png"));
            Image imgPass = passIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            iconPass.setIcon(new ImageIcon(imgPass));
        }
        catch (Exception e)
        {
            System.out.println("No se encontró lock.png");
        }

        JPanel passPanel = new JPanel(new BorderLayout());
        passPanel.setBounds(60, 220, 380, 35);
        passPanel.setBackground(Color.WHITE);
        passPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));

        JPanel passIconPanel = new JPanel(new BorderLayout());
        passIconPanel.setBackground(Color.WHITE);
        passIconPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        passIconPanel.add(iconPass, BorderLayout.CENTER);

        passPanel.add(passIconPanel, BorderLayout.WEST);
        passPanel.add(pass_registro, BorderLayout.CENTER);
        regPanel.add(passPanel);

        // Botón crear
        JButton crearBtn = new JButton("Crear cuenta");
        crearBtn.setBounds(125, 300, 250, 45);
        crearBtn.setBackground(new Color(255, 155, 68));
        crearBtn.setForeground(Color.WHITE);
        crearBtn.setFocusPainted(false);
        crearBtn.setBorder(new LineBorder(Color.WHITE, 2, true));
        regPanel.add(crearBtn);

        crearBtn.addActionListener(e -> {
            String user = usuario_registro.getText();
            String pass = new String(pass_registro.getPassword());

            if (user.equals("") || pass.equals("")) {
                userPanel.setBorder(new LineBorder(Color.RED, 1, true));
                passPanel.setBorder(new LineBorder(Color.RED, 1, true));
                JOptionPane.showMessageDialog(null, "Por favor, rellena todos los campos.");
            } else {
                userPanel.setBorder(new LineBorder(Color.GREEN, 1, true));
                passPanel.setBorder(new LineBorder(Color.GREEN, 1, true));
                JOptionPane.showMessageDialog(null, "¡Cuenta creada exitosamente!");
            }
        });

        // Botón volver
        JButton volver = new JButton("Volver al Login");
        volver.setBounds(150, 430, 200, 35);
        volver.setBackground(new Color(90, 90, 90));
        volver.setForeground(Color.WHITE);
        volver.setFocusPainted(false);
        volver.setBorder(new LineBorder(Color.WHITE, 2, true));
        regPanel.add(volver);
        volver.addActionListener(e -> router("login"));

        this.revalidate();
        this.repaint();
    }
    
	public void usuarios()
	{
		JPanel users = new JPanel();
		users.setSize(800,500);
		users.setLocation(100, 50);
		users.setBackground(Color.WHITE);
		users.setLayout(null);    		
		this.add(users);   

		JLabel users_title = new JLabel("Usuarios");
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
	
	public void mario()
	{
	    JPanel pane = new JPanel() 
	    {
	        @Override
	        protected void paintComponent(Graphics g) 
	        {
	            super.paintComponent(g);
	            Graphics2D g2d = (Graphics2D) g;

	            // cielo
	            g2d.setColor(Color.decode("#92E8FF"));
	            g2d.fillRect(0, 0, 1000, 700);

	            // suelo
	            g2d.setColor(Color.decode("#945D31"));
	            g2d.fillRect(0, 480, 1000, 220); 

	            // contorno suelo
	            g2d.setColor(Color.decode("#FFAA6D"));
	            g2d.fillRect(0, 450, 1000, 30); 

	            // arbuste
	            g2d.setColor(Color.decode("#008A00"));
	            g2d.fillOval(40, 410, 50, 50);
	            g2d.fillOval(70, 380, 60, 80);
	            g2d.fillOval(110, 410, 50, 50);

	            // sombra negra
	            g2d.setColor(Color.BLACK);
	            g2d.fillRect(450, 240, 30, 210); 
	            g2d.fillRect(340, 420, 140, 20); 

	            // bloque azul
	            g2d.setColor(Color.decode("#84BAFF"));
	            g2d.fillRect(320, 230, 130, 220);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(320, 230, 130, 220);
	            
	            // tornillos bloque azul
	            g2d.setColor(Color.LIGHT_GRAY);
	            g2d.fillRect(330, 240, 12, 12);
	            g2d.fillRect(428, 240, 12, 12);
	            g2d.fillRect(330, 428, 12, 12);
	            g2d.fillRect(428, 428, 12, 12);

	            // bloque rosa
	            g2d.setColor(Color.decode("#FFB2AD"));
	            g2d.fillRect(230, 330, 150, 120);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(230, 330, 150, 120);
	            
	            // tornillos bloque rosa
	            g2d.setColor(Color.LIGHT_GRAY);
	            g2d.fillRect(240, 340, 12, 12);
	            g2d.fillRect(358, 340, 12, 12);
	            g2d.fillRect(240, 428, 12, 12);
	            g2d.fillRect(358, 428, 12, 12);

	            // tubo verde
	            g2d.setColor(Color.decode("#008000"));
	            g2d.fillRect(555, 380, 70, 70);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(555, 380, 70, 70);
	            
	            g2d.setColor(Color.decode("#00A000"));
	            g2d.fillRect(545, 355, 90, 25);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(545, 355, 90, 25);

	            // caja verde
	            g2d.setColor(Color.decode("#00D050"));
	            g2d.fillRect(850, 330, 130, 120);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(850, 330, 130, 120);
	            
	            // tornillos caja verde
	            g2d.setColor(Color.LIGHT_GRAY);
	            g2d.fillRect(860, 340, 10, 10); 
	            g2d.fillRect(960, 340, 10, 10); 
	            g2d.fillRect(860, 430, 10, 10); 
	            g2d.fillRect(960, 430, 10, 10); 
	            

	            // ladrillos naranja
	            dibujarLadrillo(g2d, 100, 300);
	            dibujarLadrillo(g2d, 220, 150);
	            dibujarLadrillo(g2d, 260, 150);
	            dibujarLadrillo(g2d, 860, 280);
	        }

	        // metodo cuadros naranja
	        private void dibujarLadrillo(Graphics2D g2d, int x, int y) 
	        {
	            g2d.setColor(Color.decode("#FF8B51"));
	            g2d.fillRect(x, y, 40, 40);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(x, y, 40, 40);
	            
	            // 4 tornillos de las cajas
	            g2d.fillRect(x + 5, y + 5, 3, 3);
	            g2d.fillRect(x + 32, y + 5, 3, 3);
	            g2d.fillRect(x + 5, y + 32, 3, 3);
	            g2d.fillRect(x + 32, y + 32, 3, 3);
	        }
	    };

	    pane.setSize(1000, 700);
	    pane.setLocation(0, 0);
	    this.add(pane);
	}
	
	public void recuperar()
	{
	    this.setTitle("Recuperar contraseña");
	    this.getContentPane().removeAll();
	    this.setLayout(null);
	    this.getContentPane().setBackground(new Color(28, 28, 28));

	    // Panel principal
	    JPanel recPanel = new JPanel();
	    recPanel.setBounds(250, 50, 500, 500);
	    recPanel.setLayout(null);
	    recPanel.setBackground(new Color(45, 45, 45));
	    this.add(recPanel);

	    // Título
	    JLabel titulo = new JLabel("Recuperar contraseña");
	    titulo.setBounds(50, 30, 400, 40);
	    titulo.setFont(new Font("Arial", Font.BOLD, 28));
	    titulo.setForeground(Color.WHITE);
	    titulo.setHorizontalAlignment(SwingConstants.CENTER);
	    recPanel.add(titulo);

	    // Texto
	    JLabel texto = new JLabel("Introduce tu correo para enviar un enlace de recuperación");
	    texto.setBounds(50, 80, 400, 25);
	    texto.setForeground(Color.LIGHT_GRAY);
	    texto.setHorizontalAlignment(SwingConstants.CENTER);
	    recPanel.add(texto);

	    // Label correo
	    JLabel lblCorreo = new JLabel("Correo electrónico:");
	    lblCorreo.setBounds(60, 140, 300, 25);
	    lblCorreo.setForeground(Color.WHITE);
	    recPanel.add(lblCorreo);

	    // Campo correo + icono
	    JTextField correo = new JTextField();
	    correo.setBorder(null);

	    JLabel iconMail = new JLabel();
	    try {
	        ImageIcon mailIcon = new ImageIcon(getClass().getResource("mail.png"));
	        Image imgMail = mailIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	        iconMail.setIcon(new ImageIcon(imgMail));
	    } catch (Exception e) {
	        System.out.println("No se encontró mail.png");
	    }

	    JPanel mailPanel = new JPanel(new BorderLayout());
	    mailPanel.setBounds(60, 170, 380, 35);
	    mailPanel.setBackground(Color.WHITE);
	    mailPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));

	    JPanel iconContainer = new JPanel(new BorderLayout());
	    iconContainer.setBackground(Color.WHITE);
	    iconContainer.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
	    iconContainer.add(iconMail, BorderLayout.CENTER);

	    mailPanel.add(iconContainer, BorderLayout.WEST);
	    mailPanel.add(correo, BorderLayout.CENTER);

	    recPanel.add(mailPanel);

	    // Botón enviar
	    JButton enviarBtn = new JButton("Enviar enlace");
	    enviarBtn.setBounds(125, 260, 250, 45);
	    enviarBtn.setBackground(new Color(255, 155, 68));
	    enviarBtn.setForeground(Color.WHITE);
	    enviarBtn.setFocusPainted(false);
	    enviarBtn.setBorder(new LineBorder(Color.WHITE, 2, true));
	    recPanel.add(enviarBtn);

	    enviarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	            enviarBtn.setBackground(new Color(249, 176, 113));
	        }
	        public void mouseExited(java.awt.event.MouseEvent evt) {
	            enviarBtn.setBackground(new Color(255, 155, 68));
	        }
	    });

	    enviarBtn.addActionListener(e -> {
	        String email = correo.getText();

	        if (email.equals("")) {
	            mailPanel.setBorder(new LineBorder(Color.RED, 1, true));
	            JOptionPane.showMessageDialog(null, "Introduce un correo válido");
	        } else {
	            mailPanel.setBorder(new LineBorder(Color.GREEN, 1, true));
	            JOptionPane.showMessageDialog(null, "Se ha enviado el enlace de recuperación");
	        }
	    });

	    // Botón volver
	    JButton volverBtn = new JButton("Volver");
	    volverBtn.setBounds(150, 340, 200, 35);
	    volverBtn.setBackground(new Color(90, 90, 90));
	    volverBtn.setForeground(Color.WHITE);
	    volverBtn.setFocusPainted(false);
	    volverBtn.setBorder(new LineBorder(Color.WHITE, 2, true));
	    volverBtn.addActionListener(e -> router("login"));
	    recPanel.add(volverBtn);

	    this.revalidate();
	    this.repaint();
	}
	
	public void alta()
	{
		this.setTitle("Alta de usuario");
		this.getContentPane().removeAll();
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(28, 28, 28));

		JPanel panel = new JPanel();
		panel.setBounds(250, 50, 500, 550);
		panel.setBackground(new Color(45, 45, 45));
		panel.setLayout(null);
		this.add(panel);

		JLabel titulo = new JLabel("Alta de usuario");
		titulo.setBounds(50, 30, 400, 50);
		titulo.setFont(new Font("Arial", Font.BOLD, 28));
		titulo.setForeground(Color.WHITE);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(titulo);

		// Campo nombre_completo
		JLabel lblNombre = new JLabel("Nombre completo:");
		lblNombre.setBounds(60, 110, 300, 25);
		lblNombre.setForeground(Color.WHITE);
		panel.add(lblNombre);

		JTextField txtNombre = new JTextField();
		txtNombre.setBorder(null);

		JLabel iconUser = new JLabel();
		try
		{
			ImageIcon userIcon = new ImageIcon(getClass().getResource("user.png"));
			Image imgUser = userIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			iconUser.setIcon(new ImageIcon(imgUser));
		}
		catch (Exception ex)
		{
			System.out.println("No se encontró user.png");
		}

		JPanel namePanel = new JPanel(new BorderLayout());
		namePanel.setBounds(60, 140, 380, 35);
		namePanel.setBackground(Color.WHITE);
		namePanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));

		JPanel iconContainerUser = new JPanel(new BorderLayout());
		iconContainerUser.setBackground(Color.WHITE);
		iconContainerUser.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));
		iconContainerUser.add(iconUser, BorderLayout.CENTER);

		namePanel.add(iconContainerUser, BorderLayout.WEST);
		namePanel.add(txtNombre, BorderLayout.CENTER);
		panel.add(namePanel);

		// Campo correo
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(60, 200, 300, 25);
		lblCorreo.setForeground(Color.WHITE);
		panel.add(lblCorreo);

		JTextField txtCorreo = new JTextField();
		txtCorreo.setBorder(null);

		JLabel iconMail = new JLabel();
		try
		{
			ImageIcon mailIcon = new ImageIcon(getClass().getResource("mail.png"));
			Image imgMail = mailIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			iconMail.setIcon(new ImageIcon(imgMail));
		}
		catch (Exception ex)
		{
			System.out.println("No se encontró mail.png");
		}

		JPanel mailPanel = new JPanel(new BorderLayout());
		mailPanel.setBounds(60, 230, 380, 35);
		mailPanel.setBackground(Color.WHITE);
		mailPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));

		JPanel iconContainerMail = new JPanel(new BorderLayout());
		iconContainerMail.setBackground(Color.WHITE);
		iconContainerMail.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));
		iconContainerMail.add(iconMail, BorderLayout.CENTER);

		mailPanel.add(iconContainerMail, BorderLayout.WEST);
		mailPanel.add(txtCorreo, BorderLayout.CENTER);
		panel.add(mailPanel);

		// Botón guardar
		JButton guardar = new JButton("Guardar");
		guardar.setBounds(125, 320, 250, 45);
		guardar.setBackground(new Color(255, 155, 68));
		guardar.setForeground(Color.WHITE);
		guardar.setFocusPainted(false);
		guardar.setBorder(new LineBorder(Color.WHITE, 2, true));
		panel.add(guardar);
		
		guardar.addActionListener(e ->
		{
		    String nombre = txtNombre.getText().trim();
		    String correo = txtCorreo.getText().trim();
		    boolean error = false;

		    if (nombre.isEmpty())
		    {
		        namePanel.setBorder(new LineBorder(Color.RED, 1, true));
		        error = true;
		    }
		    else
		    {
		        namePanel.setBorder(new LineBorder(Color.GREEN, 1, true));
		    }

		    if (correo.isEmpty())
		    {
		        mailPanel.setBorder(new LineBorder(Color.RED, 1, true));
		        error = true;
		    }
		    else
		    {
		        mailPanel.setBorder(new LineBorder(Color.GREEN, 1, true));
		    }

		    if (error)
		    {
		        JOptionPane.showMessageDialog(null, "Completa todos los campos", "Aviso", JOptionPane.WARNING_MESSAGE);
		        return;
		    }

		    JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
		});

		// Botón volver
		JButton volver = new JButton("Volver");
		volver.setBounds(150, 400, 200, 35);
		volver.setBackground(new Color(90, 90, 90));
		volver.setForeground(Color.WHITE);
		volver.setFocusPainted(false);
		volver.setBorder(new LineBorder(Color.WHITE, 2, true));
		volver.addActionListener(e -> router("login"));
		panel.add(volver);

		this.revalidate();
		this.repaint();
	}
	
	public void baja()
	{
		this.setTitle("Baja de usuario");
		this.getContentPane().removeAll();
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(28, 28, 28));

		JPanel panel = new JPanel();
		panel.setBounds(250, 50, 500, 500);
		panel.setBackground(new Color(45, 45, 45));
		panel.setLayout(null);
		this.add(panel);

		JLabel titulo = new JLabel("Baja de usuario");
		titulo.setBounds(50, 30, 400, 50);
		titulo.setFont(new Font("Arial", Font.BOLD, 28));
		titulo.setForeground(Color.WHITE);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(titulo);

		JLabel lblId = new JLabel("ID o correo del usuario:");
		lblId.setBounds(60, 140, 300, 25);
		lblId.setForeground(Color.WHITE);
		panel.add(lblId);

		JTextField txtId = new JTextField();
		txtId.setBorder(null);

		JLabel iconDel = new JLabel();
		try
		{
			ImageIcon delIcon = new ImageIcon(getClass().getResource("user.png")); // O trash.png si tienes
			Image imgDel = delIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			iconDel.setIcon(new ImageIcon(imgDel));
		}
		catch (Exception ex)
		{
			System.out.println("No se encontró icono para baja");
		}

		JPanel idPanel = new JPanel(new BorderLayout());
		idPanel.setBounds(60, 170, 380, 35);
		idPanel.setBackground(Color.WHITE);
		idPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));

		JPanel iconContainer = new JPanel(new BorderLayout());
		iconContainer.setBackground(Color.WHITE);
		iconContainer.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));
		iconContainer.add(iconDel, BorderLayout.CENTER);

		idPanel.add(iconContainer, BorderLayout.WEST);
		idPanel.add(txtId, BorderLayout.CENTER);
		panel.add(idPanel);

		// Botón eliminar
		JButton eliminar = new JButton("Eliminar Usuario");
		eliminar.setBounds(125, 260, 250, 45);
		eliminar.setBackground(new Color(255, 155, 68));
		eliminar.setForeground(Color.WHITE);
		eliminar.setFocusPainted(false);
		eliminar.setBorder(new LineBorder(Color.WHITE, 2, true));
		panel.add(eliminar);
		
		eliminar.addActionListener(e ->
		{
		    String id = txtId.getText().trim();

		    if (id.isEmpty())
		    {
		        idPanel.setBorder(new LineBorder(Color.RED, 1, true));
		        JOptionPane.showMessageDialog(null, "Ingresa un ID o correo", "Aviso", JOptionPane.WARNING_MESSAGE);
		        return;
		    }

		    idPanel.setBorder(new LineBorder(Color.GREEN, 1, true));

		    int confirmar = JOptionPane.showConfirmDialog(
		        null,
		        "¿Seguro que quieres eliminar este usuario?",
		        "Confirmar",
		        JOptionPane.YES_NO_OPTION
		    );

		    if (confirmar == JOptionPane.YES_OPTION)
		    {
		        JOptionPane.showMessageDialog(null, "Usuario eliminado");
		    }
		});

		// Botón volver
		JButton volver = new JButton("Volver");
		volver.setBounds(150, 350, 200, 35);
		volver.setBackground(new Color(90, 90, 90));
		volver.setForeground(Color.WHITE);
		volver.setFocusPainted(false);
		volver.setBorder(new LineBorder(Color.WHITE, 2, true));
		volver.addActionListener(e -> router("login"));
		panel.add(volver);

		this.revalidate();
		this.repaint();
	}
	
	public void consultar()
	{
		this.setTitle("Consultar usuarios");
		this.getContentPane().removeAll();
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(28, 28, 28));

		JPanel panel = new JPanel();
		panel.setBounds(150, 50, 700, 550);
		panel.setBackground(new Color(45, 45, 45));
		panel.setLayout(null);
		this.add(panel);

		JLabel titulo = new JLabel("Consultar usuarios");
		titulo.setBounds(150, 20, 400, 40);
		titulo.setFont(new Font("Arial", Font.BOLD, 28));
		titulo.setForeground(Color.WHITE);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(titulo);

		// Buscador
		JPanel searchPanel = new JPanel(new BorderLayout());
		searchPanel.setBounds(60, 80, 400, 35);
		searchPanel.setBackground(Color.WHITE);
		searchPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));

		JTextField buscar = new JTextField();
		buscar.setBorder(null);
		
		JLabel iconSearch = new JLabel();
		try
		{
			ImageIcon searchIcon = new ImageIcon(getClass().getResource("search.png")); 
			Image imgSearch = searchIcon.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
			iconSearch.setIcon(new ImageIcon(imgSearch));
		}
		catch (Exception ex) { }

		JPanel iconContainer = new JPanel(new BorderLayout());
		iconContainer.setBackground(Color.WHITE);
		iconContainer.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));
		iconContainer.add(iconSearch, BorderLayout.CENTER);

		searchPanel.add(iconContainer, BorderLayout.WEST);
		searchPanel.add(buscar, BorderLayout.CENTER);
		panel.add(searchPanel);

		JButton buscarBtn = new JButton("Buscar");
		buscarBtn.setBounds(480, 80, 150, 35);
		buscarBtn.setBackground(new Color(255, 155, 68));
		buscarBtn.setForeground(Color.WHITE);
		buscarBtn.setFocusPainted(false);
		buscarBtn.setBorder(new LineBorder(Color.WHITE, 1, true));
		panel.add(buscarBtn);
		
		buscarBtn.addActionListener(e ->
		{
		    String dato = buscar.getText().trim();

		    if (dato.isEmpty())
		    {
		        searchPanel.setBorder(new LineBorder(Color.RED, 1, true));
		        JOptionPane.showMessageDialog(null, "Escribe algo para buscar", "Aviso", JOptionPane.WARNING_MESSAGE);
		        return;
		    }

		    searchPanel.setBorder(new LineBorder(Color.GREEN, 1, true));
		    JOptionPane.showMessageDialog(null, "Búsqueda realizada");
		});

		// Tabla
		String[] columnas = {"ID", "Nombre", "Correo"};
		String[][] data = {
			{"1", "Juan Pérez", "juan@example.com"},
			{"2", "María García", "maria@example.com"},
			{"3", "Carlos López", "carlos@example.com"},
			{"4", "Ana Martínez", "ana@example.com"}
		};

		JTable tabla = new JTable(data, columnas);
		tabla.setRowHeight(25);
		tabla.getTableHeader().setBackground(new Color(60, 60, 60));
		tabla.getTableHeader().setForeground(Color.WHITE);
		tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
		
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(60, 140, 580, 280);
		scroll.setBorder(new LineBorder(new Color(90, 90, 90), 1));
		panel.add(scroll);

		// Botón volver
		JButton volver = new JButton("Volver");
		volver.setBounds(250, 450, 200, 35);
		volver.setBackground(new Color(90, 90, 90));
		volver.setForeground(Color.WHITE);
		volver.setFocusPainted(false);
		volver.setBorder(new LineBorder(Color.WHITE, 1, true));
		volver.addActionListener(e -> router("login"));
		panel.add(volver);

		this.revalidate();
		this.repaint();
	}
	
	public void ayudaUsuario()
	{
		this.setTitle("Ayuda - Usuario");
		this.getContentPane().removeAll();
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(28, 28, 28));

		JPanel panel = new JPanel();
		panel.setBounds(250, 50, 500, 500);
		panel.setBackground(new Color(45, 45, 45));
		panel.setLayout(null);
		this.add(panel);

		JLabel titulo = new JLabel("¿Cómo crear un usuario?");
		titulo.setBounds(50, 30, 400, 40);
		titulo.setFont(new Font("Arial", Font.BOLD, 26));
		titulo.setForeground(Color.WHITE);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(titulo);

		JPanel infoPanel = new JPanel(new BorderLayout());
		infoPanel.setBounds(60, 100, 380, 220);
		infoPanel.setBackground(new Color(60, 60, 60));
		infoPanel.setBorder(BorderFactory.createCompoundBorder(
			new LineBorder(new Color(100, 100, 100), 1, true),
			BorderFactory.createEmptyBorder(20, 20, 20, 20)
		));

		
		JTextArea texto = new JTextArea(
			"1. Ve al menú Usuarios → Alta.\n\n" +
			"2. Llena los datos solicitados (Nombre y Correo).\n\n" +
			"3. Pulsa el botón 'Guardar' para finalizar el proceso."
		);
		texto.setEditable(false);
		texto.setWrapStyleWord(true);
		texto.setLineWrap(true);
		texto.setBackground(new Color(60, 60, 60));
		texto.setForeground(Color.WHITE);
		texto.setFont(new Font("Arial", Font.PLAIN, 15));
		
		infoPanel.add(texto, BorderLayout.CENTER);
		panel.add(infoPanel);

		// Botón volver 
		JButton volver = new JButton("Volver");
		volver.setBounds(150, 380, 200, 40);
		volver.setBackground(new Color(90, 90, 90));
		volver.setForeground(Color.WHITE);
		volver.setFocusPainted(false);
		volver.setFont(new Font("Arial", Font.BOLD, 14));
		volver.setBorder(new LineBorder(Color.WHITE, 1, true));
		volver.addActionListener(e -> router("login"));
		panel.add(volver);

		this.revalidate();
		this.repaint();
	}	
	
	public void ayudaSistema()
	{
		this.setTitle("Ayuda - Sistema");
		this.getContentPane().removeAll();
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(28, 28, 28));

		JPanel panel = new JPanel();
		panel.setBounds(250, 50, 500, 500);
		panel.setBackground(new Color(45, 45, 45));
		panel.setLayout(null);
		this.add(panel);

		JLabel titulo = new JLabel("Acceso al sistema");
		titulo.setBounds(50, 30, 400, 40);
		titulo.setFont(new Font("Arial", Font.BOLD, 26));
		titulo.setForeground(Color.WHITE);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(titulo);

		JPanel infoPanel = new JPanel(new BorderLayout());
		infoPanel.setBounds(60, 100, 380, 220);
		infoPanel.setBackground(new Color(60, 60, 60));
		infoPanel.setBorder(BorderFactory.createCompoundBorder(
			new LineBorder(new Color(100, 100, 100), 1, true),
			BorderFactory.createEmptyBorder(25, 25, 25, 25)
		));

		JTextArea texto = new JTextArea(
			"- Introduce correo y contraseña.\n\n" +
			"- Si no tienes cuenta, solicita un registro al administrador.\n\n" +
			"- Si olvidaste tu contraseña, utiliza la opción 'Recuperar' en el inicio."
		);
		texto.setEditable(false);
		texto.setWrapStyleWord(true);
		texto.setLineWrap(true);
		texto.setBackground(new Color(60, 60, 60));
		texto.setForeground(Color.WHITE);
		texto.setFont(new Font("Arial", Font.PLAIN, 15));

		infoPanel.add(texto, BorderLayout.CENTER);
		panel.add(infoPanel);

		// Botón volver
		JButton volver = new JButton("Volver");
		volver.setBounds(150, 380, 200, 40);
		volver.setBackground(new Color(90, 90, 90));
		volver.setForeground(Color.WHITE);
		volver.setFocusPainted(false);
		volver.setFont(new Font("Arial", Font.BOLD, 14));
		volver.setBorder(new LineBorder(Color.WHITE, 1, true));
		volver.addActionListener(e -> router("login"));
		panel.add(volver);

		this.revalidate();
		this.repaint();
	}
	
	public void ayudaContrasena()
	{
		this.setTitle("Ayuda - Contraseña");
		this.getContentPane().removeAll();
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(28, 28, 28));

		JPanel panel = new JPanel();
		panel.setBounds(250, 50, 500, 500);
		panel.setBackground(new Color(45, 45, 45));
		panel.setLayout(null);
		this.add(panel);

		JLabel titulo = new JLabel("¿Olvidaste tu contraseña?");
		titulo.setBounds(50, 30, 400, 40);
		titulo.setFont(new Font("Arial", Font.BOLD, 26));
		titulo.setForeground(Color.WHITE);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(titulo);

		JPanel infoPanel = new JPanel(new BorderLayout());
		infoPanel.setBounds(60, 100, 380, 220);
		infoPanel.setBackground(new Color(60, 60, 60));
		infoPanel.setBorder(BorderFactory.createCompoundBorder(
			new LineBorder(new Color(100, 100, 100), 1, true),
			BorderFactory.createEmptyBorder(25, 25, 25, 25)
		));

		JTextArea texto = new JTextArea(
			"1. En la pantalla principal, selecciona 'Recuperar contraseña'.\n\n" +
			"2. Ingresa la dirección de correo electrónico asociada a tu cuenta.\n\n" +
			"3. Revisa tu bandeja de entrada y sigue las instrucciones del mensaje."
		);
		texto.setEditable(false);
		texto.setWrapStyleWord(true);
		texto.setLineWrap(true);
		texto.setBackground(new Color(60, 60, 60));
		texto.setForeground(Color.WHITE);
		texto.setFont(new Font("Arial", Font.PLAIN, 15));

		infoPanel.add(texto, BorderLayout.CENTER);
		panel.add(infoPanel);

		// Botón volver
		JButton volver = new JButton("Volver");
		volver.setBounds(150, 380, 200, 40);
		volver.setBackground(new Color(90, 90, 90));
		volver.setForeground(Color.WHITE);
		volver.setFocusPainted(false);
		volver.setFont(new Font("Arial", Font.BOLD, 14));
		volver.setBorder(new LineBorder(Color.WHITE, 1, true));
		volver.addActionListener(e -> router("login"));
		panel.add(volver);

		this.revalidate();
		this.repaint();
	}
	
	public void diseñoGato()
    {
        this.setTitle("Juego gato");
        this.getContentPane().removeAll();
        this.setLayout(null);
        this.getContentPane().setBackground(fondoVentana);
        
        // Marcador - Label X
        lblX = new JLabel("X: 0");
        lblX.setBounds(320, 50, 100, 50);
        lblX.setForeground(textoBoton);
        lblX.setFont(new Font("Arial", Font.BOLD, 30));
        this.add(lblX);

        // Marcador - Label O
        lblO = new JLabel("O: 0");
        lblO.setBounds(620, 50, 100, 50);
        lblO.setForeground(textoBoton);
        lblO.setFont(new Font("Arial", Font.BOLD, 30));
        this.add(lblO);
        
        // Marcador - Label turno
        lblTurno = new JLabel("Turno de: X", SwingConstants.CENTER);
        lblTurno.setBounds(400, 60, 200, 30); 
        lblTurno.setForeground(colorX);
        lblTurno.setFont(new Font("Arial", Font.BOLD, 22));
        this.add(lblTurno);

        // Tablero
        JPanel tablero = new JPanel();
        tablero.setBounds(300, 90, 400, 400);
        tablero.setBackground(fondoTablero);
        tablero.setLayout(new GridLayout(3, 3, 10, 10));
        this.add(tablero);

        // Creación de botones
        for (int fila = 0; fila < 3; fila++)
        {
            for (int col = 0; col < 3; col++)
            {
                BotonGato boton = new BotonGato(fila, col);
                botones[fila][col] = boton; 
                tablero.add(boton);

                boton.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        BotonGato btn = (BotonGato) e.getSource();
                        
                        if (matrizLogica[btn.fila][btn.columna] == 0) 
                        {
                            btn.setText(turnoDeX ? "X" : "O");
                            btn.setForeground(turnoDeX ? colorX : colorO);
                            matrizLogica[btn.fila][btn.columna] = turnoDeX ? 1 : 2;
                            
                            turnoDeX = !turnoDeX;
                            lblTurno.setText(turnoDeX ? "Turno de: X" : "Turno de: O");
                            lblTurno.setForeground(turnoDeX ? colorX : colorO);
                            
                            verificarGanador();
                        }
                    }
                });
            }
        }

        // Botón reiniciar
        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setBounds(300, 500, 400, 50);
        btnReiniciar.setFont(new Font("Arial", Font.BOLD, 24));
        
        btnReiniciar.setBackground(fondoBoton); 
        btnReiniciar.setForeground(textoBoton); 
        btnReiniciar.setBorder(new LineBorder(colorBorde, 2)); 
        btnReiniciar.setFocusPainted(false);
        this.add(btnReiniciar);

        // Listener para el botón reiniciar
        btnReiniciar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                reiniciarTablero();
            }
        });

        this.revalidate();
        this.repaint();
    }
	
	public void verificarGanador()
    {
        int ganador = 0; 

        // Revisar filas y columnas
        // 0 = vacío, 1 = Jugador X, 2 = Jugador O
        for (int i = 0; i < 3; i++)
        {
            if (matrizLogica[i][0] != 0 && matrizLogica[i][0] == matrizLogica[i][1] && matrizLogica[i][0] == matrizLogica[i][2]) ganador = matrizLogica[i][0];
            if (matrizLogica[0][i] != 0 && matrizLogica[0][i] == matrizLogica[1][i] && matrizLogica[0][i] == matrizLogica[2][i]) ganador = matrizLogica[0][i];
        }

        // Revisar diagonales
        if (matrizLogica[0][0] != 0 && matrizLogica[0][0] == matrizLogica[1][1] && matrizLogica[0][0] == matrizLogica[2][2]) ganador = matrizLogica[0][0];
        if (matrizLogica[0][2] != 0 && matrizLogica[0][2] == matrizLogica[1][1] && matrizLogica[0][2] == matrizLogica[2][0]) ganador = matrizLogica[0][2];

        // ¿Hay empate?
        boolean empate = true;
        for(int f=0; f<3; f++) 
        {
            for(int c=0; c<3; c++) 
            {
                if(matrizLogica[f][c] == 0) empate = false;
            }
        }

        // Anuncio del ganador o empate
        if (ganador != 0)
        {
        	// Si ganador no es igual a 1 (X), se entiende que ganó el 2 (O)
            JOptionPane.showMessageDialog(this, ganador == 1 ? "¡X Gana!" : "¡O Gana!");
            if(ganador == 1) 
            {
            	victoriasX++; 
            }
        	else 
        	{
        		victoriasO++;
        	}

            // Actualizar el contador
            lblX.setText("X: " + victoriasX);
            lblO.setText("O: " + victoriasO);
            
            // Reinicio del tablero
            reiniciarTablero(); 
        } 
        
        // En caso de empate
        else if (empate) 
        {
            JOptionPane.showMessageDialog(this, "¡Empate!");
            reiniciarTablero();
        }
    }
	
	public void reiniciarTablero()
    {
        turnoDeX = true; 
        lblTurno.setText("Turno de: X");
        lblTurno.setForeground(colorX);
        
        for (int fila = 0; fila < 3; fila++)
        {
            for (int col = 0; col < 3; col++)
            {
                matrizLogica[fila][col] = 0; 
                botones[fila][col].setText(""); 
            }
        }
    }
	
    class BotonGato extends JButton
    {
        int fila;
        int columna;

        public BotonGato(int fila, int columna)
        {
            this.fila = fila;
            this.columna = columna;
            this.setFont(new Font("Arial", Font.BOLD, 60));
            this.setBackground(fondoBoton);
            this.setBorder(new LineBorder(colorBorde, 2));
            this.setForeground(textoBoton);
            this.setFocusPainted(false);
        }
    }

	public static void main(String[] args) 
	{
		new Ventana();
	}
}