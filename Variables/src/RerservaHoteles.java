public class RerservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Detalle de hotel ***");
        var nombreCliente = "Alberto";
        var diasEstancia = 3;
        var tarifaDiaria = 23.4;
        var hasvistasAlMar = true;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("hasvistasAlMar = " + hasvistasAlMar);

        // Modifiación de valores
        diasEstancia = 5;
        tarifaDiaria = 50.20;

        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
    }
}
