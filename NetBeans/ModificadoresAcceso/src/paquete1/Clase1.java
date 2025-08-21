package paquete1;

class Clase1 {
    public String atributoPublico = "Valor atributo público";
    protected String atributoProtected = "Valor atributo protected";
    String atributoDefault = "Valor atributo default";
    private String atributoPrivado = "Valor atributo private";

    
//    Clase1(){
//        System.out.println("Constructor default");
//    }
    
    
    public Clase1(String mensaje){
        this();
        System.out.println("Constructor público");
    }
    
    private Clase1(){
        System.out.println("Constructor privado");
    }
    
//    protected Clase1(){
//        System.out.println("Constructor protected");
//    }
    
    
    public void metodoPublico(){
        System.out.println("Mètodo público");
    }
    
    public void metodoProtected(){
        System.out.println("Mètodo protected");
    }
    
    public void metodoDefault(){
        System.out.println("Mètodo default");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
}
