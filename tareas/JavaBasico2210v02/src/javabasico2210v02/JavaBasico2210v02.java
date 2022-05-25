/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2210v02;

import ico.fes.Circulo;
import ico.fes.Cuadrado;

/**
 *
 * @author herma
 */
public class JavaBasico2210v02 {

    
    public static void main(String[] args) {
       Cuadrado c= new Cuadrado(4.0f, 4.0f);
       Circulo cir = new Circulo(5.0f);
       
        System.out.println(c.calcularArea() );
        System.out.println(cir.calcularArea());
        
    }
    
}
