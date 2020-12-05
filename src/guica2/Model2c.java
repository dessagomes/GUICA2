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
    View2c view;
    
    public String[][] locationList(){
        String[][] data = new String [5][2];
    
        try {

            String dbServer = "jdbc:mysql://apontejaj.com:3306/Andressa_2019141?useSSL=false";
            String user = "cctstudent";
            String password = "cctstudent";
            String query = "SELECT bname, blocation FROM barber WHERE bname OR blocation = '"+view.getSearch()+"'";

            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, user, password);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            int row=0;
            while (rs.next())
            {
                data[row][0] = rs.getString("id");
                data[row][1] = rs.getString("first_name");
                data[row][2] = rs.getString("student_number");
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
