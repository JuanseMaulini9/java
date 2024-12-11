import java.util.Scanner;

public class SumaDiagonal {
  public static void main(String[] args) {

    final int index = 3;

    int[][] matriz = new int[index][index];

    Scanner consola = new Scanner(System.in);

    int sumaDiagonal = 0;

    for(int ren = 0; ren < index; ren++){
      for(int col = 0; col < index; col++){
        System.out.print("Ingrese el valor en la pocision [" + ren + "][" + col + "]: ");
        matriz[ren][col] = consola.nextInt();
      }
    }

    for(int ren = 0; ren < index; ren++){
      for(int col = 0; col < index; col++){
        if(ren == col){
          sumaDiagonal = sumaDiagonal + matriz[ren][col];
        }
      }
    }
    System.out.println("\nLa suma de la diagonal es de " + sumaDiagonal);
  }
}
