package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            System.out.println(Aritmetica.division(5, 0));
        }
        catch (Exception e){
            System.out.println("Ocurrió un error: " + e);
        }
        finally {   // Siempre se ejecuta
            System.out.println("Se revisó la división entre 0");
        }
    }
}
