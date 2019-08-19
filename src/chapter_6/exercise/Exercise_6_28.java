package chapter_6.exercise;

/**
 * quality Points
 */
public class Exercise_6_28 {
    public static void main(String[] args) {
        System.out.println( qualityPoints(100) );
    }

    private static int qualityPoints(int number) {

        if(number > 89 && number < 101) {
            return 4;
        } else if(number > 79 && number < 90) {
            return 3;
        } else if(number > 69 && number < 80) {
            return 2;
        } else if(number > 59 && number < 70) {
            return 1;
        } else {
            return 0;
        }

    }
}
