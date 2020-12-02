/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Andressa Gomes
 */
public class View2c extends JFrame{
    JPanel p;
    JLabel mainL;
    JMenuBar mb;
    JMenu f;
    JMenu a;
    JMenu b;
    JMenu l;
    JList list;
    JLabel searchbox;
    JScrollPane listScroller;
    //missing searchbox
    
    public View2c (){
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
        p = new JPanel();
        this.add(p);      
        
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
        
        JPanel mainP = new JPanel();
        GridLayout middleLayout = new GridLayout(3,1);
        mainP.setLayout(middleLayout);
        p.add(mainP);
        
        JPanel p1 = new JPanel();
        mainL = new JLabel("FIND BARBER");
        p1.add(mainL);
        p.add(p1);  
        
        JPanel p2 = new JPanel();
        searchbox = new JLabel ("SEARCHBOX HERE");
        p2.add(searchbox);
        p.add(p2);
        
        JPanel p3 = new JPanel();
        //missing array
        list = new JList();
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(150, 80));
        p3.add(listScroller);
        
    }
    
    // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }
    
}
