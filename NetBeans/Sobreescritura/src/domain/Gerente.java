package domain;

public class Gerente extends Empleado{
    private String departamento;
    
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalles(){  // No podemos poner el modificador de acceso más restrictivo que en la clase padreá
        return super.obtenerDetalles() + ", Departamento: " + this.departamento;
    }
}
