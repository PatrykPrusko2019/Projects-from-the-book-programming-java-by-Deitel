package chapter_6.exercise;

/**
 * reverse Number
 */
public class Exercise_6_26_reverseNumber {
    public static void main(String[] args) {

        System.out.println( reverseNumber(6713787) );

    }

    private static int reverseNumber(int number) {

        int reverse = 0;
        while(number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number = number / 10;

        }

        return reverse;
    }
}
