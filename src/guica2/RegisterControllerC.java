/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Andressa Gomes
 */
public class RegisterControllerC implements ActionListener{
    ViewRegisterC view;
    RegisterCModel model;   
    boolean result;
    
    public RegisterControllerC(){
        this.model = new RegisterCModel();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String cName = view.getCName();
        String cEmail = view.getCEmail();
        String cPhone = view.getCPhone();
        String cPass = view.getCPass();
        
       Customer customer = new Customer(cName, cEmail, cPhone, cPass);
        
        this.result = model.newCustomer(customer);
        
            if(result){
                JOptionPane.showMessageDialog(view, "You're now register!");
                
            } else{
                JOptionPane.showMessageDialog(view, "Sorry, something went wrong. Try again");
            }
    }
    
}
