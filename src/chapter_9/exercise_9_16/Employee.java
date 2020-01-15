package chapter_9.exercise_9_16;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private CompensationModel compensationModel;

    public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensationModel = compensationModel;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n",
                "commission employee", getFirstName(), getLastName(),
                "insurance number", getSocialSecurityNumber() );
    }

    public CompensationModel getCompensationModel() {
        return compensationModel;
    }
    public void setCompensationModel(CompensationModel compensationModel) {
        this.compensationModel = compensationModel;
    }

    public double earnings() {
        return compensationModel.earnings();
    }


}
