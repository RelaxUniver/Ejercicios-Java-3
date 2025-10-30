import java.util.Scanner;

class Eje17 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("¿Cuántos clientes quieres agregar al cajero?");
    int n = sc.nextInt();
    sc.nextLine();

    String[][] cajero = new String[n][3];
    int limite = 100;

    for (int i = 0; i < cajero.length; i++) {

      System.out.print("Nombre del Cliente: ");
      cajero[i][0] = sc.nextLine();
      System.out.print("Número de la Tarjeta: ");
      cajero[i][1] = sc.nextLine();
      System.out.print("Saldo del Cliente: ");
      cajero[i][2] = sc.nextLine();

    }

    System.out.println("¿Cuál es tu número de la tarjeta?");
    String nT = sc.nextLine();

    for (int i = 0; i < cajero.length; i++) {

      if (cajero[i][1].equals(nT)) {

        System.out.println("Número de la Tarjeta verificado...");

        for (int j = 0; j < 3; j++) {

          System.out.print(cajero[i][j] + " ");

        }

        System.out.println();

        System.out
            .println("Opciones: \n #1 Añadir dinero a su cuenta \n #2 Extraer el dinero de su cuenta \n #3 Salir");
        int opc = sc.nextInt();
        sc.nextLine();

        switch (opc) {

          case 1:

            System.out.println("¿Cuál es el monto que quieres añadir a tu cuenta?");
            int monto = sc.nextInt();
            sc.nextLine();

            int suma = Integer.parseInt(cajero[i][2]);

            int total = suma + monto;

            String sumaTxt = Integer.toString(total);

            cajero[i][2] = sumaTxt;

            System.out.println("Saldo Actual: " + cajero[i][2]);

            break;

          case 2:

            System.out.println("¿Qué cantidad se quiere llevar?");
            int llevar = sc.nextInt();
            sc.nextLine();

            if (llevar <= limite) {

              int resta = Integer.parseInt(cajero[i][2]);

              int totalR = resta - llevar;

              String restaTxt = Integer.toString(totalR);

              cajero[i][2] = restaTxt;

              System.out.println("Saldo Actual: " + cajero[i][2]);

              break;

            }

          case 3:

            break;

          default:

            System.out.println("Opcion invalida");

            break;
        }

      } else {

        System.out.println("Tarjeta no existe...");

      }

    }

  }

}
