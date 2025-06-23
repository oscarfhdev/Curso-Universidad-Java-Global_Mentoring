package excepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws Exception{
        if (denominador == 0)
            throw new Exception("División entre Cero"); // runtimeException no requiere try cacth
        return numerador/denominador;
    }
}
