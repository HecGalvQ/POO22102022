/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author herma
 */
public class Teclado {
    private String marca;
    private int Nodeteclas;
    private boolean multimedia; // true = multimedia

    public Teclado() {
    }

    public Teclado(String marca, int Nodeteclas, boolean multimedia) {
        this.marca = marca;
        this.Nodeteclas = Nodeteclas;
        this.multimedia = multimedia;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNodeteclas() {
        return Nodeteclas;
    }

    public void setNodeteclas(int Nodeteclas) {
        this.Nodeteclas = Nodeteclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", Nodeteclas=" + Nodeteclas + ", multimedia=" + multimedia + '}';
    }
    
    
    
}
