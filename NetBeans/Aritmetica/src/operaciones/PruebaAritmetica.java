package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        var resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado de la prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(2, 9);
        System.out.println("resultado = " + resultado);
        
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a= " + aritmetica2.a);                 System.out.println("aritmetica2 b= " + aritmetica2.b);
        miMetodo();
        
//        aritmetica1 = null;
//        System.gc();
    }
    
    public static void miMetodo(){
        // a = 10;
        System.out.println("Otro método");
    }
}
