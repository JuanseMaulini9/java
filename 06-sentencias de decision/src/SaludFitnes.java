import java.util.Scanner;

public class SaludFitnes {
    public static void main(String[] args) {

        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASOS = 0.04;

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String nombre = consola.nextLine();

        System.out.println("Ingrese los pasos caminados hoy: ");
        int pasos = consola.nextInt();

        double caloriasQuemadas = pasos * CALORIAS_POR_PASOS;
        boolean metaAlcanzada = pasos >= META_PASOS_DIARIOS;
        int pasosRestantes = META_PASOS_DIARIOS - pasos;

        if(metaAlcanzada){
            System.out.println("Alcanzo la meta de pasos diarios");
        } else {
            System.out.println("No alcanzaste la meta, te faltan: " + pasosRestantes);
        }
        System.out.println("calorias quemadas: " + caloriasQuemadas);

    }
}
