/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        String frase = leer.nextLine();
        String letra = frase.substring(0,1);
        
        if (letra.toUpperCase().equals("A")) {
               System.out.println("CORRECTO");            
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
