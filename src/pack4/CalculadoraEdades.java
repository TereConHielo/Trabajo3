
package pack4;

import java.util.Scanner;

public class CalculadoraEdades {
    private int[] edades;
    public CalculadoraEdades(int[] edades) {
        this.edades = edades;
    }
    
    public double CalcularPromedioMayoresEdad() {
        int suma = 0;
        int cont = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                suma += edad;
                cont++;
            }
        }
        return cont > 0 ? (double) suma / cont : 0;
    }
    
    public double CalcularPromedioMenoresEdad() {
        int suma = 0;
        int cont = 0;
        for (int edad : edades) {
            if (edad < 18) {
                suma += edad;
                cont++;
            }
        }
        return cont > 0 ? (double) suma / cont : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cantidad de personas: ");
        int cantidad = scanner.nextInt();
        int[] edades = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Edad de la persona " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }
        CalculadoraEdades calculadora = new CalculadoraEdades(edades);
        double promedioMayores = calculadora.CalcularPromedioMayoresEdad();
        double promedioMenores = calculadora.CalcularPromedioMenoresEdad();
        System.out.println("Promedio de edades entre Mayores de edad: " + promedioMayores);
        System.out.println("Promedio de edades entre Menores de edad: " + promedioMenores);

        scanner.close();
    }
}
