import java.util.Scanner;

public class Eje6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer valor: ");
        double num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Dame el segundo valor: ");
        double num2 = sc.nextInt();
        sc.nextLine();

        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);

        System.out.println("La raíz del primer valor es: " + raiz1);
        System.out.println("La raíz del segundo valor es: " + raiz2);

        double multiplicacion = raiz1 * raiz2;

        System.out.println("La multiplicación de las 2 raices es: " + multiplicacion);


    }
    
}
