package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class User
{
    private int id;
    private String username;
    private String password;
    private String nombre_completo;

    public User()
    {
        
    }

    public User(int id, String username, String password, String nombre_completo)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombre_completo = nombre_completo;
    }

    public ArrayList<User> get()
    {
        ArrayList<User> users = new ArrayList<>();
                
        String url = "jdbc:mysql://localhost:3306/sistema_login";
        String userDB = "app_java";
        String passDB = "Proyecto123"; 

        try (Connection conn = DriverManager.getConnection(url, userDB, passDB))
        {
            String query = "SELECT * FROM usuarios";
            
            try (PreparedStatement stmt = conn.prepareStatement(query))
            {
                try (ResultSet rs = stmt.executeQuery())
                {
                    while (rs.next())
                    {
                        User tmp = new User();
                        
                        tmp.setId(rs.getInt("id"));
                        tmp.setUsername(rs.getString("username"));
                        tmp.setPassword(rs.getString("password"));
                        tmp.setNombre_completo(rs.getString("nombre_completo"));
                        
                        users.add(tmp);
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return users;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getNombre_completo() 
    {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) 
    {
        this.nombre_completo = nombre_completo;
    }
}