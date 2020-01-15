package chapter_10.exercise_10_13_payroll_system_test;

public class HourlyEmployee extends Employee {
   private double wage;
   private double hours;


   public HourlyEmployee(String firstName, String lastName,
      String socialSecurityNumber, double wage, double hours, Date birthDate) {
      super(firstName, lastName, socialSecurityNumber, birthDate);

      if (wage < 0.0) {
         throw new IllegalArgumentException("The hourly rate must be >= 0.0");
      }

      if ((hours < 0.0) || (hours > 168.0)) { // Walidacja godzin.
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 i <= 168.0");
      }

      this.wage = wage;
      this.hours = hours;
   } 

   public void setWage(double wage) {
      if (wage < 0.0) {
         throw new IllegalArgumentException("The hourly rate must be >= 0.0");
      }

      this.wage = wage;
   } 


   public double getWage() {return wage;}


   public void setHours(double hours) {
      if ((hours < 0.0) || (hours > 168.0)) {
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 i <= 168.0");
      }

      this.hours = hours;
   } 


   public double getHours() {return hours;}


   @Override                                                           
   public double earnings() {                                          
      if (getHours() <= 40) { // no overtime
         return getWage() * getHours();                                
      }                                                                
      else {                                                           
         return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;  
      }                                                                
   }                                                                   


   @Override                                                             
   public String toString() {                                            
      return String.format("employee with an hourly rate: %s%n%s: %,.2f zł; %s: %,.2f",
         super.toString(), "hourly rate", getWage(),
         "hours worked", getHours());
   }                                                                     
}