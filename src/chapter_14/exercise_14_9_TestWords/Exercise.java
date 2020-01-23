package chapter_14.exercise_14_9_TestWords;

import java.util.Scanner;

/**
 *
 The program shows words that end in NY and begin with
 the letter b from among those given by the user
 */
public class Exercise {

    public static void main(String[] args) {

      new Exercise().startApp();
    }


    private void startApp() {

        Scanner sc = new Scanner(System.in);
        System.out.println("give me a few words: ");

        String words = sc.nextLine();
        if(words.isEmpty() || ! (words.contains(" ")) ) {
            System.out.println("wrong value !!!");
        } else {
            textTokenizationStartsByLetterB(words);
            textTokenizationStartsByLetterNY(words);
        }
    }

    private void textTokenizationStartsByLetterB(String words) {
        String[] tabWord = words.split(" "); // tokenization

        System.out.println("show words when are starts with by \"b\"");

        for(int i = 0; i < tabWord.length; i++) {
            if(tabWord[i].startsWith("b")) {
                System.out.println(tabWord[i]);
            }
        }

    }

    private void textTokenizationStartsByLetterNY(String words) {
        String[] tabWord = words.split(" "); // tokenization

        System.out.println("show words when are ends with by \"NY\"");
        for(int i = 0; i < tabWord.length; i++) {
            if(tabWord[i].endsWith("NY")) {
                System.out.println(tabWord[i]);
            }
        }

    }
}
