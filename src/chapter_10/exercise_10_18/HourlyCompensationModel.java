package chapter_10.exercise_10_18;


public class HourlyCompensationModel extends Employee{
    private double wage;
    private double hours;
    private Employee employee;

    public HourlyCompensationModel(String name, String surname, String socialSecurityNumber, double wage, int hours) {
        super(name, surname, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double getPaymentAmount() {
        if( getHours() > 40) {
            return ( 40 * getWage() ) + ( (getHours()-40) * getWage() * 1.5);
        } else {
            return getWage() * getHours();
        }
    }

    @Override
    public String toString() {
        return String.format("employee HourlyCompensationModel: %s %nwage: %.2f , hours: %.2f" , super.toString(),
                getWage(), getHours() );
    }
}
