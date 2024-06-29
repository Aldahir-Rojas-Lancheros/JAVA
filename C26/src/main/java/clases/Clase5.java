package clases;

import java.util.Arrays;
import java.util.Scanner;

public class Clase5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double[] arreglo = new Double[4];

        System.out.println("Digite la 1ra nota");
        arreglo[0]=scanner.nextDouble();
        System.out.println("Digite la 2da nota");
        arreglo[1]=scanner.nextDouble();
        System.out.println("Digite la 3ra nota");
        arreglo[2]=scanner.nextDouble();
        System.out.println("Digite la 4ta nota");
        arreglo[3]=scanner.nextDouble();

        Arrays.stream(arreglo).forEach(System.out::println);

        System.out.println("El resultado del promedio es " +((arreglo[0] + arreglo[1] + arreglo[2] + arreglo[3]) / arreglo.length));








    }
}
