package chapter_10.exercise_10_13_payroll_system_test;

public class CommissionEmployee extends Employee {
   private double grossSales;
   private double commissionRate;


   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, Date birthDate) {
      super(firstName, lastName, socialSecurityNumber, birthDate);

      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "The commission percentage must be > 0.0 i < 1.0");
      }

      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Total sales must be >= 0.0");
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


   @Override                                                           
   public double earnings() {                                          
      return getCommissionRate() * getGrossSales();                    
   }                                                                   


   @Override                                                   
   public String toString() {                                  
      return String.format("%s: %s%n%s: %,.2f zł; %s: %.2f",     
         "pracownik prowizyjny", super.toString(),
         "łączna sprzedaż", getGrossSales(),
         "procent prowizji", getCommissionRate());
   } 
}