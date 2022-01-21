/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int[] num = new int[10];              
        
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            System.out.print(num[i]+", ");
        }
        System.out.println("");
        
         for (int i = num.length-1; i >= 0; i--) {
            num[i] = i + 1;
            System.out.print(num[i]+", ");
        }
    }    
}
