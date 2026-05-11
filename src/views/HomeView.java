package views;

import javax.swing.*;
import java.awt.*;

public class HomeView extends JFrame
{
    private JButton goToUsers;

    public HomeView()
    {
        setTitle("Home");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(28, 28, 28));
        setLayout(new BorderLayout());

        JLabel lblBienvenida = new JLabel("Inicio", SwingConstants.CENTER);
        lblBienvenida.setFont(new Font("Arial", Font.BOLD, 36));
        lblBienvenida.setForeground(Color.WHITE);
        add(lblBienvenida, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(new Color(28, 28, 28));
        
        goToUsers = new JButton("Ir al panel de usuarios");
        panelInferior.add(goToUsers);
        
        add(panelInferior, BorderLayout.SOUTH);
    }

    public void showView()
    {
        setVisible(true);
    }

    public JButton getBtnGoToUsers()
    {
        return goToUsers;
    }
}