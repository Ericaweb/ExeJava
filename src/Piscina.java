import java.util.InputMismatchException;
import java.util.Scanner;

public class Piscina {
    public static void main(String[]args){
        String mens = """
                
                Vamos construir aquela piscina top na sua casa?
                Gostariamos de saber qual o tamanho que você deseja.
                Insira o comprimento, largura e a profundidade da piscina.
                
                """;
        System.out.println(mens);

        try {
            Scanner scanner = new Scanner(System.in);

            double com = scanner.nextDouble();
            double lar = scanner.nextDouble();
            double pro = scanner.nextDouble();

            double vol = com * lar * pro;

            System.out.printf("O tamanho da sua piscina é de: %.2f metros cúbicos. \n", vol);

            double val = vol * 100;

            System.out.printf("Valor total desta metragem é de: R$ %.2f reais.",val);

        } catch (InputMismatchException e) {
            System.out.println("ERRO.ENTRADA INVÁLIDA.");
        }
    }
}








