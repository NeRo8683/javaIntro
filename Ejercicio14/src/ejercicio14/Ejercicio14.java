/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese limite");
        int limite = leer.nextInt();
        int suma = 0;
        while (limite > suma){
            System.out.println("Ingrese numero");
            int num = leer.nextInt();
            suma = suma +num;
        }
        System.out.println("la sumatoria del los numeros ingresados es: "+ suma);
    }
    
}
