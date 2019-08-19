package chapter_6.exercise;

/**
 * test method -> restFromSharing, calculationOfTheQuotient, displayDigits
 */
public class Exercise_6_21 {
    public static void main(String[] args) {

        //a
        System.out.println( calculationOfTheQuotient(15, 5) );

        //b
        System.out.println( restFromSharing(17, 3) );

        //c
         displayDigits(34767);

    }

    private static int restFromSharing(int a, int b) {

        return a % b;
    }

    private static int calculationOfTheQuotient(int a, int b) {
        return a / b;
    }

    private static void displayDigits(int a) {
        int digits = 0, help = 10;
        if(a > 0 && a < 100000) {
            while(a > 0) {
                digits *= help;
                digits += a % 10; //ostatnia cyfra przypisana do digits
                a = a / 10; // usuwam ostatnia cyfre
            }
        }

        while(digits > 0) {

            a = digits % 10; //ustawiamy ostatnia cyfre
            digits = digits / 10; // usuwamy ostatnia cyfre
            System.out.print(a + "  "); //wyswietlamy
        }


    }


}
