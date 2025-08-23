package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoIn = new ClaseGenerica<>(15);
        objetoIn.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan Alberto");
        objetoString.obtenerTipo();
    }
}
