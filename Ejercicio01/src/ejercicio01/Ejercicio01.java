/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numeros a comparar");
        int numUno = leer.nextInt();
        int numDos = leer.nextInt();
        boolean validacion=true;
        while(validacion==true){
            System.out.println("Menu\n"
                    + "1 - Sumar\n"
                    + "2 - Resta\n"
                    + "3 - Multip\n"
                    + "4 - Divis\n"
                    + "5 - Salir\n"
                    + "elija opcion");
            int respuesta = leer.nextInt();
            
            switch (respuesta) {
                case 1:
                    int suma = numUno + numDos;
                    System.out.println("La suma es: " + suma);
                    continue;
                case 2:
                    int resta = numUno - numDos;
                    System.out.println("Resta: " + resta);
                    continue;
                case 3:
                    int multiplicacion = numUno * numDos;
                    System.out.println("Multiplicacion: " + multiplicacion);
                    continue;
                case 4:
                    int division = numUno % numDos;
                    System.out.println("Division: " + division);
                    continue;
                case 5:
                    System.out.println("Desea salir? (S/N)");
                    String Out = leer.next();
                    Out = Out.toUpperCase();
                    if (Out.equals("S")) {
                        validacion = false;
                        System.out.println("Hasta la próxima");
                    }
                    break;
                default:
                    System.out.println("Ha ingresado una opcion no valida");

            }
        }
  
    }
}
