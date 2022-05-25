/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilización.de.código;

import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.equipos.Computadora;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;


/**
 *
 * @author herma
 */
public class ReutilizaciónDeCódigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String facultad = new String ("Fes Aragon");
       char letra = facultad.charAt(4);
        System.out.println(letra);
        // TODO code application logic here
       //MiVentana v1 = new MiVentana();
        Computadora compu = new Computadora();
        compu.setMarca("Asus");
        compu.setModelo("Rogen Gamer Z");
        compu.setCPU(new Procesador("Intel", "i9", (float) 5.0f));
        
        Mouse raton = new Mouse ();
        raton.setMarca("Logitech");
        compu.setRaton(raton);
        compu.getRaton().setModelo("GS400");
        
       System.out.println(compu);
       
        System.out.println("-----Herencia-----");
        Alumno alu1 = new Alumno ();
        alu1.setNombre("Adrian");
        System.out.println(alu1);
        Alumno alu2 = new Alumno("Computacion", (int)2022, "31913537-2", "Juan", (int)19 );
        System.out.println(alu2);
        
        System.out.println("--- Polimorfismo-----");
        Animal animal1= new Animal(4);
        Perro animal2 = new Perro("Pug", 4);
        animal1.hablar();
        animal2.hablar();
        animal2.hablar(10);
       
        
        
    }
    
}
