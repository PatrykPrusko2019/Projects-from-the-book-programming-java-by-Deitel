package chapter_9.exercise_9_15;

public class SalariedEmployee extends Employee {

    private final double permanentSalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double permanentSalary) {
        super(firstName, lastName, socialSecurityNumber);

        if(permanentSalary < 0) {
            System.out.println("wrong value , range 0 - something");
            this.permanentSalary = 0;
        } else {
            this.permanentSalary = permanentSalary;
        }
    }

    public double getPermanentSalary() {
        return permanentSalary;
    }

    @Override
    public String toString() {
        return  super.toString() + String.format("SalariedEmployee { wynagrodzenieStale = %.2f }", permanentSalary);
    }
}
