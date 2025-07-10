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
import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner{

	@Autowired
	private IClienteServicio clienteServicio;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	public static void main(String[] args) {
		logger.info("Iniciando la aplicación");

		// Levanta la fábrica de spring
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Aplicación finalizada");

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("*** Aplicación ZonaFit (GYM) ***");

		var salir = false;
		var consola = new Scanner(System.in);

		while (!salir){
			try {
				var opcion = mostrarmenu(consola);
				salir = ejecutarOpciones(opcion, consola);
			}
			catch (Exception e){
				logger.info("Ocurrió un error: " + e.getMessage());
			}
		}

	}

	private Integer mostrarmenu(Scanner consola){
		System.out.print("""
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
				logger.info("Saliendo del sistema...");
				return true;
			}
		}
		return false;
	}

	private void listarClientes(){
		System.out.println("--- Listar clientes ---");
		clienteServicio.listarClientes().forEach(System.out::println);
	}

	private void buscarCliente(Scanner consola){
		System.out.println("--- Buscar cliente ---");
		System.out.print("Ingresa el id del cliente que deseas buscar: ");
		var idABuscar = Integer.parseInt(consola.nextLine());

		var clienteEncontrado = clienteServicio.buscarClientePorId(idABuscar);

		if (clienteEncontrado != null){
			System.out.println("Cliente encontrado correctamente: " + clienteEncontrado);
		}
		else {
			System.out.println("No se ha encontrado ningún cliente con id: " + idABuscar);
		}
	}

	private void agregarCliente(Scanner consola){
		System.out.print("Ingrese el nombre del nuevo cliente: ");
		var nombre = consola.nextLine();
		System.out.print("Ingrese el apellido del nuevo cliente: ");
		var apelido = consola.nextLine();
		System.out.print("Ingrese la membresía del nuevo cliente: ");
		var membresia = Integer.parseInt(consola.nextLine());

		var clienteAAgregar = new Cliente(null, nombre, apelido, membresia);

		clienteServicio.guardarCliente(clienteAAgregar);
		System.out.println("Cliente agregado corectamente: " + clienteAAgregar);
	}

	private void actualizarCliente(Scanner consola){
		System.out.println("--- Actualizar cliente ---");
		System.out.print("Ingresa el id del cliente a actualizar: ");
		var idCliente = Integer.parseInt(consola.nextLine());

		if (clienteServicio.buscarClientePorId(idCliente) != null){
			System.out.print("Ingrese el nombre del cliente: ");
			var nombre = consola.nextLine();
			System.out.print("Ingrese el apellido del cliente: ");
			var apelido = consola.nextLine();
			System.out.print("Ingrese la membresía del cliente: ");
			var membresia = Integer.parseInt(consola.nextLine());

			clienteServicio.guardarCliente(new Cliente(idCliente, nombre, apelido, membresia));
			System.out.println("Cliente actualizado correctamente");
		}
		else {
			System.out.println("No se ha encontrado ningún cliente con id: " + idCliente);
		}


	}

	private void eliminarCliente(Scanner consola){
		System.out.println("--- Eliminar cliente ---");
		System.out.print("Ingresa el id del cliente a eliminar: ");
		var idCliente = Integer.parseInt(consola.nextLine());

		var clienteABuscar = clienteServicio.buscarClientePorId(idCliente);
		if ( clienteABuscar != null){
			clienteServicio.eliminarCliente(clienteABuscar);
			System.out.println("Cliente eliminado correctamente");
		}
		else {
			System.out.println("No se ha encontrado ningún cliente con esta id: " + idCliente);
		}
	}
}
