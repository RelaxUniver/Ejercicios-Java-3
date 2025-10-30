import java.util.Scanner;

public class Eje3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba un número: ");
        int a = sc.nextInt();
        sc.nextLine();

        if (a > 0) {

            System.out.println("El número es positivo.");

        } else if (a < 0) {

            System.out.println("El número es negativo.");

        } else {

            System.out.println("El número es cero.");

        }


    }
    
}
