/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numUno = leer.nextInt();
        System.out.println("Ingrese numero");
        int numDos = leer.nextInt();
        int resultado = numUno+numDos;
        System.out.println("El resultado es: "+resultado);
    }
    
}
