package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo{
    public static void main(String[] args) {
        var nombreArchivo = "src/archivos/mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {
            if (archivo.exists()){
                System.out.println("El archivo ya existe!");
            }
            else {
                // Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        }catch (IOException e){
            System.out.println("Hubo un error al crear un archivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
