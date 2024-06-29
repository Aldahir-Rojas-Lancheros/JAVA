package clases;


import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");

        String nombre= scanner.next();

        System.out.println("su nombre es: "+nombre );

        System.out.println("Digite su edad");
        int edad = scanner.nextInt();
        System.out.println("Su edad es "+edad);


    }

}
