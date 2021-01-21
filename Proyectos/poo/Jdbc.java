package poo;

import java.sql.*;

public class Jdbc {

    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/empresa?serverTimezone=UTC";
        String username = "root";
        String passwprd = "3020105af";
        String query = "SELECT * FROM alumno";
        Connection con = null;
        try {
            //obj Connection
            con = DriverManager.getConnection(url, username, passwprd);
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " +  resultSet.getString(3) + " " + resultSet.getString(4));
            }
        } catch (SQLException throwables) {
            //if you have an error then...
            throwables.printStackTrace();
        }
    }
}
