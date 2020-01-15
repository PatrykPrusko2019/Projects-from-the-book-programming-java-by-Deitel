package chapter_9.exercise_9_3;


public class CommissionEmployee {
   private final String firstName;                        
   private final String lastName;                         
   private final String socialSecurityNumber;             
   private double grossSales; // Łączna tygodniowa sprzedaż.
   private double commissionRate; // Procent prowizji.
   private BasePlusCommissionEmployee basePlusCommissionEmployee;

   public CommissionEmployee(String firstName, String lastName,
      String socialSecurityNumber, double grossSales, 
      double commissionRate) {


      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Total sales must be >= 0.0");
      }

      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "The commission percentage must be > 0.0 i < 1.0");
      }

      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
      this.basePlusCommissionEmployee = new BasePlusCommissionEmployee();
   } 

   public String getFirstName() {return firstName;}

   public String getLastName() {return lastName;}

   public String getSocialSecurityNumber() {return socialSecurityNumber;}

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

   //Calculate earnings
   public double earnings() {
      return getCommissionRate() * getGrossSales();
   }

   //Return the textual representation of the CommissionEmployee object
   @Override 
   public String toString() {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
              "commission employee", getFirstName(), getLastName(),
              "insurance number", getSocialSecurityNumber(),
              "total sales", getGrossSales(),
              "percentage of commission", getCommissionRate());
   } 
} 
