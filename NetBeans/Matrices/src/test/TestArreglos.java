package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades = " + edades[0]);
        
        // edades[3] = 5; fuera de rango
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades elemento" + i + ": " + edades[i]);
           
        }
    }

}
