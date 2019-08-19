package chapter_5;
//factorial number
public class Zad_5_13_factorial_number {
    public static void main(String[] args) {

        long silnia = 1;
        for(int i = 1; i <= 20; i++) {
            for(int j = 1; j <= i ; j++) {
                silnia *= (long) j;
            }
            System.out.println("silnia -> " + i + " ! = " + silnia);
            silnia = 1;
        }


    }
}
