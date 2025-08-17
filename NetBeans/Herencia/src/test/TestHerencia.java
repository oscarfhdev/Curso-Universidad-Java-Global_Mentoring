package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        Cliente cliente1 = new Cliente(new Date(), true, "Carmen", 'F', 28, "Avenida del Carmen");
        System.out.println("cliente1 = " + cliente1);
        System.out.println();
    }
}
