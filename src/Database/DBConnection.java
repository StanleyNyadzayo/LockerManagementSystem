package Database;


import java.sql.*;

/*
 * Created by stanley on 26/02/17.
 */
public class DBConnection {
    public static void main(String[] args) {

//        try {
//            createStudentTable();
//
//        } catch (ClassNotFoundException clnfe) {
//            clnfe.printStackTrace();
//        }
//    }
//
//    private static void createStudentTable() throws ClassNotFoundException {
//        String studentTable = "CREATE TABLE Student(Lnumber varchar(9) primary key not null, FirstName varchar(255), SecondName varchar(255), Course varchar(255), Year int(1), quotaBalance DECIMAL(2, 2));";


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

            //create mysql date object which can be used in the INSERT statement

            // insert statement to add to database
            String insertQuery = "insert INTO Student(Lnumber, FirstName, SecondName, Age, Address, Course, YEAR, PaymentStaus, QuotaBalance) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
            Statement statement = connection.createStatement();


            // prepared statements for insertQuery
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, "L00119821");
            preparedStatement.setString(2, "Mary");
            preparedStatement.setString(3, "jones");
            preparedStatement.setInt(4, 28);
            preparedStatement.setString(5, "11 Main Road, Convoy");
            preparedStatement.setString(6, "BSc in Computing");
            preparedStatement.setInt(7, 2);
            preparedStatement.setString(8, "Paid");
            preparedStatement.setDouble(9, 1.00);

            //executed prepared statement
            preparedStatement.execute();
            System.out.println("Table updated!!!!!!");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM clgt3DB.Student;");
            //statement.executeUpdate(StudentTable);
            while (resultSet.next())
                System.out.println(resultSet.getString(1) + ", " + resultSet.getString(2) + ", " + resultSet.getString(3) + ", " + resultSet.getDouble(5));

            connection.close();
        } catch (Exception e) {
            System.err.println("You have an Exception");
            System.err.println(e.getMessage());
        }
    }
}
