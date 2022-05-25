/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.cuenta.habiente.galvan.q;

/**
 *
 * @author herma
 */
public class PruebaEjem {
     public static void main(String args[]){
         
        CuentaHabiente[] cuentas = new CuentaHabiente[5];   
        cuentas[0]=new CuentaHabiente("HEcGA08033","Héctor Galvan", 75000);
        cuentas[1]=new CuentaHabiente("Ficc10084","Filiberto Castillo", 85000);
        cuentas[2]=new CuentaHabiente("JaGc09124","Jonathan Giron", 56000);
        cuentas[3]=new CuentaHabiente("Vach05012","Vanessa Hernandez", 49999);
        cuentas[4]=new CuentaHabiente("Mass02901","Miguel Sainz", 50025);
        
        for (int i = 0; i < cuentas.length; i++) {
            
            cuentas[i].retirarDinero(10000);
            System.out.println(cuentas[i]);
            if(cuentas[i].getBalance()<=50000){
                System.out.println("La cuenta de " +cuentas[i].nombre);
                System.out.println(" es REGULAR");
            }else{
                System.out.println("La cuenta de " +cuentas[i].nombre);
                System.out.println(" es PREMIUM");               
            }
        }
}
}
    

