/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *
 * @author raffadev
 */
public class numerosMayoresA25 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

//Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
//alguno de ellos es mayor a 25.

      Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese dos numeros entero");
       int num1 = leer.nextInt();
       int num2 = leer.nextInt();
       
       if (num1 > 25 && num2 > 25)
           System.out.println("Ambos numeros son mayores a 25");
       else if (num1 > 25 || num2 > 25)
           System.out.println("Uno de los numeros es mayor a 25!!");
       else 
           System.out.println("ninguno de los numeros es mayor a 25");
       
                
}
   }

        
                
                
                
        
        
       
       
        
       
       
       
               
