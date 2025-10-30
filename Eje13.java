import java.util.Scanner;

class Eje13 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    int a = 0;
    int b = 1;
    int c = 0;

    int i = 2;

    System.out.print(a + " ");
    System.out.print(b + " ");

    do {

      c = a + b;

      System.out.print(c + " ");

      a = b;
      b = c;

      i++;

    } while (i < n);

  }

}
