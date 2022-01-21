/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese motor");
        int motor = leer.nextInt();
        
        switch(motor){
            case 1:
                System.out.println("bomba de agua");
                break;
            case 2:
                System.out.println("bomba de gas");
                break;
            case 3:
                System.out.println("bomba de hormigon");
                break;
            case 4:
                System.out.println("bomba de pasta");
                break;
            default:
                System.out.println("no hay motor");
                break;
        }
       
    }
    
}
