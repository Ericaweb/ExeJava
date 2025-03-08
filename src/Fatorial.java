import java.util.InputMismatchException;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[]args){
        System.out.println("Digite um número e calcularemos o fatorial: ");

        try {
            Scanner scanner = new Scanner(System.in);
            int nun = scanner.nextInt();

            long fat = 1;

            for (int i = 1; i <= nun; i++){
                fat *= i;
            }

            System.out.println("O fatorial de " + nun + " é " + fat + ".");
            
        }catch (InputMismatchException e){
            System.out.println("ERRO. ENTRADA INVÁLIDA.");
        }
    }
}