package chapter_5;

//PI number
public class Zad_5_20_PI_number {
    public static void main(String[] args) {

        double resultPi = 0,counter = 2;
        for(int i = 0; i < 200_000; i++) {

            resultPi += 3 +  (3+counter);

        }

        resultPi = 4.0 -  (4.0 / resultPi);

        System.out.print(resultPi);

    }
}
