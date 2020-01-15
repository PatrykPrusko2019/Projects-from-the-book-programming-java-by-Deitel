package chapter_9.exercise_9_10;

public class Employee {

    private String name;
    private String surname;
    private int insurancenumber;

    public Employee(String name, String surname, int insurancenumber) {
        this.name = name;
        this.surname = surname;
        this.insurancenumber = insurancenumber;

        System.out.println(name + " " + surname + " " + insurancenumber);
    }
    public String toString() {
        return "Employee class {} -> toString () method called";
    }
}
