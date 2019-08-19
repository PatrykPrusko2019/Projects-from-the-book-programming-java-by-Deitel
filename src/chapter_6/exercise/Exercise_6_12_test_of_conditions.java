package chapter_6.exercise;

/**
 * test of conditions
 */
public class Exercise_6_12_test_of_conditions {
    public static void main(String[] args) {


            method_a(10);

            method_b(110);

            method_c(10);

            method_d(1500);

            method_e(10);

            method_f(20);

    }

    private static void method_f(int n) {
        System.out.println("\n\n -3 <= n && n <= 11 -> value n : ");
        for (int i = -10; i < n; i++) {

            if (-3 <= i && i <= 11) {
                System.out.print(i + "  ");

            }
        }

    }

    private static void method_e(int n) {
        System.out.println("\n\n -1 <= n && n <= 1 -> value n : ");
        for (int i = -10; i < n; i++) {

            if (-1 <= i && i <= 1) {
                System.out.print(i + "  ");

            }
        }

    }

    private static void method_d(int n) {
        System.out.println("\n\n 1000 <= n && n <= 1112 -> value n : ");
        for (int i = 0; i < n; i++) {

            if (1000 <= i && i <= 1112) {
                System.out.print(i + "  ");

            }
        }
    }

    private static void method_b(int n) {
        System.out.println("\n\n 1 <= n && n <= 100 -> value n : ");
        for (int i = 0; i < n; i++) {

            if (1 <= i && i <= 100) {
                System.out.print(i + "  ");

            }
        }

    }

    private static void method_a(int n) {

        System.out.println(" 1 <= n && n <= 2 -> value n : ");
        for (int i = 0; i < n; i++) {

            if (1 <= i && i <= 2) {
                System.out.print(i + "  ");

            }

        }
    }

    private static void method_c(int n) {
        System.out.println("\n\n 0 <= n && n <= 9 -> value n : ");
        for (int i = 0; i < n; i++) {

            if (0 <= i && i <= 9) {
                System.out.print(i + "  ");

            }

        }


    }
}
