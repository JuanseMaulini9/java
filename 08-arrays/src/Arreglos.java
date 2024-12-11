import java.util.Scanner;

public class Arreglos {
  public static void main(String[] args) {

    Scanner consola  = new Scanner (System.in);
    System.out.println("Proporciona el rango del arreglo: ");
    int largoArreglo = consola.nextInt();

    int[] enteros = new int[largoArreglo];

    for(int i = 0; i < largoArreglo; i++){
      System.out.print("Proporciona enteros[" + i + "] = ");
      enteros[i] = consola.nextInt();
    }

    System.out.println("\nImpresion del arreglo: ");
    for(int i = 0; i < largoArreglo; i++){
      System.out.println("indice " + i +": " + enteros[i]);
    }
  }
}
