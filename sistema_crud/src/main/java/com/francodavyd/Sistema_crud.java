package com.francodavyd;

import com.francodavyd.vista.Menu;
import javax.swing.JFrame;

public class Sistema_crud {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setTitle("Sistema CRUD");
        menu.setResizable(false);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
}
