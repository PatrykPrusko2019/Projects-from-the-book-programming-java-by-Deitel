package chapter_3.exercise_3_13_shows_employee_salaries;

public class TestEmployee {

    public static void main(String[] args) {

        Employee first = new Employee("Patrick", "Prusko", 10032);
        Employee second = new Employee("Patryshia", "Prusko", 3300);

        double annualSalary_1 = first.annualSalary(first.getMonth_payment());
        double annualSalary_2 = first.annualSalary(second.getMonth_payment());

        System.out.printf("roczna pensja pracownika first: %s %s , kwota: %.2f euro %n", first.getName(), first.getSurname(), annualSalary_1);

        System.out.printf("roczna pensja pracownika second: %s %s , kwota: %.2f euro %n", second.getName(), second.getSurname(), annualSalary_2);

        //podwyzka 30% -> 1 pracownik

        int rise_1 = 30; //rise -> podwyzka

        double rise_year_1 = first.annualIncrease(rise_1 , annualSalary_1); // podwyzka np. 30% , pensja roczna

        System.out.printf("first: %s %s , podwyzka %d%c : %.2f euro %n", first.getName(), first.getSurname(), rise_1, '%', rise_year_1);

        int rise_2 = 10;

        double rise_year_2 = first.annualIncrease(rise_2 , annualSalary_2); // podwyzka np. 30% , pensja roczna

        System.out.printf("second: %s %s , podwyzka %d%c : %.2f euro %n", second.getName(), second.getSurname(), rise_2, '%', rise_year_2);


    }
}
