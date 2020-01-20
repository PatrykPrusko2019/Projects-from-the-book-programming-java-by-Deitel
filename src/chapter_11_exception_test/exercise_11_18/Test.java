package chapter_11_exception_test.exercise_11_18;

public class Test {

    public static void main(String[] args) {

        try { //the order is important first the subclass of the exception, then the base class
            throw new NullPointerException();
        } catch (RuntimeException e) { //upper class
            System.out.println("RuntimeException");
        //} catch (NullPointerException e) { //sub-class
          //  System.out.println("NullPointerException");
        }

        //correct order
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {//subclass first
            System.out.println("NullPointerException");
        } catch (RuntimeException e) { //then the base class
            System.out.println("RuntimeException");
        }


    }


}
