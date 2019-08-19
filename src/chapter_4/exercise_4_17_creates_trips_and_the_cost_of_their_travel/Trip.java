package chapter_4.exercise_4_17_creates_trips_and_the_cost_of_their_travel;
//wycieczka
public class Trip {

    private int kmTraveled; //km przejechane
    private int refueledFuel; //tankowane paliwo

    public Trip(int kmTraveled, int refueledFuel) {
        this.kmTraveled = kmTraveled;
        this.refueledFuel = refueledFuel;
    }

    public int getKmTraveled() {
        return kmTraveled;
    }

    public void setKmTraveled(int kmTraveled) {
        this.kmTraveled = kmTraveled;
    }

    public int getRefueledFuel() {
        return refueledFuel;
    }

    public void setRefueledFuel(int refueledFuel) {
        this.refueledFuel = refueledFuel;
    }

    public void calculateBurning() {
      double result = kmTraveled / 100.0;
      result = (double) refueledFuel / result;
        System.out.printf("spalanie na 100 km -> %.2f litrow paliwa, km przejechane -> %d , paliwo zatankowane -> %d  litrow %n",
                result, kmTraveled, refueledFuel);
    }

    public void sumsUpOfAllTrips(Trip trip) {
        this.kmTraveled += trip.kmTraveled;
        this.refueledFuel += trip.refueledFuel;
    }
}
