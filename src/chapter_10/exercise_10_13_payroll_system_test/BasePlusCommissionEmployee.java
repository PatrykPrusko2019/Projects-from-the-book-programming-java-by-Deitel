package chapter_10.exercise_10_13_payroll_system_test;

public class BasePlusCommissionEmployee extends CommissionEmployee {
   private double baseSalary;

   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales,
      double commissionRate, double baseSalary, Date birthDate) {
      super(firstName, lastName, socialSecurityNumber, 
         grossSales, commissionRate, birthDate);

      if (baseSalary < 0.0) {
         throw new IllegalArgumentException("The base salary must be >= 0.0");
      }      
             
      this.baseSalary = baseSalary;                
   }


   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException("The base salary must be >= 0.0");
      }
            
      this.baseSalary = baseSalary;                
   } 


   public double getBaseSalary() {return baseSalary;}


   @Override
   public double earnings() {
      return getBaseSalary() + super.earnings();
   }


   @Override                                                           
   public String toString() {                                          
      return String.format("%s %s; %s: %,.2f zł",                        
         "wynagradzany bazowo", super.toString(),
         "wynagrodzenie bazowe", getBaseSalary());
   }                                                                   
}