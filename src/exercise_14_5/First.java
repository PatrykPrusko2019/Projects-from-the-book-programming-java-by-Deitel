package chapter_14.exercise_14_5;

import java.util.Scanner;

/**
 * compares words
 */
public class First {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please give me a two words: ");
        System.out.println("first: ");
        String first = sc.nextLine();
        System.out.println("second: ");
        String second = sc.nextLine();

        // "A" < "B" (10) - (11) -> -1 -> first < second
        // "B" > "A" (11) - (10) -> 1 ->  first > second
        // "A" =="A" (10) - (10) -> 0 ->  first == second

        if(first.compareTo(second) > 0) {
            System.out.println("first word is large, than second word");
        } else if(first.compareTo(second) < 0) {
            System.out.println("first word is less, than second word");
        } else {
            System.out.println("first word equals second word");
        }

    }
}
