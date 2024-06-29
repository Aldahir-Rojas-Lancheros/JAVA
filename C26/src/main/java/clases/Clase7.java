package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite un numero ");
            int numero=scanner.nextInt();
            System.out.println("Termino el try");
        }catch (InputMismatchException ex){
            System.out.println("Por favor, Debe digitar Numeros.");
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
    }
}
