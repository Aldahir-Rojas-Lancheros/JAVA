package trabajos;
// Obligatorio.  dados 3 numeros digitables decir cual es el mayor.
// Opcional hacer un algoritmo que detecte en que mes estamos segun un numero del 1 al 12
import java.util.Scanner;

public class Trabajo3 {

    // Método para encontrar el mayor de tres números
    public static void encontrarMayor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor de los tres números es: " + mayor);
    }

    // Método para determinar el mes según un número del 1 al 12
    public static void determinarMes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 12: ");
        int mes = scanner.nextInt();

        String nombreMes;
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Número no válido";
        }

        System.out.println("El mes correspondiente es: " + nombreMes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Encontrar el mayor de tres números");
            System.out.println("2. Determinar el mes según un número del 1 al 12");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    encontrarMayor();
                    break;
                case 2:
                    determinarMes();
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 3);
    }
}
