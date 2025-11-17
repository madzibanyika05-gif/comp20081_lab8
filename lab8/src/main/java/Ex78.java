package com.mycompany.lab8;

/**
 *
 * @author ntu-user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex78 {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:students.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            statement.executeUpdate("drop table if exists students");
            
            //TODO add your code here 
            statement.executeUpdate("create table person (id integer, name string, class integer, marks integer)");
            statement.executeUpdate("insert into person values(1, 'John Doe', 10, 620)");
            statement.executeUpdate("insert into person values(2, 'Joanne Doe', 10, 630)");
            ResultSet rs = statement.executeQuery("select * from students");
            while (rs.next()) {
                // read the result set
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
                System.out.println("class = " + rs.getInt("class"));
                System.out.println("marks = " + rs.getInt("marks"));
            }
        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }
    }
}