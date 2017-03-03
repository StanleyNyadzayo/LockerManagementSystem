package guiClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import classes.Admin;

public class SecurityDialog extends JDialog {
    // Declare Components of our JDialog...

    // It has a JPanel with two JLabels...
    private JPanel jpLabels;
    private JLabel jlblUserName, jlblPassword;

    // ...a JPanel with a JTextField and  JPasswordField...
    private JPanel jpTextFields;
    private JTextField jtfUsername;
    private JPasswordField jtfPassword;

    // ...and a JPanel with two JButtons
    private JPanel jpButtons;
    private JButton jbtOK, jbtCancel;

    private String userNameEntered, passwordEntered;
    private final String REQUIREDUSERNAME = "L";
    private final String REQUIREDPASSWORD = "L";

    public SecurityDialog() {
        // Constructor - SetLayout & Add Components here...
        // Panel 1 - Two JLabels
        jpLabels = new JPanel(new GridLayout(2, 1));
        jpLabels.add(jlblUserName = new JLabel("Username"));
        jpLabels.add(jlblPassword = new JLabel("Password"));

        // Panel 2 - A JTextField and a JPasswordField
        jpTextFields = new JPanel(new GridLayout(2, 1));
        jpTextFields.add(jtfUsername = new JTextField(15));
        jpTextFields.add(jtfPassword = new JPasswordField(15));
        jtfPassword.setEchoChar('*');

        // Panel32 - Three JButtons
        jpButtons = new JPanel();
        jpButtons.add(jbtOK = new JButton("OK"));
        jpButtons.add(jbtCancel = new JButton("Cancel"));

        // Set up the JFrame
        add(jpLabels, BorderLayout.WEST);
        add(jpTextFields, BorderLayout.CENTER);
        add(jpButtons, BorderLayout.SOUTH);

        //add anon listener to ok button
        jbtOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                passwordEntered = new String(jtfPassword.getPassword());
                if ((jtfUsername.getText().equals(REQUIREDUSERNAME)) && (passwordEntered.equals(REQUIREDPASSWORD))) {

                    AddStudent frame = new AddStudent();
                    //frame.pack();
                    frame.setSize(700, 520);
                    frame.setTitle("Add Student");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setLocationRelativeTo(null); // Center the frame
                    frame.setVisible(true);
                    //dispose of dialog box
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Details");
                    jtfUsername.setText(" ");
                    jtfPassword.setText("");
                }
            }
        });
        jbtCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        // CONSTRUCT a SecurityDialog object called dialog
        SecurityDialog dialog = new SecurityDialog();

        dialog.setTitle("Identity Validation");
        dialog.pack();
        // Add the DISPOSE_ON_CLOSE operation to dialog
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

}
