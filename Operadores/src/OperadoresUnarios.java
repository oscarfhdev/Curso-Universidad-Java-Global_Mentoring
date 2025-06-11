import javax.print.DocFlavor;

public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = 2, resultado;
        var c = true;

        // Operador unario +
        resultado = +a;
        System.out.println("resultado = " + resultado);

        // Operador unario -
        resultado = -a;
        System.out.println("resultado = " + resultado);

        // Operadores unarios incremento / decremento
        // Prei-ncremento
        a = 3;
        resultado = ++a; // Primero se incrementa el valor
        System.out.println("resultado = " + resultado);
        System.out.println("Ya se ha icrementado a = " + a);
        // Post-incremento
        a = 3;
        resultado = a++; //Primero se usa el valor y después se incrementa
        System.out.println("resultado a++= " + resultado);
        System.out.println("a = " + a);

        // Pre-decremento
        b = -2;
        resultado = --b; // Primero se incrementa y después se usa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se ha decrementado = " + b);
        // Post-decremento
        b = -2;
        resultado = b--; // Primero se usa el valor, y luego se incrementa
        System.out.println("resultado --b = " + resultado);
        System.out.println("b-- se decrementa = " + b);
    }
}
