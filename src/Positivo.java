import java.util.InputMismatchException;
import java.util.Scanner;

public class Positivo{
    public static void main(String[] args) {
        System.out.println("\nDigite um número e saberemos se ele e Positivo ou Negativo: ");

      try {
          Scanner scanner = new Scanner(System.in);
          int nun = scanner.nextInt();

          if (nun >= 0) {
              System.out.println("Positivo.");
          } else {
              System.out.println("Negativo.");
          }

          System.out.println("Digite um número inteiro: ");
          int nun1 = scanner.nextInt();
          System.out.println("Digite outro número inteiro: ");
          int nun2 = scanner.nextInt();
          System.out.println("Os números digitados foram: " + nun1 +  " e " + nun2 + ".");

          String res = (nun1 == nun2) ? "Os números são iguais." :
                  (nun1 > nun2) ? "O primeiro número é maior." :
                          "O segundo número é maior.";

          System.out.println(res);
          
      }catch (InputMismatchException e){
          System.out.println("ERRO. ENTRADA INVÁLIDA");
      }
    }
}

