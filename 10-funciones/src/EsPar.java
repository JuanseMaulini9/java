import java.util.Scanner;

public class EsPar {

  static boolean esPar(int numero){
    return numero % 2 == 0;
  }

  public static void main(String[] args) {
    System.out.println("Proporciona un valor numerico: ");
    Scanner consola = new Scanner(System.in);
    int numero = consola.nextInt();
    System.out.println("numero par? " + (esPar(numero) ? "Si" : "No"));
  }
}
