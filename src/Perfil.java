
import java.util.InputMismatchException;
import java.util.Scanner;

public class Perfil {
    public static void main (String []args){
        System.out.print("Qual é o seu nome?\n");

        try {
            Scanner scanner = new Scanner(System.in);
            String ler = scanner.nextLine();
            System.out.print("Muito prazer " + ler + ".\n");

            System.out.print("Qual é a sua idade? ");
            int id = scanner.nextInt();
            System.out.print( ler + ", isso é muito legal. Você já tem " + id + " anos.\n");
            
        }catch (InputMismatchException e){
            System.out.println("ERRO.ENTRADA INVÁLIDA.");
        }
    }
}