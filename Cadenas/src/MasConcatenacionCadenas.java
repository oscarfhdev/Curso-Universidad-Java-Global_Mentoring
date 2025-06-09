public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Más formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        // Método concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 usando concat = " + cadena3);

        // StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        System.out.println("constructorCadenas = " + constructorCadenas);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        // StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("stringBuffer = " + stringBuffer);
        resultado = stringBuffer.toString();
        System.out.println("Resultado StringBuffer: " + resultado);

        // Método join
        resultado = String.join(",", cadena1, cadena2, "Adicional");
        System.out.println("Resultado Join: " + resultado);
    }
}
