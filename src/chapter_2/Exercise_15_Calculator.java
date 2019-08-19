package chapter_2;

import java.util.Scanner;

public class Exercise_15_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give me first number : ");
        int first = sc.nextInt();
        System.out.println("give me second number : ");
        int second = sc.nextInt();

        System.out.println("+ -> " + (first + second) );
        System.out.println("- -> " + (first - second) );
        System.out.println("* -> " + (first * second) );
        System.out.println("/ -> " + (first / second) );



    }

}
