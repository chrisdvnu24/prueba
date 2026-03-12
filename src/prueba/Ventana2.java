package prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.border.EtchedBorder;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

public class Ventana2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Registro de Usuarios");
		frame.getContentPane().setBackground(new Color(128, 255, 128));
		frame.setBounds(100, 100, 550, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 2, 5, 5));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos generales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(0, 255, 255));
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{38, 0, 46, 46, 86, 0};
		gbl_panel.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Nombres:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido paterno:");
		GridBagConstraints gbc_lblApellidoPaterno = new GridBagConstraints();
		gbc_lblApellidoPaterno.anchor = GridBagConstraints.EAST;
		gbc_lblApellidoPaterno.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidoPaterno.gridx = 2;
		gbc_lblApellidoPaterno.gridy = 1;
		panel.add(lblApellidoPaterno, gbc_lblApellidoPaterno);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido materno:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 2;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de nacimiento:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 3;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 4;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 3;
		gbc_rdbtnNewRadioButton.gridy = 4;
		panel.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("F");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 3;
		gbc_rdbtnNewRadioButton_1.gridy = 5;
		panel.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Nacionalidad:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 6;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 6;
		panel.add(comboBox, gbc_comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Perfil de usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 128, 128));
		frame.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{127, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{110, 23, 0, 23, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Ventana2.class.getResource("/prueba/img/user_img.png")));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 0;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 2;
		panel_1.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNewCheckBox_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox_1.gridx = 0;
		gbc_chckbxNewCheckBox_1.gridy = 3;
		panel_1.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Datos opcionales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(new Color(255, 128, 128));
		frame.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{107, 86, 58, 0};
		gbl_panel_2.rowHeights = new int[]{20, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 2;
		panel_2.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Preferencias:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_7.gridx = 2;
		gbc_lblNewLabel_7.gridy = 2;
		panel_2.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.gridx = 0;
		gbc_textField_4.gridy = 3;
		panel_2.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JList list = new JList();
		list.setVisibleRowCount(3);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cantar", "Escuchar musica", "Leer", "Deportes", "Progamar", "Estudiar", "Bailar", "Coro"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.anchor = GridBagConstraints.NORTH;
		gbc_list.gridwidth = 0;
		gbc_list.gridx = 2;
		gbc_list.gridy = 3;
		panel_2.add(list, gbc_list);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		frame.getContentPane().add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{83, 63, 53, 71, 0};
		gbl_panel_3.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 1;
		panel_3.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 3;
		panel_3.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 5;
		panel_3.add(btnNewButton_2, gbc_btnNewButton_2);
	}

}
