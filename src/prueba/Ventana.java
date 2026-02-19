package prueba;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana extends JFrame 
{
	public Ventana()
	{
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200, 200));
		this.setMaximumSize(new Dimension(800, 800));
		this.setTitle("Hola mundo");
		this.setBackground(Color.blue);
		this.setLocation(200, 200);
	}
}