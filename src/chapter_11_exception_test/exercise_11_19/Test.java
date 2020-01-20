package chapter_11_exception_test.exercise_11_19;

public class Test {
    public static void main(String[] args) {


        try {
            SomeClass someClass = new SomeClass();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
