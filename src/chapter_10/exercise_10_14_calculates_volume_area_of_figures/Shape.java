package chapter_10.exercise_10_14_calculates_volume_area_of_figures;

public abstract class Shape {

    private double a;

    public Shape(double a) {
        this.a = a;
    }


    public abstract double getArea();


    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
}
