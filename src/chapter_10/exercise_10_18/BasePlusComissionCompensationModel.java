package chapter_10.exercise_10_18;


public class BasePlusComissionCompensationModel extends ComissionCompensationModel {

    private double baseSalary;

    public BasePlusComissionCompensationModel(String name, String surname, String socialSecurityNumber, double grossSales,
                                              double commissionRate, double baseSalary) {
        super(name, surname, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("wrong value is base salary < 0");
        }

    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    @Override
    public double getPaymentAmount() {

        return super.getPaymentAmount() + getBaseSalary();
    }

    @Override
    public String toString() {
        String str = "Employee{" +
                "name='" + getFirstName() + '\'' +
                ", surname='" + getLastName() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                '}';
        return String.format("employee BasePlusComissionCompensationModel: %s %ngrossSales: %.2f , commissionRate: %.2f procent, , baseSalary: %.2f" , str,
                getGrossSales(), getCommissionRate(), getBaseSalary() );
    }
}
