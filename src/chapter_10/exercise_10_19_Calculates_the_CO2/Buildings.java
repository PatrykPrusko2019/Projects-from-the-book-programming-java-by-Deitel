package chapter_10.exercise_10_19_Calculates_the_CO2;

public class Buildings implements CarbonFootprint {
    private String name;
    private double heightByTheMeter;
    private final double carbonDioxidePerMetr;

    public Buildings(String name, double heightByTheMeter) {
        this.name = name;
        this.heightByTheMeter = heightByTheMeter;
        this.carbonDioxidePerMetr = 23.00; // CO 2 / m
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return heightByTheMeter;
    }
    public void setHeight(double height) {
        this.heightByTheMeter = height;
    }
    public double getCarbonDioxidePerMetr() {
        return carbonDioxidePerMetr;
    }

    @Override
    public double getCarbonFootprint() {
        return getHeight() * getCarbonDioxidePerMetr();
    }

    @Override
    public String toString() {
        return String.format("Buildings { " +
                "name = %s, heightByTheMeter = %.2f, carbonDioxidePerMetr = %.2f }",
                getName(), heightByTheMeter, getCarbonDioxidePerMetr());
    }
}
