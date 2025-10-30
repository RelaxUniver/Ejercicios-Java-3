import java.util.Scanner;

public class Eje2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 7;

        System.out.print("Dame un número: ");
        a = sc.nextInt();

        if (a % 2 == 0) {

            System.out.println("Es par");

        } else {

            System.out.println("Es impar");

        }

    }
    
}
