package chapter_8.exercise_8_16_rational_numbers;

/**
 *
 * rational numbers, adds, subtracts, multiplies
 */
public class Test {
    public static void main(String[] args) {



        /*
        Rational rational = new Rational(3, 4); //gora ,dol

        System.out.println("first number: ");
        System.out.println( rational.toString() );


        Rational rational2 = new Rational(2,3); //gora ,dol

        System.out.println("second number: ");
        System.out.println( rational2.toString() );

        Rational result = Rational.add(rational, rational2);

        System.out.println("add result: ");
        System.out.println(result.toString());

        System.out.println("\n");

        System.out.println("result:");
        System.out.println(result.showToResult() );

        //////////////////////////

        result = Rational.subract(rational, rational2);

        System.out.println("subract result: ");
        System.out.println(result.toString());

        System.out.println("\n");

        System.out.println("result:");
        System.out.println(result.showToResult() );


        ///////////////////////////////
*/
        Rational rational3 = new Rational(2, 7);
        Rational rational4 = new Rational(3,5);

       Rational result = Rational.multiplication(rational3, rational4);

        System.out.println("multiply by result: ");
        System.out.println(result.toString());

        System.out.println("\n");

        System.out.println("result:");
        System.out.println(result.showToResult() );




        /////////////////////////////

        result = Rational.divide(rational3, rational4);

        System.out.println("divide by result: ");
        System.out.println(result.toString());

        System.out.println("\n");

        System.out.println("result:");
        System.out.println(result.showToResult() );


        System.out.println("result by double value: ");
        System.out.println(result.showToResultByDoubleValue());






    }
}
