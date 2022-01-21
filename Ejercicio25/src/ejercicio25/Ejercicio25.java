package ejercicio25;

public class Ejercicio25 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 10);
            }
        }

        System.out.println("La matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("La matriz traspuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }

    }

}
