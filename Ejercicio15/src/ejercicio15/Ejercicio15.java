package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        boolean validacion;
        System.out.println("Ingrese dos numeros enteros para comparar: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        validacion = true;
        
         while (validacion == true) {
            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción:");
            int rta = leer.nextInt();
            switch (rta) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma es " + suma);
                    continue;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta es " + resta);
                    continue;
                case 3:
                    int multip = num1 * num2;
                    System.out.println("La multip es " + multip);
                    continue;
                case 4:
                    double division = num1 / num2;
                    System.out.println("La division es " + division);
                    continue;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String out = leer.next();
                    out = out.toUpperCase();
                    if (out.equals("S")) {
                        validacion = false;
                        System.out.println("Hasta la próxima");
                    }
                    break;
                default:
                    System.out.println("Ha ingresado una opción no valida");
            }
         }    
        
    }

}
