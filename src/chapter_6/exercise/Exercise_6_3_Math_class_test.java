package chapter_6.exercise;

/**
 * Math class test
 */
public class Exercise_6_3_Math_class_test {
    public static void main(String[] args) {

        System.out.println(Math.abs(23.7));
        System.out.println(Math.abs(0.0));
        System.out.println(Math.abs(-23.7) + "\n");

        System.out.println(Math.ceil(9.2));
        System.out.println(Math.ceil(-9.8) + "\n");

        System.out.println(Math.cos(0.0) + "\n");

        System.out.println(Math.exp(1.0));
        System.out.println(Math.exp(2.0) + "\n");

        System.out.println(Math.floor(9.2)); //the largest
        System.out.println(Math.floor(-9.8) + "\n");

        System.out.println(Math.log(Math.E));
        System.out.println(Math.log(Math.E * Math.E) + "\n");

        System.out.println(Math.max(2.3, 12.7));
        System.out.println(Math.max(-2.3, -12.7) + "\n");

        System.out.println(Math.min(2.3, 12.7));
        System.out.println(Math.min(-2.3, -12.7) + "\n");

        System.out.println(Math.pow(2.0, 7.0));
        System.out.println(Math.pow(9.0, 0.5) + "\n");

        System.out.println(Math.sin(0.0) + "\n");

        System.out.println(Math.sqrt(900.0) + "\n"); //do pierwiastka

        System.out.println(Math.tan(0.0) + "\n");
    }
}
