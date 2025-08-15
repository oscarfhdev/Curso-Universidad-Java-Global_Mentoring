
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
        float numeroFloat = (float) 3.4028236E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor mínimo float:" + Float.MIN_VALUE);
        System.out.println("Valor màximo float:" + Float.MAX_VALUE);
        
        double numeroDouble = (double) 1.7976931348623157E08;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor mínimo double:" + Double.MIN_VALUE);
        System.out.println("Valor màximo double:" + Double.MAX_VALUE);
        
        
        var numeroEntero2 = 10;
        System.out.println("numeroEntero2 = " + numeroEntero2);
        
        var numeroDouble2 = 10.0;
        System.out.println("numeroDouble2 = " + numeroDouble2);
        
        var numeroFloat2 = 10.0F;
        System.out.println("numeroFloat2 = " + numeroFloat2);
        
        
        char micaracter = 'a';
        System.out.println("micaracter = " + micaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
       
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var varChar2 = '\u0021';
        System.out.println("varChar2 = " + varChar2);
       
        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        
        var varCharSimbolo2 = '!';
        System.out.println("varCharSimbolo2 = " + varCharSimbolo2);
        
        int VariableEnteraSimbolo = '!';
        System.out.println("VariableEnteraSimbolo = " + VariableEnteraSimbolo);
        
        int letra = 'A';
        System.out.println("letra = " + letra);
        
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        
        if (varBoolean) {
            System.out.println("La variable es verdadera");
        }
        else{
            System.out.println("La variable es falsa");
        }
        
        
        var edad = 30;
        var esAdulto = edad>= 18;
        if(esAdulto){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        
        
        // Convertir tipo String a tipo int
        var edad2 = "20";
        // var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad2 + 1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        // Pedir un valor
          var consola = new Scanner(System.in);
//        System.out.print("Proporciona tu edad:");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("consola = " + consola);
        
        var edadTexto = String.valueOf(edad);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.print("Proporciona un carácter: " );
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}