package chapter_14.exercise_14_4;

import java.util.Scanner;
/**
 * of the two words given, shows whether the selected fragment is identical
 */
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please give me first word: ");
        String first = sc.nextLine();
        System.out.println("second word: ");
        String second = sc.nextLine();

        System.out.println("please give me the number of characters to compare: ");
        int numberOfChar = sc.nextInt();
        System.out.println("please give me the number of starting index: ");
        int indexStart = sc.nextInt();

        System.out.println("first " + first + "\n"
            + "second " + second
            + "\nnumber char " + numberOfChar + "\nindex start " + indexStart);

        System.out.println("the selected text is identical -> " + first.regionMatches(true, indexStart, second, indexStart, numberOfChar ) );
    }
}
