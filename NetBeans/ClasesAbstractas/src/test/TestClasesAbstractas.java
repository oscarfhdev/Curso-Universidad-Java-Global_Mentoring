package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        // FiguraGeometrica figura = new FiguraGeometrica(); No se pueden instanciar clases abstractas
        
        FiguraGeometrica figura = new Rectangulo("Rectángulo");
        figura.dibujar();
    }
}
