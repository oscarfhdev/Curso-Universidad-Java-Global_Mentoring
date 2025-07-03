package archivos;

import java.io.*;

public class LeerArchivo {
    public static void main(String[] args) {
        // Leer el archivo

        var nombreArchivo = "src/archivos/mi_archivo_a_leer.txt";
        var archivo = new File(nombreArchivo);
        try {
            System.out.println("Contenido del Archivo: ");

            // Abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));

            // Leemos línea a línea del archivo
            var linea = entrada.readLine();

            // Leemos todas las líneas
            while (linea != null){
                System.out.println(linea);
                linea = entrada.readLine();
            }

            // Cerrar archivo
            entrada.close();
        }
        catch (IOException e){
            System.out.println("Error al leer del archivo: " + e.getMessage());
        }
    }
}
