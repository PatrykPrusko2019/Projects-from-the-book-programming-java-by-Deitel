package chapter_6.exercise;

/**
 * test class Math
 */

public class Exercise_6_7 {
    public static void main(String[] args) {
        System.out.println(Math.abs(7.5));
        System.out.println(Math.floor(7.5));
        System.out.println(Math.abs(0.0));
        System.out.println(Math.ceil(0.0));
        System.out.println(Math.abs(-6.4));
        System.out.println(Math.ceil(-6.4));
        System.out.println( Math.ceil (-Math.abs (-8 + Math.floor(-5.5)) ) );
    }
}
