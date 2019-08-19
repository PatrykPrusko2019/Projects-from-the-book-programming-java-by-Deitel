package chapter_6.exercise.exercise_6_10_rounding_tests;

public class Ceil {


    public static double roundToThousandths(double number) {
        double y = Math.ceil(number * 1000 + 0.5) / 1000;
        return y;
    }

    public static double roundToHundredths(double number) {
        double y = Math.ceil(number * 100 + 0.5) / 100;
        return y;
    }

    public static double roundToTenths(double number) {
        double y = Math.ceil(number * 10 + 0.5) / 10;
        return y;
    }

    public static double roundToInteger(double number) {
        return Math.ceil(number);
    }
}
