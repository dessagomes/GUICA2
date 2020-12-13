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
public class Customer {
    private String cName;
    private String cEmail;
    private String cPhone;
    private String cPass;
    
    public Customer (String cName, String cEmail, String cPhone, String cPass){
        this.cName = cName;
        this.cEmail = cEmail;
        this.cPhone = cPhone;
        this.cPass = cPass;
    }
    
    //getter to get info from user
    public String getcName() {
        return cName;
    }
    
    public String getcEmail () {
        return cEmail;
    }
    
    public String getcPhone() {
        return cPhone;
    }
    
    public String getcPass() {
        return cPass;
    }
}
