package clases;

public class Clase6 {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador++;  // Incrementa el contador
        }

         contador = 1;
        do {
            System.out.println("Número: " + contador);
            contador++;
        } while (contador <= 5);


        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        System.out.println("-------------------------------" );
        int[] numerosArreglo = {1,2,6,4,5,6};

        for (int i = 0; i < numerosArreglo.length; i++) {
            System.out.println("arreglo numero-"+numerosArreglo[i]);
        }
        System.out.println("-------------------------------" );

        for(int numero : numerosArreglo){
            System.out.println("Imprimir mi arreglo "+numero);
        }

        String[] miArreglo = {"Mauricio","Carolina","Milo"};

        for(String tmp:miArreglo){
            System.out.println(tmp);
        }






    }
}
