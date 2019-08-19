package chapter_6.exercise.exercise_6_10_rounding_tests;
/**
 *
 rounding tests
 */
public class Exercise_6_10 {
    public static void main(String[] args) {
        //round -> zaokraglic


        double number = 2364.74, result;

         result = roundToInteger(8.4);
        System.out.println("method roundToInteger(number); -> value before : " + 8.4 + ", value after: " + result);
         result = roundToTenths(84.7);
        System.out.println("method roundToTenths(number); -> value before : " + 84.7 + ", value after: " + result);
        result = roundToHundredths(840.7);
        System.out.println("method roundToHundredths(number); -> value before : " + 840.7 + ", value after: " + result);
        result = roundToThousandths(8400.7);
        System.out.println("method roundToThousandths(number); -> value before : " + 8400.7 + ", value after: " + result);

        System.out.println("\nusing method ceil() in class Math:\n ");

        result = Ceil.roundToInteger(8.4);
        System.out.println("method roundToInteger(number); -> value before : " + 8.4 + ", value after: " + result);
        result = Ceil.roundToTenths(84.7);
        System.out.println("method roundToTenths(number); -> value before : " + 84.7 + ", value after: " + result);
        result = Ceil.roundToHundredths(840.7);
        System.out.println("method roundToHundredths(number); -> value before : " + 840.7 + ", value after: " + result);
        result = Ceil.roundToThousandths(8400.7);
        System.out.println("method roundToThousandths(number); -> value before : " + 8400.7 + ", value after: " + result);






    }

    private static double roundToThousandths(double number) {
        double y = Math.floor(number * 1000 + 0.5) / 1000;
        return y;
    }

    private static double roundToHundredths(double number) {
        double y = Math.floor(number * 100 + 0.5) / 100;
        return y;
    }

    private static double roundToTenths(double number) {
        double y = Math.floor(number * 10 + 0.5) / 10;
        return y;
    }

    private static double roundToInteger(double number) {
        return Math.floor(number);
    }
}
