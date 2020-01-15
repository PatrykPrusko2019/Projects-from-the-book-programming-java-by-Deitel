package chapter_10.exercise_10_13_payroll_system_test;

import java.time.ZonedDateTime;

/**
 * Payroll System Test
 */
public class PayrollSystemTest {
   public static void main(String[] args) {

      SalariedEmployee salariedEmployee =
              new SalariedEmployee("Jan", "Kowalski", "111-11-1111", 800.00, new Date(1, 13, 1999));
      HourlyEmployee hourlyEmployee =
              new HourlyEmployee("Anna", "Nowak", "222-22-2222", 16.75, 40, new Date(3, 26, 1987));
      CommissionEmployee commissionEmployee =
              new CommissionEmployee(
                      "Zofia", "Lewandowska", "333-33-3333", 10000, .06, new Date(7, 8, 1995));
      BasePlusCommissionEmployee basePlusCommissionEmployee =
              new BasePlusCommissionEmployee(
                      "Robert", "Czekaj", "444-44-4444", 5000, .04, 300, new Date(12,24, 1980));


      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: %,.2f zł%n%n",
              salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: %,.2f zł%n%n",
              hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: %,.2f zł%n%n",
              commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: %,.2f zł%n%n",
              basePlusCommissionEmployee,
              "earned", basePlusCommissionEmployee.earnings());


      Employee[] employees = new Employee[4];

      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee;
      employees[3] = basePlusCommissionEmployee;


      ZonedDateTime zonedDateTime = ZonedDateTime.now();


      System.out.printf(" Polymorphically processed employees:%n%n");


      for(int i = 0; i < 12; i++) {

         System.out.println("month -> " + (i+1) + ", name of actuall month -> " + zonedDateTime.toLocalDate());

         for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            int monthOfBirth = currentEmployee.getBirthDate().getMonth();
            int actuallMonth = zonedDateTime.getMonthValue();



            if (currentEmployee instanceof BasePlusCommissionEmployee) {

               BasePlusCommissionEmployee employee =
                       (BasePlusCommissionEmployee) currentEmployee;

               employee.setBaseSalary(1.10 * employee.getBaseSalary());

               System.out.printf("the new base rate after a 10 %% increase is: %,.2f zł%n",
                       employee.getBaseSalary());
            }

            if(monthOfBirth == actuallMonth) {
               System.out.printf(
                       "earned %,.2f zł , plus a bonus for birthdays in a given accounting month PLN 100 %n%n", currentEmployee.earnings() + 100);
            } else {
               System.out.printf(
                       "earned %,.2f zł%n%n", currentEmployee.earnings());
            }

         }
            zonedDateTime = zonedDateTime.plusMonths(1); //moves date 1 month
      }


      for (int j = 0; j < employees.length; j++) {
         System.out.printf("Pracownik %d to klasa %s%n", j,
                 employees[j].getClass().getName());
      }

   }
}
