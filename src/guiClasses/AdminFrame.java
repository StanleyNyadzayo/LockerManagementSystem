package guiClasses;

import java.awt.Color;

import javax.swing.JFrame;

import classes.Admin;

public class AdminFrame {
    public static void main(String args[]) {
        Admin returnedValue = new Admin();


        // CONSTRUCT a EmployeeFrame object called frame, passing the selected Employee into the constructor
        AdminLogin frame = new AdminLogin(returnedValue);

        // Set up the frame object
        frame.setTitle("Admin Controls");
        //frame.pack();
        frame.setSize(700, 520);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setResizable(false);
    }
}
