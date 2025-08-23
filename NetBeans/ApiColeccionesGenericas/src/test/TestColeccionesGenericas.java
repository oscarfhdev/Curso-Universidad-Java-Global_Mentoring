package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        miLista.add("Domingo");
        
        String elementoString = miLista.get(0);
        System.out.println("elementoString = " + elementoString);

        for(String elemento: miLista){
            System.out.println(elemento);
        }
        
        System.out.println("\n");
        
        
        miLista.forEach((elemento) -> {
            System.out.println("elemento = " + elemento);
        });
        
        System.out.println("\n");

        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sábado");
        miSet.add("Domingo");
        miSet.add("Domingo");
        
        // No mantiene el orden, tampoco en un set se pueden duplicar elementos
        imprimir(miSet);
        
        Map<String,String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "1");
        miMapa.put("Valor2", "2");
        miMapa.put("Valor3", "3");
        miMapa.put("Valor3", "4"); // Se queda 4
        
        
        System.out.println("\n");
        Object elemento = miMapa.get("Valor1");
        System.out.println("elemento del mapa (valor1) = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> collection){
        collection.forEach((elemento) -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
