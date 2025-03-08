import java.util.InputMismatchException;
import java.util.Scanner;

public class Extenso {
    public static void main(String[] args) {
        System.out.println("Digite um número de 0 a 10: ");

       try {
           Scanner scanner = new Scanner(System.in);
           int valor = scanner.nextInt();

           String[] porExtenso = {"zero","um","dois","tres","quatro","cinco","seis","sete","oito","nove","dez"};

           if (valor >= 0 && valor <= 10) {
               System.out.println("O número por extenso é: " +porExtenso[valor]);

           } else {
               System.out.println("Valor digitado inválido");
           }
       }catch (InputMismatchException e) {
           System.out.println("ERRO. ENTRADA INVÁLIDA");
       }
    }
}