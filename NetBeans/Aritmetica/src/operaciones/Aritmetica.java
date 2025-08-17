package operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    
    // Constructor vacío
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.a = b;
    }
    
    // Método
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        return this.sumarConRetorno();        
    }
}
