import java.util.InputMismatchException;
import java.util.Scanner;

public class Anime {
    public static void main(String[] args) {
        System.out.println("Vamos escolher um anime para veremos hoje anoite?");
        Scanner scanner = new Scanner(System.in);
        String res;


        while (true){
            System.out.println("Digite S para Sim ou N para Não.");
            res = scanner.nextLine().trim().toUpperCase();

            if (res.equals("S") || res.equals("N")) {
                break;
            }else {
                System.out.println("Entrada inválida.");
            }
        }

        if (res.equals("S")) {
                System.out.println("""
                        Que Legal, aqui está a lista.
               
                        1 - Naruto Shippuden.
                        2 - Kimetsu no Yaiba.
                        3 - Shingeki no Kyojin.
                        4 - Jujutsu Kaisen.
                        5 - Dr.Stone.
                        6 - DanMachi.
                        
                        Ou
                        
                        7 - Sugerir outra opção.
                        """);

                int nun = 0;
                boolean entradaValida = false;

                while (!entradaValida){
                    try {
                        System.out.println("Escolha uma opção de 1 a 7.");
                        nun = scanner.nextInt();
                        scanner.nextLine();

                        if (nun >= 1 && nun <= 7){
                            entradaValida = true;
                        }else {
                            System.out.println("Número inválido.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada Inválida.");
                        scanner.nextLine();
                    }
                }

                switch (nun) {
                    case 1 -> System.out.println("Legal, então iremos ver Naruto Shippuden.");
                    case 2 -> System.out.println("Legal, então iremos ver Kimetsu no Yaiba.");
                    case 3 -> System.out.println("Legal, então iremos ver Shingeki no Kyojin.");
                    case 4 -> System.out.println("Legal, então iremos ver Jujutsu Kaisen.");
                    case 5 -> System.out.println("Legal, então iremos ver Dr.Stone.");
                    case 6 -> System.out.println("Legal, então iremos ver DanMachi.");
                    case 7 -> {
                        System.out.println("Você escolheu: Sugerir outra opção. Qual anime gostaria de ver?");
                        String sugest = scanner.nextLine();
                        System.out.println("Legal, gostei da sua sugestão, então vamos ver " + sugest + ".");
                    }
                }

        } else {
            System.out.println("Não! POxa vida. Quem sabe outra noite.");
        }
        scanner.close();
    }
}
