package chapter_9.exercise_9_16;
//base class
public class CompensationModel {

    private double grossSales;
    private double commissionRate;

    public CompensationModel(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
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
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return grossSales * commissionRate;
    }
}
