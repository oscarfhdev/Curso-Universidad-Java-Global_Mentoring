package mundopc;

import mx.com.gm.mundopc.Computadora;
import mx.com.gm.mundopc.Monitor;
import mx.com.gm.mundopc.Orden;
import mx.com.gm.mundopc.Raton;
import mx.com.gm.mundopc.Teclado;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("USB", "HP");
    Raton ratonHP = new Raton("USB", "HP");
    
    Computadora computadoraHP = new Computadora("ComputadoraHP", monitorHP, tecladoHP, ratonHP);
    
    // Podemos añador un máximo de 10 computadoras (establecido)á
    
    Orden orden1 = new Orden();
    orden1.agregarComputadora(computadoraHP);
    orden1.mostrarOrden();
    }
}
