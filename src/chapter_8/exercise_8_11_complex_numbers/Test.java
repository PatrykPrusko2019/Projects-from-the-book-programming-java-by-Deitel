package chapter_8.exercise_8_11_complex_numbers;

public class Test {

    public static void main(String[] args) {
        Complex complex1 = new Complex(5, 2);
        Complex complex2 = new Complex(3, -7);

        System.out.println("add:");
        complex1.add(complex2);


        Complex complex3 = new Complex(-5, 7);
        Complex complex4 = new Complex(5, 2);

        System.out.println("subract: ");
        complex3.subtract(complex4);



    }
}
