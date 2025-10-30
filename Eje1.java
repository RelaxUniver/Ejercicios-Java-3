import java.util.Scanner;

public class Eje1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 5;
        int b = 7;

        System.out.println("Dame el primer valor que desea sumar");
        a = sc.nextInt();
        System.out.println("Dame el segundo valor que desea sumar");
        b = sc.nextInt();
        a += b;
        System.out.println("Resultado: " + a);

    }

}