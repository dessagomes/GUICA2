/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andressa Gomes
 */
public class MainController implements ActionListener{

    View view;
    MainModel model;
    
    public MainController(){
        this.view = new View(this);
        this.model = new MainModel();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String un = view.getUsername();
        String pw = view.getPassword();
        
//        User user = new User(un, pw);
        
//        boolean result = model.login(user);
    
        if(e.getActionCommand().equals("logionb")){
        }
        
    }
    

