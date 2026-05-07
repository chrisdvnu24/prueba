package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

public class AuthModel
{
    public boolean autenticar(String usuario, String contrasena)
    {
        String url = "jdbc:mysql://localhost:3306/sistema_login";
        String userDB = "app_java";
        String passDB = "Proyecto123"; 

        try (Connection conn = DriverManager.getConnection(url, userDB, passDB))
        {
            String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
            
            try (PreparedStatement stmt = conn.prepareStatement(query))
            {
                stmt.setString(1, usuario);
                stmt.setString(2, contrasena);

                try (ResultSet rs = stmt.executeQuery())
                {
                    return rs.next();
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public int registrar(String usuario, String contrasena, String nombre)
    {
        String url = "jdbc:mysql://localhost:3306/sistema_login";
        String userDB = "app_java";
        String passDB = "Proyecto123";

        try (Connection conn = DriverManager.getConnection(url, userDB, passDB))
        {
            String query = "INSERT INTO usuarios (username, password, nombre_completo) VALUES (?, ?, ?)";
            
            try (PreparedStatement stmt = conn.prepareStatement(query))
            {
                stmt.setString(1, usuario);
                stmt.setString(2, contrasena);
                stmt.setString(3, nombre);

                stmt.executeUpdate();
                return 1;
            }
        }
        catch (SQLIntegrityConstraintViolationException e)
        {
            return 2;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return 3;
        }
    }
}