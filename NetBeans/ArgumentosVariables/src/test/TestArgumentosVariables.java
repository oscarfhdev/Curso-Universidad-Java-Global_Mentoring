package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 1, 5 , 53);
        imprimirNumeros(13, 1, 5 , 5323);
        variosParametros("Alberto", 2,5324,532);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int ... numeros){
        for(int i = 0; i < numeros.length; i++){
            System.out.println("elemento: " + numeros[i]);
        }
    }
}
