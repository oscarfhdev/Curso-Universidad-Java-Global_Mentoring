public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Caracteres Especiales
        // '\n' . imprime in salto de línea
        var cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);

        // '\t' - agrega un tabulador
        var cadena2 = "\tHola\tMundo";
        System.out.println("cadena2 = " + cadena2);

        // '\'' agrega una comida simple
        var cadena3 = "Hola 'Mundo'";
        System.out.println("cadena3 = " + cadena3);

        // '\"' agrega una comida doble
        var cadena4 = "Hola \"Mundo\"";
        System.out.println("cadena4 = " + cadena4);

        // '\\' agrega una barra invertida
        var cadena5 = "Hola \\Mundo\\";
        System.out.println("cadena5 = " + cadena5);
    }
}
