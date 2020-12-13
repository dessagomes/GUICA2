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
public class RegisterBController implements ActionListener{
    ViewRegisterBarber view;
    RegisterBModel model;   
    boolean result;
    
    public RegisterBController(){
        //this controller creates a new view and model
        this.view = new ViewRegisterBarber(this);
        this.model = new RegisterBModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //getting info from view class
        String bName = view.getBName();
        String bEmail = view.getBEmail();
        String bPhone = view.getBPhone();
        String bLocal = view.getBLocal();
        String bPass = view.getBPass();
        
        //calling barber class giving the info taken from the view
        Barber barber = new Barber(bName, bEmail, bPhone, bLocal, bPass);
        //getting the info from model and putting in varible result
        this.result = model.newBarber(barber);
        
            if(!result){//if registation goes well
                JOptionPane.showMessageDialog(view, "You're now register!");
                //call new page not ready yet                
            }else{//if registration goes wrong
                JOptionPane.showMessageDialog(view, "Sorry, something went wrong. Try again");
            }
        
    }

}