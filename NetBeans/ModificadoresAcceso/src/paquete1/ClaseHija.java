package paquete1;

import paquete1.Clase1;

public class ClaseHija extends Clase1{
    public ClaseHija(){
        // privado solo es dentro de la misma clase
        // super();
        // this.atributoPrivado = "Modificamos el atributo privado";
        //System.out.println("this.atributoPrivado= " + this.atributoPrivado);
        //this.metodoPrivado();
        
        super("Prueba");
    }
}
