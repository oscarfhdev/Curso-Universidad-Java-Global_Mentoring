import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        // miLista.add("Domingo");

        // Tipo object, la clase padre de todas
        for (Object elemento: miLista){
            System.out.println("Día de la semana: " + elemento);
        }

        System.out.println();
        for (String elemento: miLista){
            System.out.println("Día de la semana: " + elemento);
        }

        // Funciones lambda (función anónima de un código muy compacto)
        miLista.forEach(elemento ->{
            System.out.println("Elemento: " + elemento);
        });

        // Método de referencia
        miLista.forEach(System.out::println);


        System.out.println();
        System.out.println("Lista de nombres: ");
        List<String> nombres = Arrays.asList("Pedro", "Ivonne", "Nohemi");
        nombres.forEach(System.out::println);
    }
}
