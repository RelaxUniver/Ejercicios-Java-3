class Eje19 {

  public static void main(String[] args) {

    int[][] matriz1 = {

        { 6, 8, 7 },
        { 9, 2, 1 },
        { 3, 5, 3 }

    };

    int[][] matriz2 = {

        { 3, 2, 1 },
        { 6, 5, 4 },
        { 9, 8, 7 }

    };

    int[][] resultado = new int[3][3];

    for (int i = 0; i < 3; i++) {

      for (int j = 0; j < 3; j++) {

        resultado[i][j] = matriz1[i][j] + matriz2[i][j];

        if (j == 2) {

          System.out.println(resultado[i][j]);

        } else {

          System.out.print(resultado[i][j] + " ");

        }
      }
    }

  }
}
