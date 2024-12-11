package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.List;
import java.util.Scanner;

public class ZonaFitApp {
  public static void main(String[] args) {
    zonaFitApp();
  }

  private static void zonaFitApp(){
    boolean salir = false;
    Scanner consola = new Scanner(System.in);
    ClienteDAO clienteDao = new ClienteDAO();

    while(!salir){
      try{
        int opcion = mostrarMenu(consola);
        salir = ejecutarOpciones(consola, opcion, clienteDao);
      } catch(Exception e){
        System.out.println("Error al ejecutar opciones: " + e.getMessage());
      }
      System.out.println();
    }
  }

  private static int mostrarMenu(Scanner consola){
    System.out.print("""
            *** Zona Fit (GYM)
            1. Listar Clientes
            2. Buscar Cliente
            3. Agregar Cliente
            4. Modificar Cliente
            5. Eliminar Cliente
            6. Salir
            Elije una opcion:\s""");
    return Integer.parseInt(consola.nextLine());
  }

  private static boolean ejecutarOpciones(Scanner consola, int opcion, IClienteDAO clienteDao){
    boolean salir = false;
    switch(opcion){
      case 1 -> {
        System.out.println("--- Listado de clientes ---");
         List<Cliente> clientes = clienteDao.listarCliente();
         clientes.forEach(System.out::println);
      }
      case 2 -> {
        System.out.println("--- Buscar cliente ---");
        System.out.print("Introduce el id del cliente a buscar: ");
        int idCliente = Integer.parseInt(consola.nextLine());
        Cliente cliente = new Cliente(idCliente);
        boolean encontrado = clienteDao.buscarClientePorId(cliente);
        if(encontrado){
          System.out.println("cliente encontrado: " + cliente);
        } else{
          System.out.println("cliente no encontrado: " + cliente);
        }
      }
      case 3 -> {
        System.out.println("--- Agregar cliente ---");
        System.out.print("Nombre: ");
        String nombre = consola.nextLine();
        System.out.print("Apellido: ");
        String apellido = consola.nextLine();
        System.out.println("Membresia: ");
        int membresia = Integer.parseInt(consola.nextLine());

        Cliente nuevoCliente = new Cliente(nombre, apellido, membresia);
        boolean agregado = clienteDao.agregarCliente(nuevoCliente);
        if(agregado){
          System.out.println("El cliente se creo con exito: " + nuevoCliente);
        } else {
          System.out.println("Cliente no agregado: " + nuevoCliente);
        }
      }

      case 4 -> {
        System.out.println("--- Modificar cliente ---");
        System.out.print("id del cliente que desea modificar: ");
        int idCliente = Integer.parseInt(consola.nextLine());
        System.out.print("nombre: ");
        String nombre = consola.nextLine();
        System.out.println("apellido: ");
        String apellido  =consola.nextLine();
        System.out.println("membresia: ");
        int membresia = Integer.parseInt(consola.nextLine());

        Cliente cliente = new Cliente(idCliente, nombre, apellido, membresia);
        boolean modificado = clienteDao.modificarCliente(cliente);
        if(modificado){
          System.out.println("Cliente modificado: "  + cliente);
        } else {
          System.out.println("Cliente no modificado: " + cliente);
        }
      }
      case 5 -> {
        System.out.println("--- Eliminar cliente ---");
        System.out.print("Ingrese el id a eliminar: ");
        int idCliente = Integer.parseInt(consola.nextLine());
        Cliente cliente = new Cliente(idCliente);
        boolean eliminado = clienteDao.eliminarCliente(cliente);
        if(eliminado){
          System.out.println("Cliente eliminado: " + cliente);
        } else{
          System.out.println("Cliente no eliminado: " + cliente);
        }
      }
      case 6 -> {
        System.out.println("saliendo del sistema...");
        salir = true;
      }
      default -> System.out.println("Seleccione una opcion valida");

    }
    return salir;
  }
}
