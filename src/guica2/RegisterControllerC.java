/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Andressa Gomes
 */
public class RegisterControllerC implements ActionListener{
    ViewRegisterC view;
    RegisterCModel model;   
    boolean result;
    
    public RegisterControllerC(){//this controller creates new view and model
        this.view = new ViewRegisterC(this);
        this.model = new RegisterCModel();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //getting info from view class
        String cName = view.getCName();
        String cEmail = view.getCEmail();
        String cPhone = view.getCPhone();
        String cPass = view.getCPass();
        
        //calling new class given the new info taken from view class
        Customer customer = new Customer(cName, cEmail, cPhone, cPass);
        
        //getting the info from model and putting into result val
        this.result = model.newCustomer(customer);
        
            if(!result){//if registration goes well
                JOptionPane.showMessageDialog(view, "You're now register!");
                view.setVisible(false);
                new Controller2c();//creating and calling new controller
                
            } else{//if registration goes wrong
                JOptionPane.showMessageDialog(view, "Sorry, something went wrong. Try again");
            }
    }
    
}
