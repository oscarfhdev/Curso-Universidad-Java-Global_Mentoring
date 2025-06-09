public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Tema de subcadenas
        // Substring(inicio, fin(sin incluirlo))
        var cadena1 = "Hola Mundo";

        // Subcadena
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);

        // var subcadena2 = cadena1.substring(5);
        var subcadena2 = cadena1.substring(5, 10);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
