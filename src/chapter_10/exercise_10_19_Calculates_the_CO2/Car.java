package chapter_10.exercise_10_19_Calculates_the_CO2;

public class Car implements CarbonFootprint {

    private String name;
    private int peopleInCar;
    private String poweredCar;
    private double carbonDioxidePerOnePerson;
    private double kilometer;

    public Car(String name, int peopleInCar, double kilometer) {
        this.name = name;
        this.peopleInCar = peopleInCar;
        this.kilometer = kilometer;
        this.poweredCar = "diesel";
        this.carbonDioxidePerOnePerson = 180.0;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPeopleInCar() {
        return peopleInCar;
    }
    public void setPeopleInCar(int peopleInCar) {
        this.peopleInCar = peopleInCar;
    }
    public String getPoweredCar() {
        return poweredCar;
    }
    public void setPoweredCar(String poweredCar) {
        this.poweredCar = poweredCar;
    }
    public double getCarbonDioxidePerOnePerson() {
        return carbonDioxidePerOnePerson;
    }
    public void setCarbonDioxidePerOnePerson(double carbonDioxidePerOnePerson) {
        this.carbonDioxidePerOnePerson = carbonDioxidePerOnePerson;
    }

    public double getKilometer() {
        return kilometer;
    }
    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    @Override
    public double getCarbonFootprint() {
        //CO2/kilometr
        if(getPeopleInCar() == 1 && getKilometer() == 1) {
            return getCarbonDioxidePerOnePerson();
        } else {
            return (getCarbonDioxidePerOnePerson() / getPeopleInCar()) * getKilometer(); // calculates fuel consumption
        }
    }

    @Override
    public String toString() {
        return String.format("Car { " +
                "name = %s, peopleInCar = %d, poweredCar = %s, carbonDioxidePerOnePerson = %.2f, kilometer = %.2f }",
                getName(), getPeopleInCar(), getPoweredCar(), getCarbonDioxidePerOnePerson(), getKilometer());
    }
}
