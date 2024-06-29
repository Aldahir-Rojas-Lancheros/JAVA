package clases;

import java.util.Scanner;

public class Clase4 {

    public static void main(String[] args) {

        Integer edad = 55;

        if (edad==null) {
            System.out.println("la edad es null");
        } else {
            System.out.println("Es menor de edad");
            if (edad >100) {
                System.out.println("Esta persona es muy vieja");
            }
        }
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Ingrese un numero");

            int numero= scanner.nextInt();


            switch (numero) {
                case 1:
                    System.out.println("El número es uno");

                    break;
                case 2:
                    System.out.println("El número es dos");
                    break;
                case 3:
                    System.out.println("El número es tres");
                    break;
                default:
                    System.out.println("El número es mayor que tres o menos que uno");
            }
        }catch (RuntimeException r){
            System.out.println(r);
        }finally {
            scanner.close();
        }




    }
}
