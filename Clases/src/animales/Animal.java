package animales;

public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al día");
    }

    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }

    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El perro hace wauf!");
    }

    @Override
    protected void dormir(){
        System.out.println("Duermo 15 horas al día");
        System.out.println("Método de la clase padre: ");
        super.dormir();
    }
}

class Gato extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El gato hace miau");
    }
}

class PruebaAnimal {

    // Método polimórfico
    static void imprimirSonido (Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Herencia ***");
        System.out.println("Clase Padre, soy un Animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        // animal1.hacerSonido(); Este método sólo existe en al clase padre

        System.out.println("\nClase hija, soy un perro");
        var perro1 = new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();

        // Objeto de la clase padre (Animal)
        System.out.println("\n");
        var animal = new Animal();
        imprimirSonido(animal);

        var perro = new Perro();
        imprimirSonido(perro);

        var gato = new Gato();
        imprimirSonido(gato);
    }
}
