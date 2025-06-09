public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Emails ***");
        // Establrcemos los datos
        var nombreCompleto = " Pepe Diaz Casado ";
        var nombreEmpresa = " Pegasus Aerogroup ";
        var extensionDominio = ".com.es";

        // Al nombre, le quitamos los espacios además de ponerlo en minúscula y sustitur los espacios por .
        var nombreUsuarioNormalizado = nombreCompleto.trim().toLowerCase().replace(" ", ".");
        System.out.println("nombreUsuarioNormalizado = " + nombreUsuarioNormalizado);

        // Creamos la variable del dominio del email, concatenamos el @, el nombre de la empresa en minúscula y remplazados los espacios por puntos y la extension
        var dominioEmailNormalizado = "@" + nombreEmpresa.strip().toLowerCase().replace(" ", ".") + extensionDominio;

        // Ahora imprimimos todo concatenado
        System.out.println("Email final generado = " + nombreUsuarioNormalizado + dominioEmailNormalizado);
    }
}
