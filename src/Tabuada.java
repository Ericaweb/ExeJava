import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {
    public static void main ( String[]args){
        System.out.println("Digite um número: ");

       try {
           Scanner scanner = new Scanner(System.in);
           int nun = scanner.nextInt();

           int n = 0;

           System.out.println("A tabuada do " + nun + ":");
           while (n <= 10){
               System.out.println(nun + "x" + n + " = " + (nun * n));
               n++;
           }
       }catch (InputMismatchException e){
           System.out.println("ERRO. ENTRADA INVÁLIDA.");
       }
    }
}