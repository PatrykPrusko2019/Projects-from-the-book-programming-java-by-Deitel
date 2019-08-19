package chapter_6.exercise;
/**
 * test of conditions
 */

public class Exercise_6_13 {
    public static void main(String[] args) {

        method_a(20);

        method_b(20);

        method_c(30);
    }

    private static void method_c(int n) {
        System.out.println("\n\n c :");

        int result = 2;
        for(int i = 1; i < n; i++) {

            if(i % 2 == 0) {
                if(i >= 6 && i <= 22) {
                    if(result + 4 == i ) {
                        result = i;
                        System.out.println("i = " + result);
                    }
                }
            }

        }
    }



    private static void method_b(int n) {
        System.out.println("\n\n b :");

        for(int i = 1; i < n; i++) {

            if(i % 2 != 0) {
                if(i >= 3 && i <= 11) {
                    System.out.println("i = " + i);
                }
            }

        }
    }

    private static void method_a(int n) {

        System.out.println("\n\n a :");

        for(int i = 1; i < n; i++) {

            if(i % 2 == 0) {
                if(i >= 2 && i <= 10) {
                    System.out.println("i = " + i);
                }
            }

        }
    }
}
