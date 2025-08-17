package domain;

public final class Persona {
    
    private String nombre;

    public final static int MI_CONSTANTE = 1;
    public final void imprimir(){
        System.out.println("Método imprimir");
        
        //MI_CONSTANTE = 2;
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
