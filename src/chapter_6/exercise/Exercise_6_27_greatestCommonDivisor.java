package chapter_6.exercise;

/**
 * greatest common divisor
 */
public class Exercise_6_27_greatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println( gdc(1989,867) );
    }

    //najwiekszy wspolny dzielnik
    private static int gdc(int first, int second) {

        while(first != second) {

            if(first > second) {
                first -= second;
            } else {
                second -= first;
            }

        }

        return first;

    }
}
