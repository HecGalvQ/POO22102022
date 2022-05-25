/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author herma
 */
public class Alumno extends Persona {
    private String carrera;
    private int semestre; 
    private String numdecuenta;

    public Alumno() {
    }

    public Alumno(String carrera, int semestre, String numdecuenta) {
        this.carrera = carrera;
        this.semestre = semestre;
        this.numdecuenta = numdecuenta;
    }

    public Alumno(String carrera, int semestre, String numdecuenta, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
        this.numdecuenta = numdecuenta;
    }

    public String getNumdecuenta() {
        return numdecuenta;
    }

    public void setNumdecuenta(String numdecuenta) {
        this.numdecuenta = numdecuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + ", numdecuenta=" + numdecuenta + '}';
    }
    
    
}
