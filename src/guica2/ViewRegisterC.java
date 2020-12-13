/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import com.placeholder.PlaceHolder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Andressa Gomes
 */
public class ViewRegisterC extends JFrame{
    PlaceHolder ph;
    JLabel mainL;
    JTextField cName;
    JTextField cEmail;
    JTextField cPhone;
    JTextField cPass;
    JButton b;
    RegisterControllerC controller;
    
    public ViewRegisterC(RegisterControllerC controller){
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
        
        GridLayout middleLayout = new GridLayout(6,1);
        p.setLayout(middleLayout);
        
        JPanel p1 = new JPanel();
        mainL = new JLabel("NEW CUSTOMER");
        p1.add(mainL);
        p.add(p1);
        
        JPanel p2 = new JPanel();
        cName = new JTextField(20);
        ph = new PlaceHolder(cName,"Name");
        p2.add(cName);
        p.add(p2);
        
        JPanel p3 = new JPanel();
        cEmail = new JTextField(20);
        ph = new PlaceHolder(cEmail,"Email");
        p3.add(cEmail);
        p.add(p3);
        
        JPanel p4 = new JPanel();
        cPhone = new JTextField(20);
        ph = new PlaceHolder(cPhone,"Phone");
        p4.add(cPhone);
        p.add(p4);
        
        JPanel p6 = new JPanel();
        cPass = new JTextField(20);
        ph = new PlaceHolder(cPass,"Password");
        p6.add(cPass);
        p.add(p6);
        
        JPanel p7 = new JPanel();
        b = new JButton("Register");
        b.addActionListener(controller);
        p7.add(b);
        p.add(p7);
        
    }
    
    //getter to get the info from the user
    public String getCName(){
        return cName.getText();
    }
    
    public String getCEmail(){
        return cEmail.getText();
    }
    
    public String getCPhone(){
        return cPhone.getText();
    }
    
    public String getCPass(){
        return cPass.getText();
    }
    
    // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }
}
