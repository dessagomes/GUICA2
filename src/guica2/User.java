/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

/**
 *
 * @author Andressa Gomes
 */
public class User {
     String un;
     String pw;
    
    public User(String un, String pw){
        this.un = un;
        this.pw = pw;
    }

    //getters to get the info from the user and return it
    public String getUn() {
        return un;
    }

    public String getPw() {
        return pw;
    }
}
