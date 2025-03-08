public class Rotina{
    public static void main(String[] args) {
        System.out.println("Imprimindo números de 0 a 100.");

        for (int i = 1; i <= 100; i+=1){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }
    }
}