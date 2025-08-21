package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Constructor público");
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        
        //System.out.println("clase1 = " + clase1.atributoProtected);
        clase1.metodoProtected();
        
        
        ClaseHija clasehija = new ClaseHija();
        System.out.println("clasehija = " + clasehija);
        
        System.out.println("clase1 = " + clase1.atributoDefault);
        clase1.metodoProtected();
        
        // Los atributos privados solo desde la misma clase, o com métodos get/seté
        clase1.setAtributoPrivado("ajustado desde test");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
    }    
}
