/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("Doble: "+doble);
        System.out.println("Triple: "+triple);
        System.out.println("Raiz: "+raiz);
    }

}
