package chapter_6.exercise;

/**
 *
 An excellent number
 */
public class Exercise_6_24_perfectNumber {
    public static void main(String[] args) {


        System.out.println( isPerfect(33550336) );

        isPerfect_2(Integer.MAX_VALUE); //to long working

    }

    private static int isPerfect(int number) {
        int result = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                result += i;
            }
        }
        //I check if the perfect number
        if(result == number) {
            return number;
        } else {
            return 0;
        }
    }

    private static void isPerfect_2(int number) {
        int result = 0;

        for(int valuePerfect = 6; valuePerfect < number; valuePerfect++) {
            for(int j = 1; j < valuePerfect; j++) {

                if(valuePerfect % j == 0) {
                    result += j;
                }
            }
            //I check if the perfect number
            if(valuePerfect == result) {
                System.out.println("number is perfect -> " + valuePerfect);
            }
            result = 0;
        }

    }

}
