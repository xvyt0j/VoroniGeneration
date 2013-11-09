/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voronitest;

/**
 *
 * @author blender
 */

import javax.swing.*;

public class VoroniTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VoroniGen v = new VoroniGen();
        v.doVoroni();
        JFrame frame = new JFrame();
        //frame.getContentPane();
        frame.getContentPane().add(new JLabel(new ImageIcon(v.getImage())));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
