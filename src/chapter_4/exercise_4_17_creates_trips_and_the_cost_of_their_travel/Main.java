package chapter_4.exercise_4_17_creates_trips_and_the_cost_of_their_travel;

import java.util.Scanner;

/**
 * creates trips and the cost of their travel
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Trip sumsOfTrips = new Trip(0,0); //sumuje 2 zmienne
        Trip trip;

        boolean isOk;

        int kmTraveled, refueledFuel, choose;
        do {
            System.out.println("podaj liczbe km przejechanych: ");
            kmTraveled = sc.nextInt();

            System.out.println("podaj liczbe zatankowanych litrow paliwa: ");
            refueledFuel = sc.nextInt();

            trip = new Trip(kmTraveled, refueledFuel);
            trip.calculateBurning(); // oblicza srednie spalanie danej wycieczki
            sumsOfTrips.sumsUpOfAllTrips(trip); // dodaje 2 zmienne

            System.out.println("jesli chcesz zakonczyc to wcisnij -1 jesli dodac wycieczke to wcisnij obojetnie jakas liczbe !!!!!");
            choose = sc.nextInt();

            sc.nextLine();

        } while(choose != -1);

        //oblicza na koncu sume spalania l paliwa na 100 km wszystkich wycieczek

        System.out.println("suma wszystkich wycieczek , spalanie :");
        sumsOfTrips.calculateBurning();//podaje sume spalania wszystkich wycieczek


    }

}
