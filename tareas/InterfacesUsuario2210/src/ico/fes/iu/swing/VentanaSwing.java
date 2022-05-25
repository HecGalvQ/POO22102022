/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing;

import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author herma
 */
public class VentanaSwing extends JFrame {

    public VentanaSwing() throws HeadlessException {
    this.setTitle("Mi Ventana Swing");
    this.setSize(300, 220);
    this.setVisible(true);
    this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
     
        
    });
    }
    
    
}
