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
public class numero0a10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
    
       int nota = 55;
       
       while (nota > 10 || nota < 0){
           nota = leer.nextInt();
       }
               
    }
    
}
