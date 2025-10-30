import java.util.Scanner;

public class Eje8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] estudiantes = {"Ana", "Pedro", "Juan", "Pepito", "Maria"};

        System.out.println("¿Qué estudiante deseas buscar?");
        String buscar = sc.nextLine();

        boolean verificado = false;

        for(int i = 0; i < estudiantes.length; i++) {

            if (estudiantes[i].equals(buscar)) {

                System.out.println("Ese estudiante si esta.");
                verificado = true;

            } 

        }

        if (verificado == false) {

            System.out.println("Ese estudiante no esta.");

        }

    }
    
}
