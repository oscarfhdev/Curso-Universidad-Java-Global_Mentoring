package mx.com.gm.mundopc;


public class Monitor{
    private final int idMonitor;
    private static int contadorMonitor;
    private String marca;
    private double tamanio;
    
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitor;
    }
    
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public static int getContadorMonitor() {
        return contadorMonitor;
    }

    public static void setContadorMonitor(int contadorMonitor) {
        Monitor.contadorMonitor = contadorMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
    
    

    
}
