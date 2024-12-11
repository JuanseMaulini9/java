import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        final int KILOMETROS_REDONDA = 3;

        System.out.print("tienes credencial de estudiante (true/false)? ");
        boolean tieneCredencial = console.nextBoolean();

        System.out.print("A cuantos kilometros vives? ");
        int kilometros = console.nextInt();

        boolean result = tieneCredencial || kilometros <= KILOMETROS_REDONDA;

        System.out.println("Se le puede prestar libros? " + result);
    }
}
