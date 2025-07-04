package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "src/archivos/mi_archivo_a_leer.txt";

        try {
            // Leer todas las líneas del archivo
            List<String> lineasArchivo = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo: ");
            for (String linea : lineasArchivo){
                System.out.println(linea);
            }
            lineasArchivo.forEach(System.out::println); // Mismo resultado pero utilizando el método
        }
        catch (Exception e){
            System.out.println("Error al leer archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
