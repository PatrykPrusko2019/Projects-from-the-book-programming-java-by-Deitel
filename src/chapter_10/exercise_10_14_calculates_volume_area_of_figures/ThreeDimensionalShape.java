package chapter_10.exercise_10_14_calculates_volume_area_of_figures;

public abstract class ThreeDimensionalShape extends Shape{

    public ThreeDimensionalShape(double a) {
        super(a);
    }


   public double getArea() {
       return getA() * getA();
   }


    public abstract double getVolume();

}
