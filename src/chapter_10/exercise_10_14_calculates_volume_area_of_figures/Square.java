package chapter_10.exercise_10_14_calculates_volume_area_of_figures;

public class Square extends TwoDimensionalShape{

    public Square(double a) {
        super(a);
    }

    @Override
    public String toString() {
        return String.format("square");
    }

}
