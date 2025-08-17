package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador = 0;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Alba");
        System.out.println("persona2 = " + persona2);
       
        imprimir(persona2);
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona desde imprimir= " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;
        }
}
