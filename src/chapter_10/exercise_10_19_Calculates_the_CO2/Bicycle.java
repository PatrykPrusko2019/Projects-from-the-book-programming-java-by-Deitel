package chapter_10.exercise_10_19_Calculates_the_CO2;

public class Bicycle implements CarbonFootprint {
    private String name;
    private double kilometer;
    private final double carbonDioxidePerOnePerson;

    public Bicycle(String name, double kilometer) {
        this.name = name;
        this.kilometer = kilometer;
        this.carbonDioxidePerOnePerson = 18.0; // CO 2 / km
    }
    public String getName() {
        return name;
    }
    public double getKilometer() {
        return kilometer;
    }
    public double getCarbonDioxidePerOnePerson() {
        return carbonDioxidePerOnePerson;
    }
    @Override
    public double getCarbonFootprint() {
        return getKilometer() * getCarbonDioxidePerOnePerson();
    }

    @Override
    public String toString() {
        return "Bicycle { " +
                "name='" + name + " }";
    }
}
