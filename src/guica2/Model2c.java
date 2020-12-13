/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andressa Gomes
 */
public class Model2c {
    public String[][]locationList(String userInput){
        String[][]data = new String [5][2];
    
        try {//conecting with database
            String dbServer = "jdbc:mysql://apontejaj.com:3306/Andressa_2019141?useSSL=false";
            String dbuser = "Andressa_2019141";
            String dbpassword = "2019141";
            String query = "SELECT bname, blocation FROM barber WHERE bname OR blocation = '"+userInput+"';";
            //query to show the result searched by the user
            
            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, dbuser, dbpassword);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            int row=0;
            while (rs.next())
            {
                data[row][0] = rs.getString("bname");
                data[row][1] = rs.getString("blocation");
                row++;
            }
            
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException se) {
            System.out.println("SQL Exception:");

            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }
}
