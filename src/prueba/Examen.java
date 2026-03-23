package prueba;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;

public class Examen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Examen() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 966, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{30, 100, 70, 50, 200, 150, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 128));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Datos del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(5, 10, 5, 10);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 1;
		frame.getContentPane().add(panel_5, gbc_panel_5);
		panel_5.setLayout(new GridLayout(2, 4, 10, 10));
		
		panel_5.add(new JLabel("Documento:"));
		textField = new JTextField();
		panel_5.add(textField);
		
		panel_5.add(new JLabel("Nombres:"));
		textField_1 = new JTextField();
		panel_5.add(textField_1);
		
		panel_5.add(new JLabel("Dirección:"));
		textField_2 = new JTextField();
		panel_5.add(textField_2);
		
		panel_5.add(new JLabel("Teléfono:"));
		textField_3 = new JTextField();
		panel_5.add(textField_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Datos de factura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 10, 5, 10);
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		frame.getContentPane().add(panel_2, gbc_panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
		
		panel_2.add(new JLabel("N° Factura:"));
		JLabel lblNum = new JLabel("1"); lblNum.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNum);
		panel_2.add(new JLabel("Fecha:"));
		JLabel lblFec = new JLabel("2021/50/21"); lblFec.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblFec);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 10, 5, 10);
		gbc_panel_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 3;
		frame.getContentPane().add(panel_4, gbc_panel_4);
		panel_4.setLayout(new BorderLayout());
		
		JButton btnNewButton_2 = new JButton("Ver listado de facturas");
		panel_4.add(btnNewButton_2, BorderLayout.WEST);
		
		JPanel panel_6 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_6.setBackground(Color.WHITE);
		JButton btnAnadir = new JButton("Añadir");
		JButton btnEliminar = new JButton("Eliminar");
		panel_6.add(btnAnadir);
		panel_6.add(btnEliminar);
		panel_4.add(panel_6, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 10, 5, 10);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 4;
		frame.getContentPane().add(panel_3, gbc_panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Agua", "2", "500", "1000.0"},
				{"Cereal", "5", "1000", "5000.0"},
				{"Leche", "2", "300", "600.0"},
			},
			new String[] {"Producto", "Cantidad", "Valor", "Sub. total"}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null); 
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 10, 10, 10);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 5;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		
		JLabel lbl9 = new JLabel("Subtotal:"); lbl9.setBounds(50, 10, 80, 14); panel_1.add(lbl9);
		JLabel lbl10 = new JLabel("6600.0"); lbl10.setFont(new Font("Tahoma", Font.BOLD, 11)); lbl10.setBounds(150, 10, 80, 14); panel_1.add(lbl10);
		
		JLabel lbl11 = new JLabel("% Descuento:"); lbl11.setBounds(50, 35, 90, 14); panel_1.add(lbl11);
		textField_4 = new JTextField("5"); textField_4.setBounds(150, 32, 40, 20); panel_1.add(textField_4);
		
		JCheckBox chckbx = new JCheckBox(""); chckbx.setBackground(Color.WHITE); chckbx.setSelected(true); chckbx.setBounds(200, 31, 21, 23); panel_1.add(chckbx);
		
		JLabel lbl16 = new JLabel("Valor descontado:"); lbl16.setBounds(250, 35, 110, 14); panel_1.add(lbl16);
		JLabel lbl17 = new JLabel("330.0"); lbl17.setFont(new Font("Tahoma", Font.BOLD, 11)); lbl17.setBounds(370, 35, 60, 14); panel_1.add(lbl17);
		
		JLabel lbl12 = new JLabel("IVA 19%:"); lbl12.setBounds(50, 60, 80, 14); panel_1.add(lbl12);
		JLabel lbl13 = new JLabel("1254.0"); lbl13.setFont(new Font("Tahoma", Font.BOLD, 11)); lbl13.setBounds(150, 60, 80, 14); panel_1.add(lbl13);
		
		JLabel lbl14 = new JLabel("Total factura:"); lbl14.setBounds(50, 85, 90, 14); panel_1.add(lbl14);
		JLabel lbl15 = new JLabel("7524.0"); lbl15.setFont(new Font("Tahoma", Font.BOLD, 11)); lbl15.setBounds(150, 85, 80, 14); panel_1.add(lbl15);
		
		JButton btnFinalizar = new JButton("Finalizar factura");
		btnFinalizar.setBounds(650, 115, 140, 25);
		panel_1.add(btnFinalizar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(800, 115, 100, 25);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		panel_1.add(btnLimpiar);
	}
}