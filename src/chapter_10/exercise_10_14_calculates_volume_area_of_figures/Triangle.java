package chapter_10.exercise_10_14_calculates_volume_area_of_figures;

public class Triangle extends TwoDimensionalShape {

    private double height;

    public Triangle(double a, double height) {
        super(a);
        this.height = height; //wysokosc
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * ( getA() * getHeight() );
    }

    @Override
    public String toString() {
        return String.format("triangle");
    }
}
