package chapter_9.exercise_9_16;

public class BasePlusCommissionCompensationModel extends CompensationModel{
    private double baseSalary;

    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        super(grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }
}
