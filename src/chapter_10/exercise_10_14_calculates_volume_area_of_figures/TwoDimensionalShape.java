package chapter_10.exercise_10_14_calculates_volume_area_of_figures;

public abstract class TwoDimensionalShape extends Shape {

    public TwoDimensionalShape(double a) {
        super(a);
    }


    public double getArea() {
        return getA() * getA();
    }
}
