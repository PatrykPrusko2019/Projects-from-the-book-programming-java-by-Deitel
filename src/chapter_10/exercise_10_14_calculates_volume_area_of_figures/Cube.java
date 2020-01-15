package chapter_10.exercise_10_14_calculates_volume_area_of_figures;

public class Cube extends ThreeDimensionalShape {
    public Cube(double a) {
        super(a);
    }

    @Override
    public double getArea() {
        return 6 * super.getArea();
    }
    @Override
    public double getVolume() {
        return getA() * super.getArea();
    }

    @Override
    public String toString() {
        return "cube";
    }
}
