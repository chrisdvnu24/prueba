package prueba;

import com.formdev.flatlaf.FlatDarkLaf;

public class Main 
{
	public static void main(String[] args) 
	{
		try 
		{
			FlatDarkLaf.setup();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		Ventana ventana = new Ventana();
		ventana.setVisible(true);
	}
}