/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numUno = leer.nextInt();
        
        
        if (numUno%2==0){
            System.out.println(numUno+" es PAR ");
        }else{
            System.out.println(numUno+" es IMPAR ");
        }
    }
    
}
