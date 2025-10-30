import java.util.Scanner;

class Eje18 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    int[][] matriz = new int[n][n];

    for (int i = 0; i < matriz.length; i++) {

      for (int j = 0; j < matriz.length; j++) {

        matriz[i][j] = sc.nextInt();
        sc.nextLine();

      }
    }

    for (int i = 0; i < matriz.length; i++) {

      for (int j = 0; j < matriz.length; j++) {

        matriz[i][j] *= 2;

        if (j == matriz.length - 1) {

          System.out.println(matriz[i][j]);

        } else {

          System.out.print(matriz[i][j] + " ");

        }

      }

    }

  }

}
