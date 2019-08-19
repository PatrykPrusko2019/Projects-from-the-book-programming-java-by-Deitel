package chapter_6.exercise;

import java.util.Scanner;

/**
 *
 calculates the volume of the ball
 */
public class Exercise_6_6_calculates_the_volume_of_the_ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please give me the radius of the ball : "); //radius -> promien
        double radius = sc.nextDouble();
        sc.nextLine();
        double result = sphereVolume(radius);
        System.out.println(result + " -> volume of the sphere with a radius " + radius);

    }

    private static double sphereVolume(double radius) {

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        return volume;
    }
}
