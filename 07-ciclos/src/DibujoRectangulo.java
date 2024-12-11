import java.util.Scanner;

public class DibujoRectangulo {
  public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    System.out.println("Proporciona el numero de final: ");
    int numeroFilas = consola.nextInt();

    for(int fila = 1; fila <= numeroFilas; fila++){
      String espacioBlanco = " ".repeat(numeroFilas - fila);
      String asteriscos = "*".repeat(2 * fila -1);
      System.out.println(espacioBlanco + asteriscos);
    }
  }
}
