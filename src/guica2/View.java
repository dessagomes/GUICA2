/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import com.placeholder.PlaceHolder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Andressa Gomes
 */
public class View extends JFrame{
    JTextField username;
    JPasswordField password;
    MainController controller;
    PlaceHolder ph;
    JLabel link1;
    JLabel link2;
    
    public View(MainController controller){   
        this.controller = controller;
        attributeSetter();
        mainPage();
        validation();   
    }
    
    // Setting attributes
    private void attributeSetter(){
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Find Your Cut");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    //my frame
    public void mainPage(){
        JPanel p = new JPanel();
        this.add(p);
        BorderLayout mainLayout = new BorderLayout();
        p.setLayout(mainLayout);

        JPanel mainP = new JPanel();
        GridLayout middleLayout = new GridLayout(5,1);
        mainP.setLayout(middleLayout);
        p.add(mainP);
        
        JPanel loginP = new JPanel();
        username = new JTextField(20);
        loginP.add(username);
        ph = new PlaceHolder(username,"Email");
        mainP.add(loginP);
        JPanel passwordP = new JPanel();
        password = new JPasswordField(20);
        passwordP.add(password);
        ph = new PlaceHolder(password,"Password");
        mainP.add(passwordP);
        
        JPanel buttonP = new JPanel();
        JButton loginB = new JButton("LOGIN");
        buttonP.add(loginB);
        mainP.add(buttonP);
        loginB.setActionCommand("loginb");
        loginB.addActionListener(controller);
        
        JPanel link1P = new JPanel();
        mainP.add(link1P);
        link1 = new JLabel("Register new Barber");
        link1.setForeground(Color.BLUE);
        link1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        link1.addMouseListener(controller);
        link1P.add(link1);
        
        JPanel link2P = new JPanel();
        mainP.add(link2P);
        link2 = new JLabel("Register new Customer");
        link2.setForeground(Color.BLUE);
        link2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        link2.addMouseListener(controller);
        link2P.add(link2);       
    }
    
    // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }
    
    //getter to get the info from the user
    public String getUsername(){
        return username.getText();
    }
    
    public String getPassword(){
        return password.getText();
    }
}
