import java.util.Scanner;

public class MenuIterativo {
  public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    int opcion;
    boolean interfaz = true;

    while(interfaz){
      System.out.println("""
              Menu:
              1. Crear cuenta
              2. Eliminar cuenta
              3. Salir
              """);

      System.out.print("\nEscoje una opcion: ");
      opcion = consola.nextInt();

      String mensaje = switch(opcion){
        case 1 -> "Creando cuenta";
        case 2 -> "Eliminando cuenta";
        case 3 -> {
          interfaz = false;
          yield "saliendo...";
        }
        default -> "Escoje una opcion valida";
      };
      System.out.println(mensaje);
    }


  }
}
