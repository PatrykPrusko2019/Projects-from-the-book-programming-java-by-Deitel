package chapter_6.exercise;

/**
 * rounding test
 */
public class Exercise_6_9_rounding_test {
    public static void main(String[] args) {

        double x_1 = 6.9;
        x_1 = Math.floor(x_1); //zaokragla do majblizszej liczby calkowitej
        System.out.println(x_1);

        //exercise
        double x , y;

        for (double i = 1.2; i < 15; i++) {
            x = i;
            y = Math.floor(x + 0.5);
            System.out.println("wartosc pierwotna -> " + i + ", wartosc nowa wartosc po zaokragleniu -> " + y);
        }


    }
}
