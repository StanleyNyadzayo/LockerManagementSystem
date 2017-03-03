package Database;

import java.sql.*;


/*
 * Created by stanley on 26/02/17.
 */
public class DBConnection {
    public static void main(String[] args) {

        System.out.println("----MySQL JDBC Connection Team Project CLGT3 -------");
    }

    private void createStudentTable() throws ClassNotFoundException {
        String studentTable = "CREATE TABLE Student("
                + "studentID varchar(10) NOT NULL AUTO_INCREMENT,"
                + "firstName VARCHAR(15), "
                + "lastName VARCHAR(15), "
                + "courseTitle VARCHAR(20),"
                + "courseYear INT(1),"
                + "quotaBalance DECIMAL (2, 2)";


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
            String insertQuery = "insert INTO clgt3DB.Student(studentID, firstName, lastName, courseTitle, courseYear, quotaBalance)" + "VALUES (?, ?, ?, ?, ?, ?)";

            // prepared statements for insertQuery
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, "L0");// auto incremented so it is set to L0
            preparedStatement.setString(2, "Harold");
            preparedStatement.setString(3, "Finch");
            preparedStatement.setString(4, "Ethical Hacking");
            preparedStatement.setInt(4, '3');
            preparedStatement.setDouble(5, 9.98);

            //executed prepared statement
            preparedStatement.execute();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clgt3DB.Student;");
            statement.executeUpdate(studentTable);
            System.out.println("Table hopefully Created!!!!!!");
            while (resultSet.next())
                System.out.println(resultSet.getString(1) + resultSet.getString(2) + resultSet.getString(3) + resultSet.getDouble(5));

            connection.close();
        } catch (Exception e) {
            System.err.println("You have an Exception");
            System.err.println(e.getMessage());
        }
    }
}
