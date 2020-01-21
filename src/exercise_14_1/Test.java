package chapter_14.exercise_14_1;

/**
 *counts how many letters are repeated in the text
 */
public class Test {
    public static void main(String[] args) {


        String text = " How do you do ? o o....a a a a ";
        char c = 'o';
        int value = 0;
        char[] tabChar = text.toCharArray();

        for(char x : tabChar) {
            if(x == c) {
                value++;
            }
        }


        System.out.println(c + " appears " + value + " times in the text");
    }
}
