import java.util.Scanner;

class Eje14 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    int divide = 2;

    while (n > 1) {

      if (n % divide == 0) {

        n = n / divide;
        System.out.print(divide + " ");

      } else {

        divide++;

      }

    }

  }

}
