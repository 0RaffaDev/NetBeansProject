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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros a sumar");
        System.out.println("Por favor ingrese los numeros por separado");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
                
                
               
    }
    
}
