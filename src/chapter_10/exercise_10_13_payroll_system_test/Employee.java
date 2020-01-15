package chapter_10.exercise_10_13_payroll_system_test;

public abstract class Employee {
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private final Date birthDate;


   public Employee(String firstName, String lastName, 
      String socialSecurityNumber, Date birthDate) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
      this.birthDate = birthDate;
   }
   public Date getBirthDate() {
      return birthDate;
   }

   public String getFirstName() {return firstName;}


   public String getLastName() {return lastName;}


   public String getSocialSecurityNumber() {return socialSecurityNumber;}


   @Override
   public String toString() {
      return String.format("%s %s%ninsurance number: %s%nDate of birth: %s",
         getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
   }


   public abstract double earnings();
} 
