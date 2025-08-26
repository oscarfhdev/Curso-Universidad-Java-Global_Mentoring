package mx.com.gm.peliculas.servicio;

import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas{

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();   
    }
    
    
    
    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = true;
        try {
            this.datos.escribir(pelicula, ICatalogoPeliculas.NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso de datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
        var peliculas = this.datos.listar(ICatalogoPeliculas.NOMBRE_RECURSO);
            for (Pelicula pelicula : peliculas) {
                System.out.println("pelicula = " + pelicula.getNombre());
            }
            
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso de datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPeliculas(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(ICatalogoPeliculas.NOMBRE_RECURSO, buscar);

        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso de datos");
            e.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try{

            if (this.datos.existe(ICatalogoPeliculas.NOMBRE_RECURSO)) {
                this.datos.borrar(ICatalogoPeliculas.NOMBRE_RECURSO);
                this.datos.crear(ICatalogoPeliculas.NOMBRE_RECURSO);
            }
            else{
                this.datos.crear(ICatalogoPeliculas.NOMBRE_RECURSO);
            }
        }
        catch (AccesoDatosEx e){
            System.out.println("Error al iniciar el catálogo de películas");
            e.printStackTrace(System.out);
        }
    }

}
