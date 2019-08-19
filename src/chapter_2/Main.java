package chapter_2;

public class Main {
    public static void main(String[] args) {
int x = 2, y = 3, a = 0;

        System.out.printf("x = %d%n" , x); // x = 2
        System.out.printf("wynikiem %d + %d jest %d%n", x, x, (x + x)); // wynikiem 2 + 2 jest 4
        System.out.printf("x =");
        System.out.printf("%d = %d%n", (x + y), (y + x));

        a = 4;
        x = 2;
        y = 0;

        // y = ax do potegi 3 + 7
        // y = 3*3 do potegi 3 + 7
         y = (a *( x * x * x)) + 7;

        System.out.println( y );

        y = a * x * x * x + 7;
        System.out.println( y );

        x = 7 + 3 * 6 / 2 - 1;
        System.out.println(x); //15

        x = 2% 2 + 2 * 2 - 2 / 2;
        System.out.println(x);

        x = (3 * 9 * (3 + (9 * 3 / (3))));
        System.out.println(x);

    }
}
