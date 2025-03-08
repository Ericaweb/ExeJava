import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicial {
    public static void main(String[]args){
        System.out.println("\nLançamento de notas dos alunos.");

        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("\nDigite as Nota da AOP1. Valor entre 0 e 1: \n");
            double aop1 = scan.nextDouble();
            System.out.println("\nDigite as Nota da AOP2. Valor entre 0 e 2: \n");
            double aop2 = scan.nextDouble();
            System.out.println("\nDigite as Nota da AOP3. Valor entre 0 e 1: \n");
            double aop3 = scan.nextDouble();
            System.out.println("\nDigite as Nota da Prova Regular. Valor entre 0 e 6: \n");
            double proReg = scan.nextDouble();

            double res1 = aop1 + aop2 + aop3 + proReg;

            if (res1 >= 7) {

                System.out.printf("\nSua Nota é: %.1f. Você Passou.", res1);
            } else {
                System.out.printf("\nSua Nota é: %.1f. Você esta de Recuperação.", res1);

                System.out.println("\nDigite as Nota da Prova de Recuperação. Valor entre 0 e 10: \n");
                double proRec = scan.nextDouble();

                double res2 = (res1 + proRec)/2;

                if (res2 >= 5) {
                    System.out.printf("\nSua Nota é: %.1f. Você Passou.", res2);
                } else {
                    System.out.printf("\nSua Nota é: %.1f. Você está Reprovado.", res2);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro. Entrada Inválida.");
        }
    }
}