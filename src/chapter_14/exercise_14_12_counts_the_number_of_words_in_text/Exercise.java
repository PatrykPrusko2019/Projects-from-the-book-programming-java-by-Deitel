package chapter_14.exercise_14_12_counts_the_number_of_words_in_text;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * The program asks you to enter the sentence used, 1 space as a comma,
 * then count the number of repetitions of words and the result at the end.
 */
public class Exercise {

    private String originalText;

    public static void main(String[] args) {

        new Exercise().startApp();
    }

    private void startApp() {

        getTextByUser();
        String text = originalText;
        text = text.toLowerCase();
        calculatesTheAmountOfGivenWord(text);
    }


    private void getTextByUser() {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        String text;
        do {
            System.out.println("give me some text and one space between them (for example: simple and arials): ");
            text = sc.nextLine();
            if( ! text.isEmpty()) {
                exit = false;
                originalText = text;
            }

        }while(exit);

    }

    private void calculatesTheAmountOfGivenWord(String text) {
        String[] tabOfWords = text.split(" ");

        int counter = 0;
        Map<String, Integer> wordsToResult = new HashMap<>();

        for(int i = 0; i < tabOfWords.length; i++, counter = 0) {

           int value = checksTheGivenWord(i, tabOfWords);

           if(value == -1) {
               continue;
           }

            for(int j = i; j < tabOfWords.length; j++ ) {

                if(tabOfWords[i].equals(tabOfWords[j])) {
                    counter += 1;
                }
            }
            wordsToResult.put(tabOfWords[i], counter);
        }

        showResults(wordsToResult);
    }


    /**
     * checks the number of repetitions
     * @param actualWord
     * @param tabOfWords
     * @return
     */
    private int checksTheGivenWord(int actualWord , String[] tabOfWords) {
        for(int i = 0; i < actualWord; i++) {

            if(tabOfWords[actualWord].equals(tabOfWords[i])) {
                return -1;
            }
        }
        return 0;
    }

    private void showResults(Map<String, Integer> wordsToResult) {

        System.out.println("TEXT: " + originalText);

        for(String i : wordsToResult.keySet()) {

            System.out.println(i + " -> " + wordsToResult.get(i) ); // i -> key , wordsToResult.get(i) -> values
        }
    }
}

