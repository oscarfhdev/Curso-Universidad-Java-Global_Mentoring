package dominio;

public class Persona {
    private String nombreCompleto;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombreCompleto, double sueldo, boolean eliminado) {
        this.nombreCompleto = nombreCompleto;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreCompleto=" + nombreCompleto + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }
    
    
}
