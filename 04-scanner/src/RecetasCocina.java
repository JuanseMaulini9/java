import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la receta: ");
        String nombreReceta = consola.nextLine();

        System.out.print("Ingrese los ingredientes de la receta: ");
        String ingredientes = consola.nextLine();

        System.out.print("Ingrese el tiempo de la receta: ");
        var tiempoReceta = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese la dificultad de la receta(Facil/Media/Alta): ");
        String dificultad = consola.nextLine();

        System.out.println("\n receta:");
        System.out.println("nombre: " + nombreReceta);
        System.out.println("ingredientes: " + ingredientes);
        System.out.println("tiempo: " + tiempoReceta + " minutos");
        System.out.println("dificultad: " + dificultad);

    }


}
