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
public class ViewRegisterBarber extends JFrame{
    JLabel mainL;
    JTextField bName;
    JTextField bEmail;
    JTextField bPhone;
    JTextField bLocal;
    JTextField bPass;
    JButton b;
    RegisterBController controller;
    PlaceHolder ph;
    
    public ViewRegisterBarber(RegisterBController controller){
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
    
    public void mainPage(){
        JPanel p = new JPanel();
        this.add(p);
        
        GridLayout middleLayout = new GridLayout(7,1);
        p.setLayout(middleLayout);
        
        JPanel p1 = new JPanel();
        mainL = new JLabel("NEW BARBER");
        p1.add(mainL);
        p.add(p1);
        
        JPanel p2 = new JPanel();
        bName = new JTextField(20);
        ph = new PlaceHolder(bName,"Name");
        p2.add(bName);
        p.add(p2);
        
        JPanel p3 = new JPanel();
        bEmail = new JTextField(20);
        ph = new PlaceHolder(bEmail,"Email");
        p3.add(bEmail);
        p.add(p3);
        
        JPanel p4 = new JPanel();
        bPhone = new JTextField(20);
        ph = new PlaceHolder(bPhone,"Phone");
        p4.add(bPhone);
        p.add(p4);
        
        JPanel p5 = new JPanel();
        bLocal = new JTextField(20);
        ph = new PlaceHolder(bLocal,"Location");
        p5.add(bLocal);
        p.add(p5);
        
        JPanel p6 = new JPanel();
        bPass = new JTextField(20);
        ph = new PlaceHolder(bPass,"Password");
        p6.add(bPass);
        p.add(p6);
        
        JPanel p7 = new JPanel();
        b = new JButton("Register");
        b.addActionListener(controller);
        p7.add(b);
        p.add(p7);
        
    }
    
    public String getBName(){
        return bName.getText();
    }
    
    public String getBEmail(){
        return bEmail.getText();
    }
    
    public String getBPhone(){
        return bPhone.getText();
    }
    
    public String getBLocal(){
        return bLocal.getText();
    }
    
    public String getBPass(){
        return bPass.getText();
    }
    
    // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }
}
