package guiClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import classes.Admin;

public class AdminLogin extends JFrame {

    /**
     *
     */
    private Admin currentAdmin;
    //topbar components
    private static final long serialVersionUID = 1L;
    private JLabel lockerlabel;
    private JLabel loginUser;
    private JPanel topBar;
    private ImageIcon logo = new ImageIcon("Image/lyit.jpg");
    private ImageIcon login = new ImageIcon("Image/login.jpg");

    //centerbar components
    private JPanel centerbar, gridPanel;
    private JButton addStudent;


    public AdminLogin(Admin adminIn) {
        // Set up currentEmployee
        currentAdmin = adminIn;

        // Construct Components and applying different methods on it, to make GUI attractive
        //*******************topbar components start**************************
        topBar = new JPanel(new BorderLayout());

        //payLabel Label contains lyit logo and "Payroll System" title
        lockerlabel = new JLabel("Locker System  ");
        lockerlabel.setIcon(logo);
        lockerlabel.setFont(new Font("Footlight MT Light", Font.BOLD, 60));
        lockerlabel.setHorizontalTextPosition(SwingConstants.RIGHT);
        lockerlabel.setIconTextGap(40);
        lockerlabel.setForeground(Color.red);

        //loginUser label contains icon and login employee name
        loginUser = new JLabel(currentAdmin.getFullName());
        loginUser.setIcon(login);
        loginUser.setHorizontalTextPosition(SwingConstants.CENTER);
        loginUser.setVerticalTextPosition(SwingConstants.BOTTOM);
        loginUser.setForeground(Color.red);
        loginUser.setBorder(new LineBorder(Color.WHITE, 4));

        // ...add payLabel and loginUser JLabels to topbar panel.
        topBar.add(lockerlabel, BorderLayout.WEST);
        topBar.add(loginUser, BorderLayout.EAST);

        //add topBar panel to frame
        add(topBar, BorderLayout.NORTH);
        topBar.setBackground(Color.white);
        //*******************topbar components end**************************

        centerbar = new JPanel(new BorderLayout());
        gridPanel = new JPanel(new GridLayout(1, 1));
        gridPanel.add(addStudent = new JButton("Add Student"));
        addStudent.setMnemonic('A');
        addStudent.setForeground(Color.RED);
        addStudent.setToolTipText("Hit this button to Add Student");
        addStudent.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        centerbar.add(gridPanel);
        add(centerbar, BorderLayout.CENTER);
        topBar.setBackground(Color.white);

        //add listener to salaryButton JButton
        addStudent.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        SecurityDialog dialog = new SecurityDialog();

                        dialog.setTitle("Login Varification");
                        dialog.pack();
                        // Add the DISPOSE_ON_CLOSE operation to dialog
                        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                        dialog.setLocationRelativeTo(null);
                        dialog.setVisible(true);
                    }
                });

    }
}
