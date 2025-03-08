import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Adivinha{
    public static void main (String[]args){
        String mens = """
                \nVamos jogar um jogo interessante de adivinhação.
                Você terá 5 tentativas para adivinhar um número entre 0 e 20.
                Veremos se a sorte está ao seu lado.
                """;
        System.out.println(mens);

        try {
            Scanner scanner = new Scanner(System.in);
            int rand = new Random().nextInt(20);
            int tent = 0;
            int nunDigi = 0;

            while (tent < 5){
                System.out.println("Digite um número entre 0 e 20: ");
                nunDigi = scanner.nextInt();
                tent++;

                if (nunDigi == rand){
                    System.out.println("Parabéns, você acertou o número.");
                    break;
                } else if (nunDigi < rand) {
                    System.out.println("O número é menor do que o gerado.");
                } else {
                    System.out.println("O número é maior do que o gerado.");
                }
            }
            if (tent == 5 && nunDigi != rand) {
                System.out.println("Você não conseguiu acertar o número. O número gerado era " + rand + ".");
            }
        }catch (InputMismatchException e){
            System.out.println("ERRO. ENTRADA INVÁLIDA.");
        }
    }
}






