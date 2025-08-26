package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.servicio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.servicio.ICatalogoPeliculas;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        
        while(opcion != 0){
            System.out.println("\n\n1. Iniciar catálogo de películas\n"
                + "2. Agregar película\n"
                + "3. Listar película\n"
                + "4. Buscar película\n"
                + "0. Salir");
            
            System.out.print("Elige una opción: ");
            
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                
                case 2:
                    System.out.print("Introduce el nombre de la película; ");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                    
                case 4: 
                    System.out.println("Introduce una película a buscar: ");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPeliculas(buscar);
                    break;
                case 0:
                    System.out.println("Hasta Pronto");
                    break;
                    
                default:
                    System.out.println("Opción no reconocida");
                    break;
            }
        }
    }
}
