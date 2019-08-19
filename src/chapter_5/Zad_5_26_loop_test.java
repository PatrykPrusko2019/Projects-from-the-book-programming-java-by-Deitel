package chapter_5;
/**
 *
 loop test
 */
public class Zad_5_26_loop_test {
    public static void main(String[] args) {

        int count; // Zmienna sterująca używana również po zakończeniu pętli


        for (count = 1; count <= 10; count++) { // Przejdź przez pętlę 10 razy

            System.out.printf("%d ", count);

            if(count == 4) {
            count = 11;
            }
        }

        System.out.printf("%nWyjście z pętli dla wartości count = %d%n", count);



        for (count = 1; count <= 10; count++) { // Przejdź przez pętlę 10 razy
            if (count == 5) {
                break;          // Wyjdź z pętli, jeśli count wynosi 5
            }

            System.out.printf("%d ", count);
        }

        System.out.printf("%nWyjście z pętli dla wartości count = %d%n", count);


    }
}
