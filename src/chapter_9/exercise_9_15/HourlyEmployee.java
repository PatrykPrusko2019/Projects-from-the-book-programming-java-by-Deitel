package chapter_9.exercise_9_15;

public class HourlyEmployee extends Employee{

    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {

        super(firstName, lastName, socialSecurityNumber);

        if(hours < 0 || hours > 168) {
            System.out.println("wrong value , range 0 - 168 in week of hours");
            this.hours = 0;
        } else {
            this.hours = hours;
        }
        if(wage < 1) {
            System.out.println("wrong value wage , range 1 - something ...");
            this.wage = 0;
        } else {
            this.wage = wage;
        }

    }

    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        if(hours < 0 || hours > 168) {
            System.out.println("wrong value , range 0 - 168 in week of hours");
            this.hours = 0;
        } else {
            this.hours = hours;
        }
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        if(wage < 1) {
            System.out.println("wrong value wage , range 1 - something ...");
            this.wage = 0;
        } else {
            this.wage = wage;
        }
    }
    public double earnings() {
        if(hours > 40) {
            return (wage * 2) * hours;
        } else {
            return wage * hours;
        }
    }

    @Override
    public String toString() {
        return  super.toString() + String.format ("HourlyEmployee { %.2f hours, wage = %.2f%n" +
               "earnings if 40 hours more a week worked 50 percent more per hour -> total amount: %.2f }",
                hours, wage, earnings());
    }
}
