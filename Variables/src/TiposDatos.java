public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java
        // Enteros (su valor default es 0)
        byte typoByte = 127;
        System.out.println("typoByte = " + typoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // L mayuscula mejor
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante (valor por default es 0.0)
        float tipoFloat = 3.14F; // F mayúscula mejor
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D mayuscula mejor
        System.out.println("tipoDouble = " + tipoDouble);

        //Character ('\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 66;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (su valor por default es false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos object o tipos de referencia
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
    }
}
