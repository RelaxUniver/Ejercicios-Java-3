import java.util.Scanner;

class Eje12 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("¿Qué palabra desea ver si es polindroma?");
    String palabra = sc.nextLine();

    StringBuilder sb = new StringBuilder(palabra);

    String invertida = sb.reverse().toString();

    if (palabra.equalsIgnoreCase(invertida)) {

      System.out.println("Si es polindroma");

    } else {

      System.out.println("No es polindroma");

    }

  }

}
