package chapter_9.exercise_9_3;

public class BasePlusCommissionEmployee {
   private double baseSalary; // Weekly base salary
   private CommissionEmployee commissionEmployee;


   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
      this.commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

      // If the base salary is incorrect, raise an exception
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException("The base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }
   public BasePlusCommissionEmployee() {

   }

   public CommissionEmployee getCommissionEmployee() {
      return commissionEmployee;
   }
   public void setCommissionEmployee(CommissionEmployee commissionEmployee) {
      this.commissionEmployee = commissionEmployee;
   }
   // Set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("The base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;                
   }


   public double getBaseSalary() {return baseSalary;}

   // Calculate earnings
   public double earnings() {return getBaseSalary() + commissionEmployee.earnings();}

   // Return the text representation of the BasePlusCommissionEmployee object
   @Override
   public String toString() {
      return String.format("%s %s%n%s: %.2f", "base salary",
         commissionEmployee.toString(), "base salary", getBaseSalary());
   } 
} 
