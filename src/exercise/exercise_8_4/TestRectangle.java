package chapter_8.exercise.exercise_8_4;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle testRectangle = new Rectangle();


        System.out.println("before length -> " + testRectangle.getLength() + ", width -> " + testRectangle.getWidth());

        testRectangle.setLength(7.3);
        testRectangle.setWidth(5.2);


        System.out.println("after length -> " + testRectangle.getLength() + ", width -> " + testRectangle.getWidth());


        System.out.println("result of circumferenceOfRectangle -> " + testRectangle.circumferenceOfRectangle());

        System.out.println("result of area rectangle -> " + testRectangle.rectangleArea());



        testRectangle.setLength(0.0);
        testRectangle.setWidth(20.0);

        System.out.println("result of circumferenceOfRecchaptangle -> " + testRectangle.circumferenceOfRectangle());

        System.out.println("result of area rectangle -> " + testRectangle.rectangleArea());



        testRectangle.setLength(13.0);
        testRectangle.setWidth(7.0);

        System.out.println("result of circumferenceOfRectangle -> " + testRectangle.circumferenceOfRectangle());

        System.out.println("result of area rectangle -> " + testRectangle.rectangleArea());
    }
}
