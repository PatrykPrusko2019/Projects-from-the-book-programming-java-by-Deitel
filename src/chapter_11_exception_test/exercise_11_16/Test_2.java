package chapter_11_exception_test.exercise_11_16;

public class Test_2 {
    public static void main (String[] args){

        try {

            throw new ExceptionB("exception class ExceptionB");
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }


        try {
            throw new ExceptionC("Exception class NullPointerException");
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }


    }
}
