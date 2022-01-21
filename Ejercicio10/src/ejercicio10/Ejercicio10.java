/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        String frase = leer.nextLine();
        
        if (frase.length()==8) {
               System.out.println("CORRECTO");            
        }else{
            System.out.println("INCORRECTO");
        }
    }

}
