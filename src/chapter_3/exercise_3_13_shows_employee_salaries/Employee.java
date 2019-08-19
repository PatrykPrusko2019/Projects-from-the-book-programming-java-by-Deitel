package chapter_3.exercise_3_13_shows_employee_salaries;

public class Employee {

    private String name;
    private String surname;
    private double month_payment = 0.0; //miesieczna wyplata

    //constructor

    public Employee(String name, String surname, double month_payment) {

        this.name = name;
        this.surname = surname;

        if(check_value_payment(month_payment)) {//jesli true to ustaw , jesli false to nie ustawiaj
            this.month_payment = month_payment;
        }
    }

    //getter
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getMonth_payment() {
        return month_payment;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMonth_payment(double month_payment) {
        if(check_value_payment(month_payment)) {
            this.month_payment = month_payment;
        }
    }

    //sprawdza wyplate czy nie jest ujemna
    public boolean check_value_payment(double value_payment) {
        if(value_payment < 0) {
            return false;
        }
            return true;
    }


    //pensja roczna
    public double annualSalary(double month_payment) {
        return month_payment * 12;
    }

    // podwyzka roczna
    public double annualIncrease(double rise, double annualSalary) { //rise -> podwyzka procentowo, annual salary -> pensja roczna

        rise = (rise / 100) * annualSalary; // obliczamy procent z pensji rocznej

        return rise + annualSalary; // dodaje roczna podwyzke do pensji rocznej
    }


}
