/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import com.placeholder.PlaceHolder;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Andressa Gomes
 */
public class View2c extends JFrame{
    JPanel p;
    JPanel mainP;
    JLabel mainL;
    JMenuBar mb;
    JMenu f;
    JMenu a;
    JMenu b;
    JMenu l;
    JTextField searchbox;
    PlaceHolder ph;
    Model2c model;
    Controller2c controller;
    String[][]data;

    public View2c (Controller2c controller){
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
    
    //frame without tabe
    public void mainPage(){
        p = new JPanel();
        this.add(p);     
        
        BorderLayout mainLayout = new BorderLayout();
        p.setLayout(mainLayout);
        
        mb = new JMenuBar();
        this.setJMenuBar(mb);
        
        f = new JMenu("Find");
        mb.add(f);
        
        a = new JMenu("Appointment");
        mb.add(a);

        b = new JMenu("My Bookings");
        mb.add(b);
        
        l = new JMenu("Logout");
        mb.add(l);
        JMenuItem logout = new JMenuItem("Logout");
        l.add(logout);
        logout.setActionCommand("logout");
        logout.addActionListener(controller);
        
        mainP = new JPanel();
        GridLayout middleLayout = new GridLayout(3,1);
        mainP.setLayout(middleLayout);
        p.add(mainP);
        
        JPanel p1 = new JPanel();
        mainL = new JLabel("FIND BARBER");
        p1.add(mainL);
        mainP.add(p1);
        
        JPanel p2 = new JPanel();
        searchbox = new JTextField(20);
        ph = new PlaceHolder(searchbox,"Search by Location or Barber");
        p2.add(searchbox);
        mainP.add(p2);
        
        JPanel p3 = new JPanel();
        JButton b = new JButton ("Search");
        p3.add(b);
        mainP.add(p3);
        b.setActionCommand("b");
        b.addActionListener(controller);
    }
    
    public String getSearch(){
        return searchbox.getText();
    }
    
    //frame with table
    public void setTable(){
        attributeSetter();
        
        p = new JPanel();
        this.add(p);     
        
        BorderLayout mainLayout = new BorderLayout();
        p.setLayout(mainLayout);
        
        mb = new JMenuBar();
        this.setJMenuBar(mb);
        
        f = new JMenu("Find");
        mb.add(f);
        
        a = new JMenu("Appointment");
        mb.add(a);

        b = new JMenu("My Bookings");
        mb.add(b);
        
        l = new JMenu("Logout");
        mb.add(l);
        JMenuItem logout = new JMenuItem("Logout");
        l.add(logout);
        logout.setActionCommand("logout");
        logout.addActionListener(controller);
        
        mainP = new JPanel();
        GridLayout middleLayout = new GridLayout(4,1);
        mainP.setLayout(middleLayout);
        p.add(mainP);
        
        JPanel p1 = new JPanel();
        mainL = new JLabel("FIND BARBER");
        p1.add(mainL);
        mainP.add(p1);
        
        JPanel p2 = new JPanel();
        searchbox = new JTextField(20);
        ph = new PlaceHolder(searchbox,"Search by Location or Barber");
        p2.add(searchbox);
        mainP.add(p2);
        
        JPanel p3 = new JPanel();
        JButton b = new JButton ("Search");
        p3.add(b);
        mainP.add(p3);
        b.setActionCommand("b");
        b.addActionListener(controller);
        
        JPanel p4 = new JPanel();
        String[] columnName = {"Name","Location"};
        JTable myTable = new JTable (data,columnName);
        JScrollPane mysp = new JScrollPane(myTable);
        p4.add(mysp);
        mainP.add(p4);
        
        validation();
    }
    
    // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }     
    
}
