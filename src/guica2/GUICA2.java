/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guica2;

import javax.swing.JFrame;

/**
 *
 * @author Andressa Gomes
 */
public class GUICA2 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    // Setting attributes
    private void attributesSetter(){
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("GUI CA 2");
    }
    
    // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }
}
