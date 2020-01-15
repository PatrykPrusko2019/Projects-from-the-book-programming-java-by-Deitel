package chapter_10.exercise_10_14_calculates_volume_area_of_figures;

public class Sphere extends ThreeDimensionalShape{

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * super.getArea();
    }
    @Override
    public double getVolume() {
        return 0.75 * Math.PI * (getA() * super.getArea() );
    }

    @Override
    public String toString() {
        return "Sphere";
    }
}
