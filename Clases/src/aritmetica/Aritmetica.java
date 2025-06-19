package aritmetica;

public class Aritmetica {
    private int operando1; // Valor por default 0
    private int operando2;

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

    public int getOperando1(){
        return this.operando1;
    }

    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }

}
