public class Excepciones {
    public static void main(String[] args) {
        int valor1 = 1, valor2 = 0;

        try {
            var resultado = valor1 / valor2;
            System.out.println("resultado = " + resultado);
        }
        catch (Exception e){
            System.out.println("Ocurrió un error: " + e);
        }

    }
}
