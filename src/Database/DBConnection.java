package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * Created by stanley on 26/02/17.
 */
public class DBConnection {
    public static void main(String[] args) { //connectJDBCToAWSEC2() {

        System.out.println("----MySQL JDBC Connection Team Project CLGT3 -------");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            connection = DriverManager.
                    getConnection("jdbc:mysql://" + "lockerdb.csexedpueeai.eu-west-1.rds.amazonaws.com" + ":" + 3306 + "/" + "clgt3DB", "root", "Pomerm.70");
        } catch (SQLException e) {
            System.out.println("Connection Failed!:\n" + e.getMessage());
        }

        if (connection != null) {
            System.out.println("SUCCESS!!!! You made it, take control your database now!");
        } else {
            System.out.println("FAILURE! Failed to make connection!");
        }
    }
}
