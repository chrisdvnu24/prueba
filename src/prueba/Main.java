package prueba;

import com.formdev.flatlaf.FlatDarkLaf;
import controllers.AuthController;

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

		AuthController controlador = new AuthController();
        controlador.showLogin();
		/**
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		**/
	}
}