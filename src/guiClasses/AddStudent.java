package guiClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import classes.Student;

public class AddStudent extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel panel1, panel2, subpanel2, panel3;
    private JLabel addInfo;
    //public Student(String firstName, String surname, int age, String address, String lno, String course, int year, String paymentStatus, double quotaBalance)
    private JLabel fname, lname, age, address, lno, course, year, paymentStatus, quotaBalance;
    private JTextField fnametxt, lnametxt, agetxt, addresstxt, lnotxt, coursetxt, yeartxt, quotaBalancetxt;
    private String[] number = new String[]{"Completed", "Uncompleted",};
    private JComboBox<String> comboxPayment = new JComboBox<>(number);

    private String[] yearN = new String[]{"Ist year", "Second Year", "Third Year", "Fourth Year"};
    private JComboBox<String> comboxYear = new JComboBox<>(yearN);
    private JButton addButton, cancelButton, saveAndEnd;
    private Student student = new Student();

    public AddStudent() {
        panel1 = new JPanel(new BorderLayout());
        addInfo = new JLabel("Fill the following fields to Add Student");
        panel1.add(addInfo);
        add(panel1, BorderLayout.NORTH);

        panel2 = new JPanel(new BorderLayout());
        subpanel2 = new JPanel(new GridLayout(11, 2));

        subpanel2.add(new JLabel("    "));
        subpanel2.add(new JLabel("    "));

        subpanel2.add(lno = new JLabel("    L Number"));
        subpanel2.add(lnotxt = new JTextField(Student.getLno()));
        lnotxt.setEditable(false);


        subpanel2.add(fname = new JLabel("     FirstName"));
        subpanel2.add(fnametxt = new JTextField(10));


        subpanel2.add(lname = new JLabel("     LastName"));
        subpanel2.add(lnametxt = new JTextField(10));


        subpanel2.add(age = new JLabel("    Age"));
        subpanel2.add(agetxt = new JTextField(10));


        subpanel2.add(address = new JLabel("     Address"));
        subpanel2.add(addresstxt = new JTextField(10));


        subpanel2.add(course = new JLabel("    Course"));
        subpanel2.add(coursetxt = new JTextField(10));

        subpanel2.add(year = new JLabel("     Year"));
        subpanel2.add(comboxYear);


        subpanel2.add(paymentStatus = new JLabel("      Payment Status"));
        subpanel2.add(comboxPayment);

        subpanel2.add(quotaBalance = new JLabel("     Account Balance"));
        subpanel2.add(quotaBalancetxt = new JTextField(10));

        subpanel2.add(new JLabel("    "));
        subpanel2.add(new JLabel("    "));

        panel2.add(subpanel2);

        add(panel2, BorderLayout.CENTER);

        panel3 = new JPanel(new GridLayout(1, 2));
        panel3.add(addButton = new JButton("ADD"));
        panel3.add(cancelButton = new JButton("CANCEL"));
        panel3.add(saveAndEnd = new JButton("Save"));
        add(panel3, BorderLayout.SOUTH);


        //add a listener to ok button
        addButton.addActionListener(e -> {

            //Hi stanley, please put the db code over here.

            JOptionPane.showMessageDialog(null, "Student is added");
            dispose();


        });
        cancelButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Process is canceled");
            dispose();
        });

        saveAndEnd.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Saved");
            dispose();
        });


    }

    public static void main(String args[]) {


        // CONSTRUCT a EmployeeFrame object called frame, passing the selected Employee into the constrctor
        AddStudent frame = new AddStudent();

        // Set up the frame object
        frame.setTitle("Admin Controls");
        //frame.pack();
        frame.setSize(700, 520);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setResizable(false);
        //dispose();
    }


}
