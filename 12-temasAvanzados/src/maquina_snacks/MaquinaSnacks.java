package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
  public static void main(String[] args) {
    maquinaSnacks();
  }

  public static  void maquinaSnacks(){

    boolean salir = false;
    Scanner consola = new Scanner(System.in);

    List<Snack> productos = new ArrayList<>();

    System.out.println("*** Maquina Snacks ***");
    Snacks.mostrarSnacks();

    while(!salir){
      try{
        int opcion = mostrarMenu(consola);
        salir = ejecutarOpciones(opcion, consola, productos);
      }catch(Exception e){
        System.out.println("Ocurrio un error: " + e.getMessage());
      }
      finally {
        System.out.println();
      }
    }
  }

  private static int mostrarMenu(Scanner consola){
    System.out.print("""
            Menu:
            1. Comprar snack
            2. Mostrar ticket
            3. Agregar Nuevo Snack
            4. Salir
            Elige una opcion:\s""");
    return Integer.parseInt(consola.nextLine());
  }

  private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){
    boolean salir = false;
    switch(opcion){
      case 1 -> comprarSnack(consola, productos);
      case 2 -> mostrarTicket(productos);
      case 3 -> agregarSnack(consola);
      case 4 -> {
        salir = true;
        System.out.println("saliendo...");
      }
      default -> System.out.println("Opcion invalida: " + opcion);
    }
    return salir;

  }

  private static void comprarSnack(Scanner consola, List<Snack> productos){

    System.out.print("Que snack quieres comprar (id)? ");
    int idSnack = Integer.parseInt(consola.nextLine());
    boolean snackEncontrado = false;
    for(Snack snack : Snacks.getSnacks()){
      if(idSnack == snack.getIdSnack()){
        productos.add(snack);
        System.out.println("Ok, snack agregado: " + snack);
        snackEncontrado = true;
        break;
      }
    }
    if(!snackEncontrado){
      System.out.println("Id de snack no encontrado: " + idSnack);
    }


  }
  private static void mostrarTicket(List<Snack> productos){
    String ticket = "*** Ticket de venta ***";
    double total = 0.0;
    for(Snack producto : productos){
      ticket += "\n\t-" + producto.getNombre() + " -  $" + producto.getPrecio();
      total += producto.getPrecio();
    }
    ticket += "\n\tTotal -> $" + total;
    System.out.println(ticket);
  }
  private static void agregarSnack(Scanner consola){
    System.out.print("Nombre del snack: ");
    String nombre = consola.nextLine();
    System.out.print("Precio del snack: ");
    double precio = Double.parseDouble(consola.nextLine());
    Snacks.agregarSnack(new Snack(nombre, precio));
    System.out.print("Tu snack se ha ahrehado correctamente");
    Snacks.mostrarSnacks();
  }

}
