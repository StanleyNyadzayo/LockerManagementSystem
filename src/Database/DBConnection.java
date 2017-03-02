package Database;

import classes.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;


/*
 * Created by stanley on 26/02/17.
 */
public class DBConnection {
    public static void main(String[] args) { //connectJDBCToAWSEC2() {

        System.out.println("----MySQL JDBC Connection Team Project CLGT3 -------");

        try {//Creating the database connection
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registration complete!");
        Connection connection = null;

        try {
            connection = DriverManager.
                    getConnection("jdbc:mysql://" + "lockerdb.csexedpueeai.eu-west-1.rds.amazonaws.com" + ":" + 3306 + "/" + "clgt3DB", "root", "Pomerm.70");
            // creating a mysql date object for use in the insert statement
            Calendar calendar = Calendar.getInstance();
            //java.sql.Date bookingDate = new java.sql.Date(calendar.getTime().getTime());
            java.sql.Date courseYear = new java.sql.Date(calendar.getWeekYear());

            // insert statement to add to database
            String insertQuery = "insert INTO clgt3DB.Student(StudentID, StudentName, CourseTitle, CourseYear, QuotaBalance)" + "VALUES (?, ?, ?, ?, ?)";

            // prepared statements for insertQuery
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, "L00113456");
            preparedStatement.setString(2, "Michelle Ferry");
            preparedStatement.setString(3, "Cloud and Green");
            //preparedStatement.setDate(4,bookingDate); no parameter set for a booking date yet
            preparedStatement.setDate(4, courseYear);
            preparedStatement.setDouble(5, 9.98);

            /* delete statement to remove a student from the database WILL BE added here */

        } catch (SQLException e) {
            System.err.println("Connection Failed!:\n" + e.getMessage());
        }

        if (connection != null) {
            System.out.println("Database Connection was successful!!!!!");
        } else {
            System.out.println("FAILURE! Failed to make connection!");
        }

    }
}
