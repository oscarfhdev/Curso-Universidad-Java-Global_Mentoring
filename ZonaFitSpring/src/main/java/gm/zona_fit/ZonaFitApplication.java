package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner{

	@Autowired
	private IClienteServicio clienteServicio;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Iniciando la aplicación");

		// Levanta la fábrica de spring
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Aplicación finalizada");

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(nl + nl + "*** Aplicación ZonaFit (GYM) ***" + nl);

		var salir = false;
		var consola = new Scanner(System.in);

		while (!salir){
			try {
				var opcion = mostrarmenu(consola);
				salir = ejecutarOpciones(opcion, consola);
				logger.info(nl);
			}
			catch (Exception e){
				logger.info("Ocurrió un error: " + e.getMessage() + nl);
			}
		}

	}

	private Integer mostrarmenu(Scanner consola){
		logger.info("""
		\nMenú:
		1. Listar clientes
		2. Buscar cliente
		3. Agregar cliente
		4. Modificar cliente
		5. Eliminar cliente
		6. Salir
		Escoge una opción:\s""");
		return Integer.parseInt(consola.nextLine());
	}

	private boolean ejecutarOpciones(Integer opcion, Scanner consola){
		switch (opcion){
			case 1 -> listarClientes();
			case 2 -> buscarCliente(consola);
			case 3 -> agregarCliente(consola);
			case 4 -> actualizarCliente(consola);
			case 5 -> eliminarCliente(consola);
			case 6 -> {
				logger.info("Saliendo del sistema..." + nl + nl);
				return true;
			}
			default -> logger.info("Opción no reconocida: " + opcion);
		}
		return false;
	}

	private void listarClientes(){
		logger.info(nl + "--- Listar clientes ---" + nl);
		clienteServicio.listarClientes().forEach(cliente -> logger.info(cliente.toString() + nl));
	}

	private void buscarCliente(Scanner consola){
		logger.info(nl + "--- Buscar cliente ---" + nl);
		logger.info("Ingresa el id del cliente que deseas buscar: ");
		var idABuscar = Integer.parseInt(consola.nextLine());

		var clienteEncontrado = clienteServicio.buscarClientePorId(idABuscar);

		if (clienteEncontrado != null){
			logger.info("Cliente encontrado correctamente: " + clienteEncontrado + nl);
		}
		else {
			logger.info("No se ha encontrado ningún cliente con id: " + idABuscar + nl);
		}
	}

	private void agregarCliente(Scanner consola){
		logger.info(nl + "--- Agregar cliente ---" + nl);
		logger.info("Ingrese el nombre del nuevo cliente: ");
		var nombre = consola.nextLine();
		logger.info("Ingrese el apellido del nuevo cliente: ");
		var apelido = consola.nextLine();
		logger.info("Ingrese la membresía del nuevo cliente: ");
		var membresia = Integer.parseInt(consola.nextLine());

		var clienteAAgregar = new Cliente(null, nombre, apelido, membresia);

		clienteServicio.guardarCliente(clienteAAgregar);
		logger.info("Cliente agregado corectamente: " + clienteAAgregar+ nl);
	}

	private void actualizarCliente(Scanner consola){
		logger.info(nl + "--- Actualizar cliente ---" + nl);
		logger.info("Ingresa el id del cliente a actualizar: ");
		var idCliente = Integer.parseInt(consola.nextLine());

		if (clienteServicio.buscarClientePorId(idCliente) != null){
			logger.info("Ingrese el nombre del cliente: ");
			var nombre = consola.nextLine();
			logger.info("Ingrese el apellido del cliente: ");
			var apelido = consola.nextLine();
			logger.info("Ingrese la membresía del cliente: ");
			var membresia = Integer.parseInt(consola.nextLine());

			var clienteActualizado = new Cliente(idCliente, nombre, apelido, membresia);
			clienteServicio.guardarCliente(clienteActualizado);
			logger.info("Cliente actualizado correctamente" + clienteActualizado +  nl);
		}
		else {
			logger.info("No se ha encontrado ningún cliente con id: " + idCliente + nl);
		}


	}

	private void eliminarCliente(Scanner consola){
		logger.info(nl + "--- Eliminar cliente ---" + nl);
		logger.info("Ingresa el id del cliente a eliminar: ");
		var idCliente = Integer.parseInt(consola.nextLine());

		var clienteABuscar = clienteServicio.buscarClientePorId(idCliente);
		if (clienteABuscar != null){
			clienteServicio.eliminarCliente(clienteABuscar);
			logger.info("Cliente eliminado correctamente" + nl);
		}
		else {
			logger.info("No se ha encontrado ningún cliente con esta id: " + idCliente + nl);
		}
	}
}
