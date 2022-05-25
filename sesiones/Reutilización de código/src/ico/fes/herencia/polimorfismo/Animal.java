/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author herma
 */
public class Animal {
    private int numDepatas;

    public Animal() {
    }

    public Animal(int numDepatas) {
        this.numDepatas = numDepatas;
    }

    public int getNumDepatas() {
        return numDepatas;
    }

    public void setNumDepatas(int numDepatas) {
        this.numDepatas = numDepatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "numDepatas=" + numDepatas + '}';
    }
    public void hablar(){
        System.out.println("El animal emite sonido ");
    }
}
