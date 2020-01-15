package chapter_10.exercise_10_14_calculates_volume_area_of_figures;

public class Tetrahedron extends ThreeDimensionalShape {

    public Tetrahedron(double a) {
        super(a);
    }

    @Override
    public double getArea() {
        return super.getArea() * Math.sqrt(3);
    }
    @Override
    public double getVolume() {
        return (super.getArea() * getA() * Math.sqrt(2)) / 12;
    }

    @Override
    public String toString() {
        return "Tetrahedron";
    }
}
