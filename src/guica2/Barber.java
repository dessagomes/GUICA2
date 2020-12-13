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
public class Barber {
    private String bName;
    private String bEmail;
    private String bPhone;
    private String bLocal;
    private String bPass;
    
    public Barber(String bName, String bEmail, String bPhone, String bLocal, String bPass){
        this.bName = bName;
        this.bEmail = bEmail;
        this.bPhone = bPhone;
        this.bLocal = bLocal;
        this.bPass = bPass;
    }
    
    //getter to get the info and return it
    public String getbName() {
        return bName;
    }
    
    public String getbEmail () {
        return bEmail;
    }
    
    public String getbPhone() {
        return bPhone;
    }
    
    public String getbLocal() {
        return bLocal;
    }
    
    public String getbPass() {
        return bPass;
    }
    
}
