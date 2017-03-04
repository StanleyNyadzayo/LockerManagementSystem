package Database;

import classes.Person;
import classes.Student;

import java.sql.*;

import static classes.Student.number;


/*
 * Created by stanley on 26/02/17.
 */
public class DBConnection {
    public static void main(String[] args) {
//
//        System.out.println("----MySQL JDBC Connection Team Project CLGT3 -------");
        try {
            createStudentTable();

        } catch (ClassNotFoundException clfe) {
            clfe.printStackTrace();
        }
    }

    private static void createStudentTable() throws ClassNotFoundException {
        //String studentTable = "CREATE TABLE Student(studentno varchar(9) primary key not null, firstName varchar(255), lastName varchar(255), courseTitle varchar(255), courseYear int(1), quotaBalance DECIMAL(2, 2));";


        try {//Creating the database connection
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registration complete!");
        Connection connection;

        try {
            connection = DriverManager.
                    getConnection("jdbc:mysql://" + "lockerdb.csexedpueeai.eu-west-1.rds.amazonaws.com"
                            + ":" + 3306 + "/" + "clgt3DB", "root", "Pomerm.70");

            // insert statement to add to database
            String insertQuery = "insert INTO Student(studentno, firstName, lastName, courseTitle, courseYear) " + "VALUES (?, ?, ?, ?, ?);";
            Statement statement = connection.createStatement();


            // prepared statements for insertQuery
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, Student.lno.concat(String.valueOf(number)));
            preparedStatement.setString(2, Student.firstName);
            preparedStatement.setString(3, Student.surname);
            preparedStatement.setString(4, Student.course);
            preparedStatement.setInt(5, Student.year);

            //executed prepared statement
            preparedStatement.execute();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM Student;");
            //statement.executeUpdate(studentTable);
            System.out.println("Table Created!!!!!!");
            while (resultSet.next())
                System.out.println(resultSet.getString(1) + ", " + resultSet.getString(2) + ", " + resultSet.getString(3) + ", " + resultSet.getDouble(5));

            connection.close();
        } catch (Exception e) {
            System.err.println("You have an Exception");
            System.err.println(e.getMessage());
        }
    }
}
