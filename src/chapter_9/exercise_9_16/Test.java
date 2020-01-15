package chapter_9.exercise_9_16;
/**
 *
 * shows employee earnings
 */
public class Test {
    public static void main(String[] args) {

        Employee employeeFirst = new Employee("Pati", "Prusko", "1212", new CommissionCompensationModel(13.44, 77.08));
        Employee employeeSecond = new Employee("Patryk", "Prusko", "1313", new BasePlusCommissionCompensationModel(13.44, 77.08, 88));


        System.out.printf("%s, salary -> %.2f %n",employeeFirst.getFirstName(), employeeFirst.earnings() );

        System.out.printf("%s, salary -> %.2f %n",employeeSecond.getFirstName(), employeeSecond.earnings() );




    }
}
