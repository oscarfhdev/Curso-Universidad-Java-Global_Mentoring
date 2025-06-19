package aritmetica;

public class Aritmetica {
    public int operando1; // Valor por default 0
    public int operando2;

    public Aritmetica(){ // Constructor Vacío
        System.out.println("Dirección de memoria operador this: " + this);
    } // Constructor Vacío

    public Aritmetica(int operando1, int operando2){
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Dirección de memoria operador this: " + this);
    }

    public void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado suma: " + resultado);
    }

    public void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resultado resta: " + resultado);
    }

}
