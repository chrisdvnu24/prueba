package views;

import models.User;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class UsersView extends JFrame
{
    private JTable tablaUsuarios;
    private DefaultTableModel modeloTabla;
    private JButton btnVolver;

    public UsersView()
    {
        setTitle("Panel de Administrador - Usuarios");
        setSize(700, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(28, 28, 28));
        setLayout(new BorderLayout());

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre Completo");
        modeloTabla.addColumn("Usuario (Correo)");

        tablaUsuarios = new JTable(modeloTabla);

        JScrollPane scrollPane = new JScrollPane(tablaUsuarios);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(new Color(28, 28, 28));
        
        btnVolver = new JButton("Volver al Inicio");
        btnVolver.setBackground(new Color(90, 90, 90));
        btnVolver.setForeground(Color.WHITE);
        btnVolver.setFocusPainted(false);
        panelInferior.add(btnVolver);
        
        add(panelInferior, BorderLayout.SOUTH);

        tableUsers();
    }

    public void tableUsers()
    {
        User usuarioModel = new User();
        ArrayList<User> listaUsuarios = usuarioModel.get();

        for (User u : listaUsuarios)
        {
            modeloTabla.addRow(new Object[] {
                u.getId(),
                u.getNombre_completo(),
                u.getUsername()
            });
        }
    }

    public void showView()
    {
        setVisible(true);
    }

    public JButton getBtnVolver()
    {
        return btnVolver;
    }
}