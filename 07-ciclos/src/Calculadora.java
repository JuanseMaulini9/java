import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    boolean salir = false;
    int operando1, operando2, resultado;


    while(!salir){
      System.out.print("""
              1. Suma
              2. Resta
              3. Multiplicacion
              4. Division
              5. salir
              
              Seleccione una opcion: 
              """);
      int opcion = consola.nextInt();
      switch(opcion) {
        case 1 -> {
          System.out.print("Ingrese el primer valor que desea sumar: ");
          operando1 = consola.nextInt();
          System.out.print("Ingrese el segundo valor que desea sumar: ");
          operando2 = consola.nextInt();
          resultado = operando1 + operando2;
          System.out.println("resultado suma: " + resultado);
        }
        case 2 -> {
          System.out.print("Ingrese el primer valor que desea restar: ");
          operando1 = consola.nextInt();
          System.out.print("Ingrese el segundo valor que desea restar: ");
          operando2 = consola.nextInt();
          resultado = operando1 - operando2;
          System.out.println("resultado resta: " + resultado);
        }
        case 3 -> {
          System.out.print("Ingrese el primer valor que desea multiplicar: ");
          operando1 = consola.nextInt();
          System.out.print("Ingrese el segundo valor que desea multiplicar: ");
          operando2 = consola.nextInt();
          resultado = operando1 * operando2;
          System.out.println("resultado multiplicacion: " + resultado);
        }
        case 4 -> {
          System.out.print("Ingrese el valor que desea dividir: ");
          operando1 = consola.nextInt();
          System.out.print("Ingrese por que valor desea dividir: ");
          operando2 = consola.nextInt();
          if(operando2 != 0){
            resultado = operando1 / operando2;
            System.out.println("resultado division: " + resultado);
          } else {
            System.out.println("No se puede divir por 0");
          }
        }
        case 5 -> {
          salir = true;
          System.out.println("saliendo...");
        }
        default -> System.out.println("seleccione una opcion correcta");
      }
    }

  }
}
