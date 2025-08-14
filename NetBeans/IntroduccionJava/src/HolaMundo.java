
import java.util.Scanner;

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
        // var Variable = 10; no se recomienda, tampoco caracteres especiales (#)
        
        
        var usuario = "Juan";
        var apellido = "Caro";
        System.out.println("Concatenación: " + usuario + " " + apellido);
        var i = 10;
        var j = 12;
      
        System.out.println(i + j);
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));
        
        System.out.println("Nueva línea: \n" + usuario);
        System.out.println("Tabulador: \t" + usuario);
        System.out.println("Retroceso: \b" + usuario);
        System.out.println("Comilla simple: \'" + usuario + "\'");
        System.out.println("Comilla doble: \"" + usuario + "\"");
        
        System.out.print("Escribe tu nombre: ");
//        Scanner consola = new Scanner(System.in);
//        var usuario2 = consola.nextLine();
//        System.out.println("usuario2 = " + usuario2);
        
        
        // Tipo primitivos: enteros: byte, shot, int, long
        byte numeroByte = (byte) 129;
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor mínimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor màximo byte:" + Byte.MAX_VALUE);
        
        
        short numeroShort = (short) 32768;
        System.out.println("numeroShort:" + numeroShort);
        System.out.println("Valor mínimo short:" + Short.MIN_VALUE);
        System.out.println("Valor màximo short:" + Short.MAX_VALUE);
        
        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt:" + numeroInt);
        System.out.println("Valor mínimo int:" + Integer.MIN_VALUE);
        System.out.println("Valor màximo int:" + Integer.MAX_VALUE);
        
        long numeroLong = 9223371036854775807L;
        System.out.println("numeroLong:" + numeroLong);
        System.out.println("Valor mínimo long:" + Long.MIN_VALUE);
        System.out.println("Valor màximo long:" + Long.MAX_VALUE);
        
        
        // Tipos primitivos de tipo flotante
        float numeroFloat = (float) 10.0;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor mínimo float:" + Float.MIN_VALUE);
        System.out.println("Valor màximo float:" + Float.MAX_VALUE);
    }

}
