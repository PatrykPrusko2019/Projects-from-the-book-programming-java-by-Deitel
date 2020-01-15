package chapter_10.exercise_10_18;


public class ComissionCompensationModel extends Employee {
    private double grossSales;
    private double commissionRate;

    public ComissionCompensationModel(String name, String surname, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(name, surname, socialSecurityNumber);

        if(commissionRate > 0.0 && commissionRate < 1.0) {
            this.commissionRate = commissionRate;
        } else {
            System.out.println("wrong value commissionRate range 0.1 - 0.9");
        }

        if(grossSales > 0) {
            this.grossSales = grossSales;
        } else {
            System.out.println("wrong value is grossSales < 0");
        }

    }

    public double getGrossSales() {
        return grossSales;
    }
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate > 0.0 && commissionRate < 1.0) {
            this.commissionRate = commissionRate;
        } else {
            System.out.println("wrong value commissionRate range 0.1 - 0.9");
        }
    }


    @Override
    public double getPaymentAmount() {
        return getGrossSales() * (getCommissionRate() + 1.0 );
    }

    @Override
    public String toString() {
        return String.format("employee ComissionCompensationModel: %s %ngrossSales: %.2f , commissionRate: %.2f procent" , super.toString(),
                getGrossSales(), getCommissionRate() );
    }
}
