package chapter_8.exercise_8_4;

public class Rectangle {
    private double width = 1;
    private double length = 1;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
        System.out.println("wrong value ...");
    }
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if(length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("wrong value ...");
        }
    }

    //calculates the circumference
    public double circumferenceOfRectangle() {
        return (2 * width) + (2 * length);
    }

    //calculates the field
    public double rectangleArea() {
        return width * length;
    }

}
