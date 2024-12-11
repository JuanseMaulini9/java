import java.util.Scanner;

public class Matrices {
  public static void main(String[] args) {
    // Introducir valores a una matriz

    int renglones, columnas;
    Scanner consola = new Scanner(System.in);

    System.out.print("Proporciona los renglones: ");
    renglones = consola.nextInt();
    System.out.print("Proporciona las columnas: ");
    columnas = consola.nextInt();

    int[][] matriz = new int[renglones][columnas];
    for(int ren = 0; ren < renglones; ren++){
      for(int col = 0; col < columnas; col++){
        System.out.print("Valor [" + ren + "][" + col +"] = ");
        matriz[ren][col] = consola.nextInt();
      }
    }
    for(int ren = 0; ren < renglones; ren++){
      for(int col = 0; col < columnas; col++){
        System.out.println("matriz[" + ren + "][" + col + "] = " + matriz[ren][col]);

      }
    }
  }
}
