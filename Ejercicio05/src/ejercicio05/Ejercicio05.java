/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Temperatura");
        int Celsius = leer.nextInt();
        int Fahrenheit = 32 + (9 * Celsius / 5);
        System.out.println(Celsius+"°C es = a "+Fahrenheit+"°F");
    }
    
}
