/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.libro;

import ico.fes.Libros.Book;
import ico.fes.libro.Autor;
import ico.fes.libro.Editorial;

/**
 *
 * @author herma
 */
public class ClaseLibro { 
    
    public static void main(String[] args) {
    Book libro1=new Book();
    libro1.setTitulo("It Eso");
    libro1.setEdit(new Editorial("Desconocida", (int) 1991) );
    libro1.setEscritor(new Autor("Sthephen King", (int)74) );
        System.out.println(libro1);
        
        
    
    
           
    
    }
    
}
