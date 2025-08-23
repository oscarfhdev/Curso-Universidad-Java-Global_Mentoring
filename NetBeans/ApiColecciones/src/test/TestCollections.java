package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        miLista.add("Domingo");

        for(Object elemento: miLista){
            System.out.println(elemento);
        }
        
        System.out.println("\n");
        
        
        miLista.forEach((elemento) -> {
            System.out.println("elemento = " + elemento);
        });
        
        System.out.println("\n");

        
        Set miSet = new HashSet();
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
        
        Map miMapa = new HashMap();
        miMapa.put("Valor1", 1);
        miMapa.put("Valor2", 2);
        miMapa.put("Valor3", 3);
        
        
        System.out.println("\n");
        Object elemento = miMapa.get("Valor1");
        System.out.println("elemento del mapa (valor1) = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection collection){
        collection.forEach((elemento) -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
