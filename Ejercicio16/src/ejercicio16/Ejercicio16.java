/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int suma= 0;

         while (contador<5){            
            contador = contador + 1;
            System.out.println("ingrese un numero");
            int num = leer.nextInt();
            if (num == 0) {
                System.out.println("0 captado");
                break;
            }else{
                if (num > 0) {
                    suma = suma + num;
                }
            }
        }
        System.out.println("Sumatoria: "+suma);
    }
}
