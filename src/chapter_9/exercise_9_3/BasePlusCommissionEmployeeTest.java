package chapter_9.exercise_9_3;
/**
 * BasePlusCommissionEmployee testing program
 */
public class BasePlusCommissionEmployeeTest {
   public static void main(String[] args) {

      BasePlusCommissionEmployee employee =
         new BasePlusCommissionEmployee(
         "Anna", "Nowak", "333-33-3333", 5000, .04, 300);
      
      // Retrieve employee data
      System.out.printf("Employee information retrieved from access methods:%n");
      System.out.printf("%s %s%n", "Name is",
         employee.getCommissionEmployee().getFirstName());
      System.out.printf("%s %s%n", "Surname is",
         employee.getCommissionEmployee().getLastName());
      System.out.printf("%s %s%n", "The insurance number is",
         employee.getCommissionEmployee().getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Total sales is",
         employee.getCommissionEmployee().getGrossSales());
      System.out.printf("%s %.2f%n", "The commission percentage is",
         employee.getCommissionEmployee().getCommissionRate());
      System.out.printf("%s %.2f%n", "The base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000); 
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information from the toString method: ",
          employee.toString());
   } 
} 
