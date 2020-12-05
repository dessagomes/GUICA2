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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
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
    JTextField searchbox;
    JScrollPane listScroller;
    PlaceHolder ph;
    Model2c model;
//    RegisterControllerC controller1;
    
    public View2c (){
//        this.controller1 = controller1;
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
        
        JPanel mainP = new JPanel();
        GridLayout middleLayout = new GridLayout(3,1);
        mainP.setLayout(middleLayout);
        p.add(mainP);
        
        JPanel p1 = new JPanel();
        mainL = new JLabel("FIND BARBER");
        p1.add(mainL);
        mainP.add(p1);
        
        JPanel p2 = new JPanel();
        searchbox = new JTextField(20);
        searchbox.addKeyListener(null);//fix it
        ph = new PlaceHolder(searchbox,"Search by Location or Barber");
        p2.add(searchbox);
        mainP.add(p2);
        
        JPanel p3 = new JPanel();
        String[][] data = model.locationList();
        list = new JList(data);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(20, 50));
        p3.add(listScroller);
        mainP.add(p3);    
    }
    
    public String getSearch(){
        return searchbox.getText();
    }
    
    // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }
    
}
