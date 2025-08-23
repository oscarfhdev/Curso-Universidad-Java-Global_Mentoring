package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos accesoDatos = new ImplementacionMySql();
        accesoDatos.actualizar();
        
        
        accesoDatos = new ImplementacionOracle();
        accesoDatos.eliminar();
        
        imprimir(accesoDatos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
