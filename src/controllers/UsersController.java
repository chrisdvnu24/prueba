package controllers;

import views.UsersView;
import views.HomeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsersController 
{
    private UsersView view;
    private HomeView vistaHome;

    public UsersController(HomeView vistaHome)
    {
        this.view = new UsersView();
        this.vistaHome = vistaHome;

        this.view.getBtnVolver().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                view.dispose();
                vistaHome.setVisible(true);
            }
        });
    }

    public void showUsers()
    {
        this.view.showView();
    }
}