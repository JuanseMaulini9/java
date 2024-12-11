import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner consola = new Scanner(System.in);
    int numero = random.nextInt(50) + 1;
    boolean finalizar = false;
    int numeroIntentos = 0;

    while (!finalizar) {
      System.out.print("Ingrese un numero: ");
      int intento = consola.nextInt();
      if (intento == numero) {
        System.out.println("Ganaste, en " + numeroIntentos + " intentos");
        finalizar = true;
      } else if (intento > numero) {
        System.out.println("Intenta otra vez, con un numero mas chico");
        numeroIntentos++;
      } else {
        System.out.println("Intenta otra vez, con un numero mas grande");
        numeroIntentos++;
      }
    }


  }
}
