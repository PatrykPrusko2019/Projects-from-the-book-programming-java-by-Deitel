package chapter_9.exercise_9_8;

/**
 *shows the field square, rectangle,
 * Quadrilateral, Parallelogram
 */
public class Test {
    public static void main(String[] args) {

        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(8, 9);
        Trapezoid trapezoid = new Trapezoid(8, 9, 6);
        Parallelogram parallelogram = new Parallelogram(8, 9);

        System.out.println("result square -> " + square.calculateField(square));
        System.out.println("result trapezoid -> " + trapezoid.calculateField(trapezoid));
        System.out.println("result rectangle -> " + rectangle.calculateField(rectangle));
        System.out.println("result parallelogram -> " + parallelogram.calculateField(parallelogram));

    }
}
