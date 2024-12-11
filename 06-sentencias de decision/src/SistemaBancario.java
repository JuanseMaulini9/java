import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos al sistema bancario ***");

        Scanner consola = new Scanner(System.in);
        System.out.println("Deseas salir del sistema (true/false)?");
        boolean salirSistema = consola.nextBoolean();

        if(!salirSistema){
            System.out.println("Continuamos dentro del sistema");
        } else {
            System.out.println("Saliendo del sistema...");
        }
    }
}
