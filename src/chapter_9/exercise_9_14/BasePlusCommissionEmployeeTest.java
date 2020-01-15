package chapter_9.exercise_9_14;

/**
 * BasePlusCommissionEmployee testing program
 */
public class BasePlusCommissionEmployeeTest {
   public static void main(String[] args) {

      BasePlusCommissionEmployee employee =
         new BasePlusCommissionEmployee(
         "Anna", "Nowak", "333-33-3333", 5000, 0.4, 300);
      
      // Pobranie danych pracownika.
      System.out.printf(
         "Employee information retrieved from the access method:%n");
      System.out.printf("%s %s%n", "Name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Surname is",
         employee.getLastName());
      System.out.printf("%s %s%n", "The insurance number is",
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Total sales is",
         employee.earnings() );
      System.out.printf("%s %f%n", "The commission percentage is",
         employee.getCommissionRate() );
      System.out.printf("%s %.2f%n", "The base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000); 
      
      System.out.printf("%s %n%s",
         "Updated employee information from the toString method",
          employee.toString());
   } 
} 
