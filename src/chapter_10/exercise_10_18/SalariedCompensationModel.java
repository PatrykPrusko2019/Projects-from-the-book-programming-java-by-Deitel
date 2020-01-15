package chapter_10.exercise_10_18;

public class SalariedCompensationModel extends Employee {

    private double weeklySalary;

    public SalariedCompensationModel(String name, String surname, String socialSecurityNumber, double weeklySalary) {
        super(name, surname, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("employee SalariedCompensationModel: %s%nweeklySalary: %.2f" , super.toString(),
                getWeeklySalary() );
    }
}
