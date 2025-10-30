import java.util.Scanner;

class Eje10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("¿Qué número desea verificar si es primo o no?");
    int n = sc.nextInt();
    sc.nextLine();

    int raiz = (int) Math.sqrt(n);

    boolean afirmar = false;

    if (n <= 1) {

      System.out.println("No es primo.");

    } else if (n == 2 || n == 3) {

      System.out.println("Si es primo.");

    } else {

      for (int i = 2; i < raiz; i++) {

        if (n % i == 0) {

          afirmar = true;
          break;

        }

      }

    }

    if (afirmar) {

      System.out.println("No es primo.");

    } else {

      System.out.println("Si es primo.");

    }

  }

}
