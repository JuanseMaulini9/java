package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private IClienteServicio clienteServicio;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);


	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		// Levantar la fabrica de spring
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Finalizada");
	}

	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}
	private void zonaFitApp(){
		boolean salir = false;
		Scanner consola = new Scanner(System.in);
		while(!salir){
			int opcion = mostrarMenu(consola);
			salir = ejecutarOpciones(consola, opcion);
			logger.info(nl);

		}
	}

	private int mostrarMenu(Scanner consola){
		logger.info("""
						\n*** Aplicacion zonafit gym ***
						1. Listar Clientes
						2. Buscar Cliente
						3. Agregar Cliente
						4. Modificar Cliente
						5. Eliminar Cliente
						6. Salir
						Elige una opcion:\s""");
		return Integer.parseInt(consola.nextLine());
	}

	private boolean ejecutarOpciones(Scanner consola, int opcion){
		boolean salir = false;
		switch(opcion) {
			case 1 -> {
				logger.info(nl + "---Listado de clientes---" + nl);
				List<Cliente> clientes = clienteServicio.listarClientes();
				clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
			}
			case 2 -> {
				logger.info(nl + "--- Buscar cliente por id ---");
				logger.info("Id del cliente a buscar: ");
				int idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if(cliente != null){
					logger.info("Cliente encontrado: " + cliente + nl);
				} else {
					logger.info("Cliente no encontrado: " + cliente + nl);
				}
			}
			case 3 -> {
				logger.info("--- Agregar estudiante ---" + nl);
				logger.info("Nombre: ");
				String nombre = consola.nextLine();
				logger.info("Apellido: ");
				String apellido = consola.nextLine();
				logger.info("Membresia: ");
				int membresia = Integer.parseInt(consola.nextLine());
				Cliente nuevoCliente = new Cliente();
				nuevoCliente.setNombre(nombre);
				nuevoCliente.setApellido(apellido);
				nuevoCliente.setMembresia(membresia);
				clienteServicio.guardarCliente(nuevoCliente);
				logger.info("Cliente agregado: " + nuevoCliente + nl);
			}
			case 4 -> {
				logger.info("--- Modificar cliente ---" + nl);
				logger.info("Id cliente: ");
				int idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if(cliente != null){
					logger.info("Nombre: ");
					String nombre = consola.nextLine();
					logger.info("Apellido: ");
					String apellido = consola.nextLine();
					logger.info("Membresia: ");
					int membresia = Integer.parseInt(consola.nextLine());
					cliente.setNombre(nombre);
					cliente.setApellido(apellido);
					cliente.setMembresia(membresia);
					clienteServicio.guardarCliente(cliente);
					logger.info("Cliente modificado: " + cliente + nl);
				} else {
					logger.info("Cliente no encontrado: " + cliente + nl);
				}
			}
			case 5 -> {
				logger.info("--- Eliminar cliente ---");
				logger.info("Id cliente: ");
				int idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if(cliente != null){
					clienteServicio.eliminarCliente(cliente);
					logger.info("Cliente eliminado" + cliente + nl);
				} else {
					logger.info("Cliente no encontrado");
				}
			}
			case 6 -> {
				logger.info("saliendo..." + nl + nl);
				salir = true;
			}
			default -> logger.info("Opcion no reconocida");
		}
	return salir;
	}
}
