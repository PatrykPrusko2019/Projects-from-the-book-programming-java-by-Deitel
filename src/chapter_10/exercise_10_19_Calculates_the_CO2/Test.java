package chapter_10.exercise_10_19_Calculates_the_CO2;

import java.util.ArrayList;

/**
 * Calculates the CO2 consumption of various vehicles
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<CarbonFootprint> lists = new ArrayList<>();

        lists.add(new Car("NISSAN", 3, 130));
        lists.add(new Bicycle("ROMET", 45));
        lists.add(new Buildings("WTC", 534));



        for(CarbonFootprint carbonFootprint : lists) {
            System.out.printf("%s %nCO 2 combustion -> %.2f grams%n%n", carbonFootprint.toString(), carbonFootprint.getCarbonFootprint() );
        }



    }


}
