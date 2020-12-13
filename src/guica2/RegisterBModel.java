/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andressa Gomes
 */
public class RegisterBModel {
    public boolean newBarber (Barber barber){
        boolean result = false;
        
            try{//conecting with database
            String dbServer = "jdbc:mysql://apontejaj.com:3306/Andressa_2019141?useSSL=false";
            String dbuser = "Andressa_2019141";
            String dbpassword = "2019141";
            String query = "insert into barber (bname, bemail, bphone, blocation, bpass) values ('"+barber.getbName()+"', '"+barber.getbEmail()+"', '"+barber.getbPhone()+"', '"+barber.getbLocal()+"', '"+barber.getbPass()+"');";
            //query to insert new info to the table barber
            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, dbuser, dbpassword);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();
            
            // Execute the query
            stmt.execute(query);

            // Close the result set, statement and the connection
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
