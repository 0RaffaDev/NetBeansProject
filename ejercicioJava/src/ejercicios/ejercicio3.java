/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author raffadev
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        //en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        
        String fraseM = toUpperCase(frase);
        System.out.println("Mayuscula: " + fraseM);
        
        String frasem = toLowerCase(frase);
        System.out.println("Minuscula: " + frasem);
        
        
        
    }
    
}
