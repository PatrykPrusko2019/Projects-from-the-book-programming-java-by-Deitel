package chapter_11_exception_test.exercise_11_21;

public class Test {
    public static void main(String[] args) {


        try{
            new Test().someMethod();
        } catch (Exception e) {//exception caught
            System.out.println("to catch an exception from the someMethod 2 () method ");
            System.out.println(e.getMessage());
        }


    }


    private void someMethod() throws Exception {// exception not caught
        try {
            someMethod2();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
    private void someMethod2() throws Exception {
        throw new Exception("exception of the someMethod 2 method");
    }
}
