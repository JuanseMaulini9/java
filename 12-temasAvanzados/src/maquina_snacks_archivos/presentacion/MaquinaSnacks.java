package maquina_snacks_archivos.presentacion;

import maquina_snacks_archivos.dominio.Snack;
import maquina_snacks_archivos.servicio.IServicioSnacks;
import maquina_snacks_archivos.servicio.ServicioSnacksArchivos;
import maquina_snacks_archivos.servicio.ServicioSnacksLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
  public static void main(String[] args) {
    maquinaSnacks();
  }

  public static void maquinaSnacks() {

    boolean salir = false;
    Scanner consola = new Scanner(System.in);
    //IServicioSnacks servicioSnacks = new ServicioSnacksLista();
    IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();
    List<Snack> productos = new ArrayList<>();

    System.out.println("*** Maquina Snacks ***");
    servicioSnacks.mostrarSnacks();

    while (!salir) {
      try {
        int opcion = mostrarMenu(consola);
        salir = ejecutarOpciones(opcion, consola, productos, servicioSnacks);
      } catch (Exception e) {
        System.out.println("Ocurrio un error: " + e.getMessage());
      } finally {
        System.out.println();
      }
    }
  }

  private static int mostrarMenu(Scanner consola) {
    System.out.print("""
            Menu:
            1. Comprar snack
            2. Mostrar ticket
            3. Agregar Nuevo Snack
            4. Inventario Snacks
            5. Salir
            Elige una opcion:\s""");
    return Integer.parseInt(consola.nextLine());
  }

  private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos, IServicioSnacks servicioSnacks) {
    boolean salir = false;
    switch (opcion) {
      case 1 -> comprarSnack(consola, productos, servicioSnacks);
      case 2 -> mostrarTicket(productos);
      case 3 -> agregarSnack(consola, servicioSnacks);
      case 4 -> listarInventarioSnacks(consola, servicioSnacks);
      case 5 -> {
        salir = true;
        System.out.println("saliendo...");
      }
      default -> System.out.println("Opcion invalida: " + opcion);
    }
    return salir;

  }

  private static void listarInventarioSnacks(Scanner consola, IServicioSnacks servicioSnacks){
    servicioSnacks.mostrarSnacks();
  }

  private static void comprarSnack(Scanner consola, List<Snack> productos, IServicioSnacks servicioSnacks) {

    System.out.print("Que snack quieres comprar (id)? ");
    int idSnack = Integer.parseInt(consola.nextLine());
    boolean snackEncontrado = false;
    for (Snack snack : servicioSnacks.getSnacks()) {
      if (idSnack == snack.getIdSnack()) {
        productos.add(snack);
        System.out.println("Ok, snack agregado: " + snack);
        snackEncontrado = true;
        break;
      }
    }
    if (!snackEncontrado) {
      System.out.println("Id de snack no encontrado: " + idSnack);
    }


  }

  private static void mostrarTicket(List<Snack> productos) {
    String ticket = "*** Ticket de venta ***";
    double total = 0.0;
    for (Snack producto : productos) {
      ticket += "\n\t-" + producto.getNombre() + " -  $" + producto.getPrecio();
      total += producto.getPrecio();
    }
    ticket += "\n\tTotal -> $" + total;
    System.out.println(ticket);
  }

  private static void agregarSnack(Scanner consola, IServicioSnacks servicioSnacks) {
    System.out.print("Nombre del snack: ");
    String nombre = consola.nextLine();
    System.out.print("Precio del snack: ");
    double precio = Double.parseDouble(consola.nextLine());
    servicioSnacks.agregarSnack(new Snack(nombre, precio));
    System.out.print("Tu snack se ha ahrehado correctamente");
    servicioSnacks.mostrarSnacks();
  }

}