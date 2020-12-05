/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Andressa Gomes
 */
public class MainController implements ActionListener, MouseListener{

    View view;
    MainModel model;
    boolean result;
    
    public MainController(){
        this.view = new View(this);
        this.model = new MainModel();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String un = view.getUsername();
        String pw = view.getPassword();
        
        User user = new User(un, pw);
        
        this.result = model.login(user);
    
        if(e.getActionCommand().equals("logionb")){
            //open next page
            
            } else{
                JOptionPane.showMessageDialog(view, "Try again");
            }    
        }
        

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource().equals(view.link1)){
            view.setVisible(false);
            new RegisterBController();
        }
        else if(e.getSource().equals(view.link2)){
            view.setVisible(false);
            new RegisterControllerC();
        }
        
        
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        System.out.println("bla");
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
    

