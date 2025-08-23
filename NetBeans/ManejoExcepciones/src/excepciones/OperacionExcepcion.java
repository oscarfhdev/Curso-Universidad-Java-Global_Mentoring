package excepciones;

public class OperacionExcepcion extends RuntimeException{ // A díá de hoy se recomienda más RuntimeException 

    public OperacionExcepcion(String message) {
        super(message);
    }
    
}
