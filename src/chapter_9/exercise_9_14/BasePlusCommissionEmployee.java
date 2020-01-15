package chapter_9.exercise_9_14;

public class BasePlusCommissionEmployee extends Employee {
   private double baseSalary;
   private double commissionRate;

   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, double baseSalary) {

      super(firstName, lastName, socialSecurityNumber);

      if (baseSalary < 0.0) {
         throw new IllegalArgumentException("The base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
      this.commissionRate = commissionRate;
   }
   public double getCommissionRate() {
      return commissionRate;
   }
   public void setCommissionRate(double commissionRate) {
      this.commissionRate = commissionRate;
   }

   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("The base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;                
   }


   public double getBaseSalary() {return baseSalary;}


   public double earnings() {return getBaseSalary() + getCommissionRate();}


   @Override
   public String toString() {
      return super.toString() + String.format("%s %s: %.2f", "base salary",
          "base salary", getBaseSalary());
   } 
} 
