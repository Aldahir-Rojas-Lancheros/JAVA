package trabajos;
//de los 10 ejercicios elegir 1 y desarrollarlo aca.
/*Ejercicio 2: Lista de Compras
Implementa un programa que permita al usuario crear una lista de compras. El programa debe permitir agregar elementos a la lista, mostrar la lista completa y eliminar elementos específicos.
Ejercicio 3: Conversor de Temperatura
Escribe un programa que convierta la temperatura de grados Celsius a Fahrenheit y viceversa. Pide al usuario que ingrese la temperatura y la unidad (Celsius o Fahrenheit).
Ejercicio 4: Manejo de Cadenas
Crea un programa que acepte una cadena de texto y realice las siguientes operaciones:
Muestra la longitud de la cadena.
Convierte la cadena a mayúsculas.
Convierte la cadena a minúsculas.
Verifica si la cadena contiene la palabra "Java".
Ejercicio 5: Clase Estudiante
Crea una clase Estudiante con propiedades como nombre, edad, y calificaciones. Implementa métodos para calcular el promedio de calificaciones y mostrar la información del estudiante.
c
Ejercicio 9: Ordenamiento de Números
Crea un programa que permita al usuario ingresar una lista de números y luego los ordene de menor a mayor.
Ejercicio 10: Juego de Piedra, Papel o Tijeras
Implementa un juego simple de Piedra, Papel o Tijeras. Permite al usuario jugar contra la computadora y muestra el resultado.*/
import java.util.Arrays;
import java.util.Scanner;

public class Trabajo4 {

    // Método para ordenar una lista de números
    public static void ordenarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para jugar Piedra, Papel o Tijeras
    public static void jugarPiedraPapelTijeras() {
        Scanner scanner = new Scanner(System.in);
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        System.out.println("Elige una opción: (0) Piedra, (1) Papel, (2) Tijeras");
        int eleccionUsuario = scanner.nextInt();
        int eleccionComputadora = (int) (Math.random() * 3);

        System.out.println("Tu elección: " + opciones[eleccionUsuario]);
        System.out.println("Elección de la computadora: " + opciones[eleccionComputadora]);

        if (eleccionUsuario == eleccionComputadora) {
            System.out.println("Es un empate!");
        } else if ((eleccionUsuario == 0 && eleccionComputadora == 2) ||
                (eleccionUsuario == 1 && eleccionComputadora == 0) ||
                (eleccionUsuario == 2 && eleccionComputadora == 1)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste, intenta de nuevo.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Ordenar números");
            System.out.println("2. Jugar Piedra, Papel o Tijeras");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ordenarNumeros();
                    break;
                case 2:
                    jugarPiedraPapelTijeras();
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
