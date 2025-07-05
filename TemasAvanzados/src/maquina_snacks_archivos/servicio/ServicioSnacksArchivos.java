package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{
    private final String NOMBRE_ARCHIVO = "src/maquina_snacks_archivos/snacks.txt";

    // Crear la lista de snacks
    private List<Snack> snacks = new ArrayList<>();


    // Constructor clase
    public ServicioSnacksArchivos(){
        // Creamos el archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;

        try {
            existe = archivo.exists();
            if(existe){
                this.snacks = obtenerSnacks();
            }
            else {      //Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // Guarda el archivo en disco
                System.out.println("Se ha creado el archivo\n");
            }
        }
        catch (Exception e){
            System.out.println("Error al crear el archivo : " + e.getMessage());
        }

        // Si no existe, cargamos algunos snacks iniciales
        if (!existe){
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Papas", 70));
        this.agregarSnack(new Snack("Refresco", 50));
        this.agregarSnack(new Snack("Sandwich", 120));
    }

    private List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas){
                String[] lineaSnack = linea.split(",");     //Parseamos separando por comas
                var idSnack = lineaSnack[0];    //No se usa
                var nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);

                var snack = new Snack(nombre, precio);
                snacks.add(snack);      //Agregamos el snack leído de la lista
            }
        }
        catch (Exception e){
            System.out.println("Error al leer el archivo de snacks: " + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        // Agregamos el nuevo snack,
        // 1. Se guarda el snack a la lista en memorio
        this.snacks.add(snack);
        // Guardamos el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);

       try {
           anexar = archivo.exists();
           var salida = new PrintWriter(new FileWriter(archivo, anexar));
           salida.println(snack.escribirSnack());
           salida.close();      //se escribe la información en el archivo
       }catch (Exception e){
           System.out.println("Error al agregar snack: " + e.getMessage());
       }
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el Inventario ");
        // Mostramos la lista de snacks en el archivo

        var inventarioSnacks = "";
        for (var snack : this.snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
