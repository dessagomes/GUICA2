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
public class RegisterBController implements ActionListener{
    ViewRegisterBarber view;
    RegisterBModel model;   
    boolean result;
    
    public RegisterBController(){
        this.view = new ViewRegisterBarber(this);
        this.model = new RegisterBModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String bName = view.getBName();
        String bEmail = view.getBEmail();
        String bPhone = view.getBPhone();
        String bLocal = view.getBLocal();
        String bPass = view.getBPass();
        
        Barber barber = new Barber(bName, bEmail, bPhone, bLocal, bPass);
        
        this.result = model.newBarber(barber);
        
            if(!result){
                JOptionPane.showMessageDialog(view, "You're now register!");
                
            } else{
                JOptionPane.showMessageDialog(view, "Sorry, something went wrong. Try again");
            }
        
    }

}