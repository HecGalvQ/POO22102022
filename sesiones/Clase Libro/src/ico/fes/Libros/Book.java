/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.Libros;

import ico.fes.libro.Autor;
import ico.fes.libro.Editorial;

/**
 *
 * @author herma
 */
public class Book {
    private int NodePaginas;
    private String Titulo;
    private Editorial Edit;
    private Autor Escritor;

    public Book() {
    }

    public Book(int NodePaginas, String Titulo, Editorial Edit, Autor Escritor) {
        this.NodePaginas = NodePaginas;
        this.Titulo = Titulo;
        this.Edit = Edit;
        this.Escritor = Escritor;
    }

    public Autor getEscritor() {
        return Escritor;
    }

    public void setEscritor(Autor Escritor) {
        this.Escritor = Escritor;
    }

    public int getNodePaginas() {
        return NodePaginas;
    }

    public void setNodePaginas(int NodePaginas) {
        this.NodePaginas = NodePaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Editorial getEdit() {
        return Edit;
    }

    public void setEdit(Editorial Edit) {
        this.Edit = Edit;
    }

    @Override
    public String toString() {
        return "Book{" + "NodePaginas=" + NodePaginas + ", Titulo=" + Titulo + ", Edit=" + Edit + ", Escritor=" + Escritor + '}';
    }
    
}
