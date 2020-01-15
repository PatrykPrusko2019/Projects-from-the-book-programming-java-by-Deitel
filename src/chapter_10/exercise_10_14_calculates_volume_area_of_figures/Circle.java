package chapter_10.exercise_10_14_calculates_volume_area_of_figures;

public class Circle extends TwoDimensionalShape{


    public Circle(double radius) {
        super(radius);
    }
    @Override
    public double getArea() {
        return super.getArea() * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("circle");
    }
}
