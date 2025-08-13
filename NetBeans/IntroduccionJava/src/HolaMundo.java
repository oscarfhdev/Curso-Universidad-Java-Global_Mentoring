public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo con Java y NetBeans!");
        System.out.println("Saludos!");
        
        int miVariableEntera = 10;
        System.out.println("miVariableEntera = " + miVariableEntera);
        
        // Modificamos el valor de la variable
        miVariableEntera = 14;
        System.out.println("miVariableEntera = " + miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println("miVariableCadena = " + miVariableCadena);
        miVariableCadena = "Saludos de Nuevo";
        System.out.println("miVariableCadena = " + miVariableCadena);
        
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        // var áVariable = 10; no se recomienda, tampoco caracteres especiales (#)
        
    }
}
