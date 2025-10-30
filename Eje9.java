import java.util.Scanner;

class Eje9 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Tamñano del arreglo: ");
    int n = sc.nextInt();
    sc.nextLine();

    String[] arreglo = new String[n];

    for (int i = 0; i < n; i++) {

      System.out.print("Valor" + ": ");
      arreglo[i] = sc.nextLine();

    }

    for (int i = n - 1; i >= 0; i--) {

      System.out.println(arreglo[i]);

    }

  }

}
