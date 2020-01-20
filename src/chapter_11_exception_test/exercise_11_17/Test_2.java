package chapter_11_exception_test.exercise_11_17;

import java.io.IOException;

public class Test_2 {
    public static void main (String[] args){

        try {

            throw new ExceptionB("exception class ExceptionB");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {

            throw new ExceptionA("exception class ExceptionA");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new NullPointerException();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            throw new IOException();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


