/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author herma
 */
public class MiVentana extends JFrame {

    public MiVentana() throws HeadlessException { //manejo de errores
        this.setSize(600, 400); 
        this.setVisible(true);
        this.setTitle("Holi cabeza de frijoli");
        
    }
    
}
