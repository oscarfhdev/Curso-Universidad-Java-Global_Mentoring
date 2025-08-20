package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1 " + Dias.LUNES);
//        indicarDiaSemana(Dias.MARTES);
        System.out.println("Continente noº4: " + Continentes.AMERICA);
        System.out.println("Países en el 4to continentes: " + Continentes.AMERICA.getPaises());
        
        System.out.println("Continente noº1: " + Continentes.AFRICA);
        System.out.println("Países en el 1to continente: " + Continentes.AFRICA.getPaises());
           
    }
    
    
    private static void indicarDiaSemana(Dias dias){
        switch (dias) {
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
        }
    }
}
