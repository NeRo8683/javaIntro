/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota;
        do {
            System.out.println("ingrese nota");
            nota = leer.nextInt();
        } while (nota < 0 || nota > 10);

    }

}

// Scanner leer = new Scanner(System.in);
//        int nota;
//        do {
//            System.out.println("Ingrese una nota");
//            nota = leer.nextInt();
//        } while (nota < 0 || nota >10);
//        System.out.println("La nota ingresada es: "+nota);
