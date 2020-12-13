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
        //this controller creates a view and a model
        this.view = new View(this);
        this.model = new MainModel();   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //getting info from view class
        String un = view.getUsername();
        String pw = view.getPassword();
        //calling class user
        User user = new User(un, pw);
        //setting result with model code
        this.result = model.login(user);

        if(result){//if login successful
            JOptionPane.showMessageDialog(view, "Welcome back!");
            view.setVisible(false);
//            if(){//if credentials = customer open custumer main page *not ready yet
//              
//            }else//if credentials = barber open barber main page *not ready yet
        } 
        else{//if loging fails            
                JOptionPane.showMessageDialog(view, "Try again");
            }    
        }
        

    @Override
    public void mouseClicked(MouseEvent e) {
        //if user clicks on first link
        if(e.getSource().equals(view.link1)){
            //previous page "disappears" and next controller is created
            view.setVisible(false);
            new RegisterBController();
        }
        //if user clicks on first link
        else if(e.getSource().equals(view.link2)){
            //previous page "disappears" and next controller is created
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
    

