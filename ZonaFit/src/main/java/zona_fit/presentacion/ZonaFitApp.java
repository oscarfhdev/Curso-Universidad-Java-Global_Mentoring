package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
    }

    private static void zonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);
        IClienteDAO clienteDAO = new ClienteDAO();

        System.out.println("*** Aplicación ZonaFit ***");
        do {
            try {
                var opcion = mostarMenu(consola);
                salir = ejecutarOpciones(opcion, clienteDAO, consola);
            }
            catch (Exception e){
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            finally {
                System.out.println();
            }
        }
        while (!salir);
    }

    private static int mostarMenu(Scanner consola){
        System.out.print("""
                Menu:
                1. Listar clientes
                2. Buscar cliente
                3. Agregar cliente
                4. Modificar cliente
                5. Eliminar cliente
                6. Salir
                Elige una opción:\s""");

        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones (int opcion, IClienteDAO clienteDAO, Scanner consola){
        var salir = false;
        switch (opcion){
            case 1 -> mostrarListadoClientes(clienteDAO);
            case 2 -> buscarCliente(consola, clienteDAO);
            case 3 -> agregarCliente(consola, clienteDAO);
            case 4 -> modificarCliente(consola, clienteDAO);
            case 5 -> eliminarCliente(consola, clienteDAO);
            case 6 -> {
                System.out.println("\nSaliendo de la app...");
                salir = true;
            }
            default -> System.out.println("Opción incorrecta: " + opcion);
        }
        return salir;
    }

    private static void mostrarListadoClientes(IClienteDAO clienteDAO){
        System.out.println("\nListado de clientes: ");
        clienteDAO.listarClientes().forEach(System.out::println);
    }

    private static void buscarCliente(Scanner consola, IClienteDAO clienteDAO){
        System.out.println("--- Buscar Cliente ----");

        System.out.print("Ingrese el id del cliente que desea buscar: ");
        int idCliente = Integer.parseInt(consola.nextLine());
        var clienteABuscar = new Cliente(idCliente);
        if (clienteDAO.buscarClientePorId(clienteABuscar)){
            System.out.println("Cliente encontrado: " + clienteABuscar);
        }
        else {
            System.out.println("No se encontró el cliente con id " + idCliente);
        }
    }

    private static void agregarCliente(Scanner consola, IClienteDAO clienteDAO){
        System.out.println("--- Agregar Cliente ----");

        System.out.print("Ingrese el nombre del cliente que desea agregar: ");
        var nombre = consola.nextLine();

        System.out.print("Ingrese el apellido del cliente que desea agregar: ");
        var apellido = consola.nextLine();

        System.out.print("Ingrese la membresía que tiene el cliente: ");
        var membresia = Integer.parseInt(consola.nextLine());

        // Creamos el objeto clietne (sin el id)
        var clienteAAgregar = new Cliente(nombre, apellido, membresia);
        clienteDAO.agregarCliente(clienteAAgregar);
        System.out.println("Cliente agregado correctamente: " + clienteAAgregar);
    }

    private static void modificarCliente(Scanner consola, IClienteDAO clienteDAO){
        System.out.println("--- Modificar Cliente ----");

        System.out.print("Ingrese el id del cliente que desea mofificar: ");
        int idCliente = Integer.parseInt(consola.nextLine());
        if (clienteDAO.buscarClientePorId(new Cliente(idCliente))){
            System.out.print("Ingresa el nuevo nombre para el cliente: ");
            var nuevoNombre = consola.nextLine();

            System.out.print("Ingresa el nuevo apellido para el cliente: ");
            var nuevoApellido = consola.nextLine();

            System.out.print("Ingresa la nueva membresía para el cliente: ");
            var nuevaMembresia = Integer.parseInt(consola.nextLine());

            var clienteAMoficar = new Cliente(idCliente, nuevoNombre, nuevoApellido, nuevaMembresia);
            if (clienteDAO.modificarCliente(clienteAMoficar)){
                System.out.println("Cliente modificado con éxito: " + clienteAMoficar);
            }
            else {
                System.out.println("No se pudo modificar el cliente");
            }
        }
        else {
            System.out.println("No se encontró el cliente, revise el id");
        }
    }

    private static void eliminarCliente(Scanner consola, IClienteDAO ClienteDAO) {
        System.out.println("--- Eliminar Cliente ----");
        System.out.print("Ingresa el id del cliente que deseas eliminar: ");
        var idClienteEliminar = Integer.parseInt(consola.nextLine());
        var clienteEliminar = new Cliente(idClienteEliminar);
        if(ClienteDAO.eliminarCliente(clienteEliminar)){
            System.out.println("Cliente eliminado con éxito: " + clienteEliminar);
        }
        else {
            System.out.println("No se pudo eliminar el cliente");
        }
    }
}
