import java.util.Scanner;

public class CajeroAutomatico {
  public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);
    double saldo = 1000.00;
    boolean salir = false;
    int opcion;

    while(!salir){
      System.out.println("""
              Operaciones que puedes realizar:
              1. Consultar Saldo
              2. Retirar
              3. Depositar
              4. Salir
              Escoge una opcion: 
              """);
      opcion = consola.nextInt();

      switch(opcion){
        case 1 -> System.out.println("Su saldo es de " + saldo);
        case 2 -> {
          System.out.println("Ingrese un monto para retirar");
          int retiro = consola.nextInt();
          if(retiro <= saldo){
            System.out.println("retirando...");
            saldo = saldo - retiro;
            System.out.println("Su nuevo saldo es de: " + saldo);
          } else {
            System.out.println("no cuenta con ese saldo en la cuenta");
          }
        }
        case 3 -> {
          System.out.println("Ingrese el monto a depositar");
          int deposito = consola.nextInt();
          saldo = saldo + deposito;
          System.out.println("deposito realizado con exito");
        }
        case 4 -> {
          salir = true;
          System.out.println("saliendo...");
        }
        default -> System.out.println("Seleccione una opcion valida");
      }
    }


  }
}
