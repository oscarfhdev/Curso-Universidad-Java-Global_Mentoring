package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    public Empleado(String nombre, double sueldo){
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        Empleado.contadorEmpleado = contadorEmpleado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empledo{");
        sb.append("idEmpleado= ").append(idEmpleado);
        sb.append(", sueldo= ").append(sueldo);
        sb.append(", nombre= ").append(this.getNombre());
        sb.append('}');
        //sb.append(", Persona{").append(super.toString()).append("}");
        return sb.toString();
    }
    
    
}
