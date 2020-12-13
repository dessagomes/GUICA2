/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Andressa Gomes
 */
public class Controller2c implements ActionListener{
    View2c view;
    Model2c model;  
    boolean result;
    String[][]data;
    
    public Controller2c(){//creating new view and model class
        this.model = new Model2c();
        this.view = new View2c(this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("logout")){
        //logout if user presses yes
        int n = JOptionPane.showConfirmDialog(view,
                "Would you like to logout?",
                "Attention",
                JOptionPane.YES_NO_OPTION);
        if(n==0){
            System.exit(0);
        }
        }
        
        if(e.getActionCommand().equals("b")){
        //getting info from view class
        String searchdata = view.getSearch();
        
        String[][]data = this.model.locationList(searchdata);
        
//        for (int i=0; i < data.length; i++){
//            for (int j=0; j < data[i].length; j++){
//                System.out.println(data[i][j]);
//            }
//        }
        }
        
    }
}
