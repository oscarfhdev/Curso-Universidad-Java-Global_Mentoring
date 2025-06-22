public interface Traductor {
    // public y abstract
    void traducir();

    // Métodos con implmentación por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a inglés");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println("Traduzco a francés");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en francés");
    }
}

class pruebaTraductor{
    public static void main(String[] args) {
        Traductor traductor = new Ingles();
        traductor.iniciarTraductor();
        traductor.traducir();

        // Traductor en Francés
        System.out.println();
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}