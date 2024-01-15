package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql {

    public static Connection connection;
    public static final String DATABASE = "pharmacy";
    public static final String PASSWORD = "0115647879Joel";
    public static final String USER = "root";

    public static void createConnection()throws Exception{
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE, USER, PASSWORD);
        }
    }

    public static Statement createStatement() throws Exception {
        createConnection();
        Statement statement = connection.createStatement();
        return statement;
    }

    public static void iud(String query) {

        try {

            Statement stmt = createStatement();
            stmt.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ResultSet search(String query) throws Exception {

        Statement stmt = createStatement();
        ResultSet resultset = stmt.executeQuery(query);

        return resultset;
    }

    public static Connection getConnection() throws Exception{

        if (connection == null) {
            createConnection();
        }
        return connection;
    }

}
