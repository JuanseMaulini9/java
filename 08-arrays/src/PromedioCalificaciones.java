import java.util.Scanner;

public class PromedioCalificaciones {
  public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);

    System.out.print("Cuantas calificaciones deseas agregar? ");
    int largo = consola.nextInt();

    int[] calificaciones = new int[largo];

    int promedio = 0;

    for(int i = 0; i < largo; i++){

      System.out.print("calificacion [" + i + "] = " );
      calificaciones[i] = consola.nextInt();
      promedio = promedio + calificaciones[i];

    }

    promedio = promedio / largo;

    System.out.print("\nPromedio de las calificaciones: " + promedio);
  }
}
