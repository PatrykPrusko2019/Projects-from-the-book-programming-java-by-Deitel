package chapter_6.exercise;

/**
 *
 displays up to 10,000 prime numbers
 */
public class Exercise_6_25_valuePrime {
    public static void main(String[] args) {


        System.out.println( "value is prime -> " + isPrimeNumber(59) );

        isPrimeNumber_2(10_000);
    }

    private static void isPrimeNumber_2(int number) {

        boolean isPrime;
        for(int primeNumber = 2; primeNumber < number; primeNumber++) { //2 bo 2 to pierwsza liczba
            isPrime = true;
            for(int j = 2; j < primeNumber; j++) {

                if(primeNumber % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                System.out.println("prime number -> " + primeNumber);
            }
        }

    }

    private static boolean isPrimeNumber(int number) {

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;

    }


}
