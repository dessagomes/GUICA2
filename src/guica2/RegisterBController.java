/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Andressa Gomes
 */
public class RegisterBController implements ActionListener{
    ViewRegisterBarber view;
    RegisterBModel model;
    
    public RegisterBController(){
        this.view = new ViewRegisterBarber(this);
        this.model = new RegisterBModel();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
