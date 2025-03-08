import java.util.InputMismatchException;
import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        System.out.println("Digite um número INTEIRO e descobriremos se ele é PAR ou IMPAR: ");

        try {

            Scanner scanner = new Scanner(System.in);
            int nun = scanner.nextInt();

            String res = (nun % 2 !=0) ? "O número é IMPAR." : "O número é PAR";
            System.out.println(res);
            
        }catch (InputMismatchException e){
            System.out.println("ERRO. ENTRADA INVÁLIDA.");
        }
    }
}


