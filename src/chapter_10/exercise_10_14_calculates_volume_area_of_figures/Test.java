package chapter_10.exercise_10_14_calculates_volume_area_of_figures;

public class Test {
    public static void main(String[] args) {

        TwoDimensionalShape circle = new Circle(10);
        TwoDimensionalShape square = new Square(5);
        TwoDimensionalShape triangle = new Triangle(10, 7);
        ThreeDimensionalShape sphere = new Sphere(2);
        ThreeDimensionalShape cube = new Cube(7);
        ThreeDimensionalShape tetrahedron = new Tetrahedron(7);

        Shape[] tabShapes = {circle, square, triangle, sphere, cube, tetrahedron};



        for(Shape shape : tabShapes) {


            if(shape instanceof TwoDimensionalShape) {

                System.out.printf("%s area is %.2f%n" , shape, shape.getArea() );

            } else if( shape instanceof ThreeDimensionalShape) {

                System.out.printf("%s area is %.2f , volume is %.2f%n" , shape, shape.getArea(), ((ThreeDimensionalShape) shape).getVolume() );
            }
        }

    }
}
