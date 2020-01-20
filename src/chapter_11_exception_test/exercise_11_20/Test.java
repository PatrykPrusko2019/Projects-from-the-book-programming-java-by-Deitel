package chapter_11_exception_test.exercise_11_20;

public class Test {
    public static void main(String[] args) {


        try{
            new Test().someMethod();
        } catch (Exception e) {
            System.out.println("catching the exception again from someMethod()");
            e.printStackTrace();
        }


    }


    private void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e; //ponownie zglaszam
        }

    }
    private void someMethod2() throws Exception {
        throw new Exception("exception of the someMethod2() method");
    }
}
