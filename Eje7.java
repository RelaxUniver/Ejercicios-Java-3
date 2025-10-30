import java.util.Scanner;

public class Eje7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[5];

        System.out.println("Dame los 5 valores de la lista:");

        for (int i = 0; i < 5; i++) {

            arreglo[i] = sc.nextInt();
            sc.nextLine();

        }

        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {

            suma += arreglo[i];

        }

        System.out.println("Total: " + suma);

    }

}
