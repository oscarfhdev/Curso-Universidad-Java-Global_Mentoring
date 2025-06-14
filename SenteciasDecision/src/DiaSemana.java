public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("*** Días de la Semana con Switch ***");
        var dia = 1; // Suponemos que 1 es lunes, 2 es martes, etc


        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido: " + dia);
                // break opcional
        }
    }
}
