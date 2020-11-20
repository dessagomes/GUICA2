/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Andressa Gomes
 */
public class View extends JFrame{
    JTextField login;
    JTextField password;
    
    public View(){    
        attributeSetter();
        mainPage();
        validation();
        
    }
    // Setting attributes
    private void attributeSetter(){
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Find Your Cut");
    }
    
    public void mainPage(){
        JPanel p = new JPanel();
        this.add(p);
        BorderLayout mainLayout = new BorderLayout();
        p.setLayout(mainLayout);
        

        JPanel mainP = new JPanel();
        GridLayout middleLayout = new GridLayout(3,1);
        mainP.setLayout(middleLayout);
        p.add(mainP);
        
        JPanel loginP = new JPanel();
        login = new JTextField(20);
        loginP.add(login);
        mainP.add(loginP);
        JPanel passwordP = new JPanel();
        password = new JTextField(20);
        passwordP.add(password);
        mainP.add(passwordP);
        
        JPanel buttonP = new JPanel();
        JButton loginB = new JButton("LOGIN");
        buttonP.add(loginB);
        mainP.add(buttonP);
        
        
    }
    
    // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }
}
