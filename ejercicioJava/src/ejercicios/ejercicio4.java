/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author raffadev
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        //Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de grados C para pasar a F");
        double grados = leer.nextInt();
        
        double f = 32 + (9 * grados / 5);
        System.out.println("La cantidad de " + grados + " grados son pasados a F: " + f);
        
        
        
         
     
                
    }
    
}
