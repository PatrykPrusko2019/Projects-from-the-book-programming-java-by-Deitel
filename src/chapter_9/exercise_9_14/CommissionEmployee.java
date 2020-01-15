package chapter_9.exercise_9_14;

public class CommissionEmployee extends Employee {

   private double grossSales;
   private double commissionRate;


   public CommissionEmployee(String firstName, String lastName,
      String socialSecurityNumber, double grossSales, 
      double commissionRate) {


      super(firstName, lastName, socialSecurityNumber);

      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Total sales must be >= 0.0");
      }


      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "The commission percentage must be > 0.0 i < 1.0");
      }

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 


   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Total sales must be >= 0.0");
      }

      this.grossSales = grossSales;
   } 

   public double getGrossSales() {return grossSales;}


   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "The commission percentage must be in the range > 0.0 i < 1.0");
      }

      this.commissionRate = commissionRate;
   } 


   public double getCommissionRate() {return commissionRate;}


   public double earnings() {
	  return getCommissionRate() * getGrossSales();
   }


   @Override 
   public String toString() {
      return super.toString() + String.format("%s: %.2f%n%s: %.2f",
         "total sales", getGrossSales(), " percentage of commission", getCommissionRate());
   } 
} 
