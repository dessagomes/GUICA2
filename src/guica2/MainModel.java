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
public class MainModel {
    
    public boolean login (User user){
        boolean result = false;
        
            try {

            String dbServer = "jdbc:mysql://apontejaj.com:3306/Andressa_2019141?useSSL=false";
            String dbuser = "Andressa_2019141";
            String dbpassword = "2019141";
            String query = "SELECT * FROM user WHERE username = '"+ user.getUn()+"' AND password = '"+user.getPw()+"'";

            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, dbuser, dbpassword);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();
            
            // Execute the query
            ResultSet rs = stmt.executeQuery(query);

            // Loop through the result set
            if (rs.next()) {
                result = true;
            }

            // Close the result set, statement and the connection
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
        }
            catch (Exception se){
            System.out.println(se);
        }
            return result;
        }
}

    
   


