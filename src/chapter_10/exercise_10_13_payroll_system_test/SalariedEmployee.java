package chapter_10.exercise_10_13_payroll_system_test;

public class SalariedEmployee extends Employee {
   private double weeklySalary;

   public SalariedEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double weeklySalary,Date birthDate) {
      super(firstName, lastName, socialSecurityNumber, birthDate);

      if (weeklySalary < 0.0) {
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");
      }

      this.weeklySalary = weeklySalary;
   } 

   public void setWeeklySalary(double weeklySalary) {
      if (weeklySalary < 0.0) {
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");
      }

      this.weeklySalary = weeklySalary;
   } 

   public double getWeeklySalary() {return weeklySalary;}


   @Override                                                           
   public double earnings() {
      return getWeeklySalary();}

   @Override
   public String toString() {                                  
      return String.format("full-time employee: %s%n%s: %,.2f zł",
         super.toString(), "weekly salary", getWeeklySalary());
   }                                                           
}