/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author herma
 */
public class Monitor {
    private String marca;
    private String tipo; //Led, SmartTv, Oled..
    private float pulgadas;

    public Monitor() {
    }

    public Monitor(String marca, String tipo, float pulgadas) {
        this.marca = marca;
        this.tipo = tipo;
        this.pulgadas = pulgadas;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", tipo=" + tipo + ", pulgadas=" + pulgadas + '}';
    }
    
    
}
