class Eje11 {

  public static void main(String[] args) {

    int[] bubbleSort = {

        54, 12, 89, 43, 23, 8, 29

    };

    boolean intercambio = false;

    int temp = 0;

    do {

      intercambio = false;

      for (int i = 0; i < bubbleSort.length - 1; i++) {

        if (bubbleSort[i] > bubbleSort[i + 1]) {

          temp = bubbleSort[i];
          bubbleSort[i] = bubbleSort[i + 1];
          bubbleSort[i + 1] = temp;

          intercambio = true;

        }

      }

    } while (intercambio == true);

    for (int j = 0; j < bubbleSort.length; j++) {

      if (j < bubbleSort.length - 1) {

        System.out.print(bubbleSort[j] + ", ");

      } else {

        System.out.println(bubbleSort[j]);

      }

    }

  }

}
