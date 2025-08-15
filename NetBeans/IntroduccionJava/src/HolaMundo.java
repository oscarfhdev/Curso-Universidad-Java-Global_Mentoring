
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
        
//        System.out.print("Proporciona un carácter: " );
//        caracter = consola.nextLine().charAt(0);
//        System.out.println("caracter = " + caracter);
        
        int a= 3, b=2;
        var resultado = a + b;
        System.out.println("Resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("Resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("Resultado multiplicación = " + resultado);
        
        var resultado2 = 3 / ((float) b);
        System.out.println("Resultado división = " + resultado2);
        
        
        if (a % 2 == 0) {
            System.out.println("El número es par");           
        }
        else{
            System.out.println("El número es impar");
        }
        
        int c = 3, d=2;
        int e = a + 5 - b;
        System.out.println("e = " + e);
        
        c += 1; // c = c + 1;
        System.out.println("c = " + c);
        
        c += 3; // c= c + 3;
        System.out.println("c = " + c);
        
        c -= 2; // c = c-2;
        System.out.println("c = " + c);
        
        var f = 3;
        var g = -f;
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        var h = true;
        var i2 = !h;
        System.out.println("h = " + h);
        System.out.println("i2 = " + i2);
        
        // incremento y preincremento
        var j2 = 3;
        var k = ++j2;
        System.out.println("j2 = " + j2);
        System.out.println("k = " + k);
        
        var l = 5;
        var m = l++;
        System.out.println("l = " + l); //primero se utiliza el valor y después se incrementa
        System.out.println("m = " + m);

        // decremento
        var n = 2;
        var o = --n;
        System.out.println("n = " + n); // ya está decrementado
        System.out.println("o = " + o);
        
        // postdecremento
        var p = 4;
        var q = p--; //primero se usa el valor de la variable y se queda pendiente el decremento
        System.out.println("p = " + p); // tenia pendiente un decremento
        System.out.println("q = " + q);
        
        var a2 = 3;
        var b2 = 2;
        
        var c2 = (a == b);
        System.out.println("c2 = " + c2);
        
        var d2 = a != b;
        System.out.println("d2 = " + d2);
        
        var cadena = "Hola";
        var cadena2 = "Adiós";
        var e2 = cadena == cadena2; //compara las referencias de objeto
        System.out.println("e = " + e);
        
        var f2 = cadena.equals(cadena2);
        System.out.println("f2 = " + f2);
        
        var g2 = a2 > b2;
        System.out.println("g2 = " + g2);
        
        if (a % 2 == 0) {
            System.out.println("Es número par");
        }else{
            System.out.println("Es número impar");
        }
        
        var edad3 = 10;
        var adulto2 = 18;
        if (edad3 >= adulto2) {
            System.out.println("Es un adulto");
        }
        else{
            System.out.println("Es menor de edad");
        }
        
        var a3 = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var resultado3 = a3 >= valorMinimo && a3 <= valorMaximo;
        System.out.println("resultado3 = " + resultado3);
        
        if (resultado3) {
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }
        
        
        var vacaciones = false;
        var diaDescanso = false;
        
        if(vacaciones || diaDescanso) {
            System.out.println("Puedo asistir"); 
        }
        else{
            System.out.println("Estoy ocupado");
        }
        
        
        // Operador ternario
        var resultado4 = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado4 = " + resultado4);
        
        var numero = 8;
        resultado4 = (numero % 2 == 0) ? "número par" : "número impar";
        System.out.println("resultado4 = " + resultado4);
        
        
        // Preferencia de operadores
        var x2 = 5;
        var y2 = 10;
        var z2 = ++x2 + y2--;
        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);
        System.out.println("z2 = " + z2);
        
        var resultado5 = 4 + 5 * 6 / 3; //4 + ((5*6)/3)
        System.out.println("resultado5 = " + resultado5);
        
        resultado5 = (4+5) * 6 / 3;
        System.out.println("resultado5 = " + resultado5);
        
        
        // Condicionales
        var condicion = true;
        if (condicion) {
            System.out.println("Condición verdadera");
        }
        else{
            System.out.println("Condición falsa");
        }
        
        var numero2 = 2;
        var numeroTexto = "Numero desconocido";
        
        if(numero2 == 1){
            numeroTexto = "Número uno";
        }
        else if (numero2 == 2){
            numeroTexto = "Número dos";
        }
        else if (numero2 == 3){
            numeroTexto = "Número tres";
        }
        else if (numero2 == 4){
            numeroTexto = "Número cuatro";
        }
        else{
            numeroTexto = "Número no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        
        // Operadores lógicos
        System.out.print("Ingresa el número del mes: (1-12): ");
//        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estación desconocida";
        
//        if (mes == 1 || mes == 2 || mes == 12) {
//            estacion = "Invierno";
//        }
//        else if (mes == 3 || mes == 4 || mes == 5) {
//            estacion = "Primavera";
//        }
//        else if (mes == 6 || mes == 7 || mes == 8) {
//            estacion = "Verano";
//        }
//        else if (mes == 9 || mes == 10 || mes == 11) {
//            estacion = "Otoño";
//        }
        System.out.println("estacion = " + estacion);
        
//        var numero3 = Integer.parseInt(consola.nextLine());
//        var numeroTexto2 = "Valor desconocido";
//        
//        switch (numero3) {
//            case 1:
//                numeroTexto2 = "Numero uno";                
//                break;
//            case 2:
//                numeroTexto2 = "Numero dos";                
//                break;
//            case 3:
//                numeroTexto2 = "Numero tres";                
//                break;
//            case 4:
//                numeroTexto2 = "Numero cuatro";                
//                break;
//            default:
//                numeroTexto2 = "Caso no encontrado";
//        }
//        System.out.println("numeroTexto2 = " + numeroTexto2);
//        
        
        // Bucles
        var contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }
        
        var contador2 = 0;
        do {            
            System.out.println("contador2 = " + contador2);
            contador2++;
        } while (contador2 < 3);
        
        
        for (var contador3 = 0; contador3 < 3; contador3++) {
            if (contador3 % 2 == 0) {
                System.out.println("contador3 = " + contador3);
                break;
            }
        }
        
        inicio: // etiqueta
        for (var contador4 = 0; contador4 < 3; contador4++) {
            if (contador4 % 2 != 0) {
                continue inicio; // Ir a la siguiente iteracion
            }
            System.out.println("contador4 = " + contador4);
        }
    }
}