package views;

import javax.swing.*;
import java.awt.*;

public class HomeView extends JFrame
{
    public HomeView()
    {
        setTitle("Home");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(28, 28, 28));
        setLayout(new BorderLayout());

        JLabel lblBienvenida = new JLabel("¡Bienvenido al Sistema!", SwingConstants.CENTER);
        lblBienvenida.setFont(new Font("Arial", Font.BOLD, 36));
        lblBienvenida.setForeground(Color.WHITE);
        add(lblBienvenida, BorderLayout.CENTER);
    }

    public void showView()
    {
        setVisible(true);
    }
}