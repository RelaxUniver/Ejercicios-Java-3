public class Eje5 {

    public static void main(String[] args) {

        int a = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");
                a ++;

            }

        }

        System.out.println();

        System.out.println("La cantidad de numeros pares es: " + a);

    }
    
}
