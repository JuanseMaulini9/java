import java.util.Scanner;

public class ValidacionPassword {
  public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    boolean valido = false;

    while (!valido) {
      System.out.println("Ingrese la contraseña: ");
      String password = consola.nextLine();
      if (password.length() >= 6) {
        System.out.println("Contraseña valida");
        valido = true;
      } else {
        System.out.println("Contraseña invalida vuelva a intentar");
      }

    }


  }
}
