/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.libro;

/**
 *
 * @author herma
 */
public class Editorial {
    private String NombredelaEditorial;
    private int aniodeCreacion;

    public Editorial() {
    }

    public Editorial(String NombredelaEditorial, int aniodeCreacion) {
        this.NombredelaEditorial = NombredelaEditorial;
        this.aniodeCreacion = aniodeCreacion;
    }

    public int getAniodeCreacion() {
        return aniodeCreacion;
    }

    public void setAniodeCreacion(int aniodeCreacion) {
        this.aniodeCreacion = aniodeCreacion;
    }

    public String getNombredelaEditorial() {
        return NombredelaEditorial;
    }

    public void setNombredelaEditorial(String NombredelaEditorial) {
        this.NombredelaEditorial = NombredelaEditorial;
    }

    @Override
    public String toString() {
        return "Editorial{" + "NombredelaEditorial=" + NombredelaEditorial + ", aniodeCreacion=" + aniodeCreacion + '}';
    }
    
    
}
