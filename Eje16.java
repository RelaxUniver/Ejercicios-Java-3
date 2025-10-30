import java.util.Scanner;

class Eje16 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    sc.close();

    int resultado = 1;

    for (int i = 1; i < n; i++) {

      if (i == 1) {

        resultado *= n;

      }

      resultado *= (n - i);

    }

    System.out.println(resultado);

  }

}
