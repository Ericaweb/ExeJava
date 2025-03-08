import java.util.InputMismatchException;
import java.util.Scanner;

public class Escolha {
    public static void main(String[] args) {
        String mens = """
                Escolha qual cálculo iremos fazer: \n
                1. Calcular área do quadrado.
                2. Calcular área do círculo.
                """;
        System.out.println(mens);


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a sua escolha: ");

            int nun = scanner.nextInt();

            switch (nun) {
                case 1:
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    double areQua = lado * lado;
                    System.out.println("A área do quadrado é: " +areQua + " .");
                    break;
                case 2:
                    System.out.println("Digite o raio do circulo: ");
                    double raio = scanner.nextDouble();
                    double areCir = Math.PI * Math.pow(raio, 2);
                    System.out.printf("A área do cículo é: %.2f ." ,areCir);
                    break;
                default:
                    System.out.println("Opção inválida. Digite 1 ou 2.");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERRO.ENTRADA INVÁLIDA.");
        }
    }
}