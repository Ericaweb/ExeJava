import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperatura{
    public static void main (String[]args){
        System.out.println("\nTransformando Celsius para Fahrenheit.\n");
        System.out.println("Qual é a temperatura na sua cidade hoje?");

       try {
           Scanner scanner = new Scanner(System.in);
           int c = scanner.nextInt();

           double f = c * 1.8 + 32;
           System.out.printf("A temperatura na sua cidade hoje é de %.1f Fahrenheit.", f);
           
       }catch (InputMismatchException e){
           System.out.println("ERRO. ENTRADA INVÁLIDA.");
       }
    }
}