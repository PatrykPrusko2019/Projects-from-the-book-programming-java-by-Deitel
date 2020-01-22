package chapter_14.exercise_14_6_different_sentences;

import java.util.Random;

/**
 *
 * creates different sentences using a random number generator
 */
public class DifferentSentences {
    public static void main(String[] args) {

        String[] article = new String[]{"pewien", "kilka", "jakiś", "ten", "ta"}; // range 0 - 4
        String[] noun = new String[]{"chłopak", "dziewczyna", "pies", "ulica", "samochod"};
        String[] verb = new String[]{"kierował", "skoczył", "biegał", "chodził", "ominął"};
        String[] preposition = new String[]{"z", "na", "nad", "pod", "do"};

        Random rand = new Random();

        String result = "";

        for(int i = 0; i < 5; i++) {

            if(i == 0) {
                result += getString(article, rand.nextInt(5)) + " ";
                char[] charsTab = result.toCharArray();
                charsTab[0] = Character.toUpperCase(charsTab[0]);
                result = String.valueOf(charsTab);
            } else {
                result += getString(article, rand.nextInt(5)) + " ";
            }

            result += getString(noun, rand.nextInt(5)) + " ";
            result += getString(verb, rand.nextInt(5)) + " ";

            if(i == 4) {
                result += getString(preposition, rand.nextInt(5)) + ".";
            } else {
                result += getString(preposition, rand.nextInt(5)) + " ";
            }
        }



        System.out.println(result);



    }
    private static String getString(String[] tab, int valueIndex) {
        if(valueIndex < 0 || valueIndex > tab.length-1) {
            System.out.println("wrong value ...");
            return null;
        } else {
            return tab[valueIndex];
        }
    }
}
