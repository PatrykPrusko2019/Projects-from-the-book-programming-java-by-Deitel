package chapter_8.exercise_8_17_testBigIntegers;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {

        BigInteger first = new BigInteger("3456778899345"); //1
        BigInteger second = new BigInteger("13"); //2
        BigInteger third = new BigInteger("9191"); //3
        BigInteger forth = new BigInteger("10");  //4

        BigInteger sixth = new BigInteger("3");
        BigInteger fifth = new BigInteger("9999999999999999999999999999999999999998");


        BigInteger seventh = null;

        HugeInteger h = new HugeInteger();

        h.addNewNumberToArray(first);
        h.addNewNumberToArray(second);
        h.addNewNumberToArray(third);
        h.addNewNumberToArray(forth);

        System.out.println(h.toString());

        h.add(second, 3);

        System.out.println(h.toString());

       // h.add(fifth,4);

        System.out.println(h);

        h.subtract(forth, 4);

        System.out.println(h);

        h.parseToArray("99999999999999999999999999999999999999990");
        System.out.println(h);

        //metody porownujace
        boolean equal = h.isEqualTo(h.getTabBigInteger()[3], h.getTabBigInteger()[3]);

        System.out.println(equal);

        equal = h.isEqualTo(sixth, third);
        System.out.println(equal);

        ///////////////
        System.out.println("is not equal :");
        equal = h.isNotEqualTo(sixth, seventh);
        System.out.println(equal);


        ///////////////
        System.out.println("first is greater than second (first > second) :");
        equal = h.isGreaterThan(sixth, forth);
        System.out.println(equal);

        ///////////////

        System.out.println("first is less than second (first < second) :");
        equal = h.isLessThan(sixth, forth);
        System.out.println(equal);

        ///////////////

        System.out.println("is Greater Than Or Equal To :");
        equal = h.isGreaterThanOrEqualTo(forth, sixth);
        System.out.println(equal);

        ///////////////

        System.out.println("is Less Than Or Equal To :");
        equal = h.isLessThanOrEqualTo(forth, sixth);
        System.out.println(equal);


        ///////////////

        System.out.println("is Zero by first or second :");
        equal = h.isZero(forth, sixth);
        System.out.println(equal);


        ///////////////

        System.out.println("multiply :");
        BigInteger testMultiply = h.multiply(forth, sixth);
        System.out.println(testMultiply);

        ///////////////

        System.out.println("divide :");
        BigInteger testDivide = h.divide(forth, sixth);
        System.out.println(testDivide);

        ///////////////

        System.out.println("remainder :");
        BigInteger testRemainder = h.remainder(forth, sixth);
        System.out.println(testRemainder);



    }
}
