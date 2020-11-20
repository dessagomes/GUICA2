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
public class MainModel {

        String un;
        String pw;

    public void User(String Un, String Pw){
        this.un = Un;
        this.pw = Pw;

    }
    
    public String getUn(){
        return un;
    }
    
    public String getPw(){
        return pw;
    }
   

}
