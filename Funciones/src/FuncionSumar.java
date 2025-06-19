public class FuncionSumar {
    // Definimos la función de sumar
    static int sumar(int a, int b){
        var resultado = a + b; // return a+b
        return resultado;
    }
    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8;
        var resultadoFuncion = sumar(10 , 11);
        System.out.println(resultadoFuncion);

        System.out.println("Resultado: " + sumar(10, 20));
    }
}
