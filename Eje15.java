import java.util.Scanner;

class Eje15 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String number = sc.nextLine();
    int total = 0;

    for (int i = 0; i < number.length(); i++) {

      total += number.charAt(i) - '0';

    }

    System.out.println("Total: " + total);

  }

}
