/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;

        System.out.println("Ingrese el tamaño del vector: ");
        int num = leer.nextInt();
        int[] vector = new int[num];

        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("Ingrese el numero que quiere buscar: ");
        int find = leer.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("[" + vector[i] + "]" + "");
        }
        
        for (int i = 0; i < num; i++) {
            if (vector[i] == find) {
                contador++;
            }
        }
        System.out.println("");
        if (contador == 0) {
            System.out.println("El numero: " + find + " no ha sido encontrado");

        } else {
            System.out.println("El numero " + find + " ha sido encontrado "
                    + contador + " veces");
        }
    }

}
