import java.util.Scanner;

public class Eje4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número para mostrar su tabla de multiplicar.");
        int a = sc.nextInt();
        sc.nextLine();

        int b = 0;

        for (int i = 1; i <= 10; i++) {

            b = a * i;

            System.out.println(a + " * " + i + " = " + b);

        }

    }
    
}
