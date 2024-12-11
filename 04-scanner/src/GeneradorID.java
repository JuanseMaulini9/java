import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = consola.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = consola.nextLine();
        System.out.println("Ingrese su año de nacimiento(yyyy): ");
        String year = consola.nextLine();

        Random random = new Random();
        int numeroAleatorio = random.nextInt(9999) + 1;

        nombre = nombre.toUpperCase().substring(0,2);
        apellido = apellido.toUpperCase().substring(0,2);
        year = year.substring(2);

        System.out.printf("""
                ID: %s%s%s%04d
                """, nombre, apellido, year, numeroAleatorio);

    }
}
