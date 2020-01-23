package chapter_14.exercise_14_8_LettersOfTheAlphabet;

import java.util.Scanner;

/**
 * after entering the text by the user, the program counts the sum of each given letter
 * from the alphabet appearing in the given text
 */
public class LettersOfTheAlphabet {

    public static void main(String[] args) {

        new LettersOfTheAlphabet().start();
    }

    private void start() {
        String text = getText();


        if(checkIsGoodString(text)) {
            System.out.println("we have going to working !!!");
            lookingOnlyForLetters(text);
        } else {
            System.out.println("wrong text, no letters");
        }
    }

    private void lookingOnlyForLetters(String text) {
        String letters = " ";
        char[] tabChar = text.toCharArray();
        for(int i = 0; i < tabChar.length; i++) {
            char search = tabChar[i];
            if( ! ( ('a' > search || 'z' < search) && ('A' > search || 'Z' < search) ) ) {
                letters += search + " "; // " " -> separator

            }

        }

        letters = letters.toLowerCase();
        calculateSumsOfLetter(letters);
    }

    private void calculateSumsOfLetter(String letters) {

        char[] tabOfLetters = letters.toCharArray();
        char[] tabOfAlphabet = new char[26];

        for(char i = 'a', j = 0; i <= 'z'; i++, j++) {
            tabOfAlphabet[j] = i;
        }

        int[] tabOfCounter = new int[tabOfAlphabet.length];

        for(int i = 0; i < tabOfLetters.length; i++) {

            int value = findTheLetter(tabOfAlphabet, tabOfLetters[i]);
            if(value > -1) {
                tabOfCounter[value] += 1; // the counter repeats the given letter
            }
        }
        showLettersOfTheAlphabet(tabOfAlphabet, tabOfCounter);
    }

    private void showLettersOfTheAlphabet(char[] tabOfAlphabet, int[] tabOfCounter) {

        System.out.println("show letters of the alphabet: ");
        for(int i = 0; i < tabOfCounter.length; i++) {
            if(tabOfCounter[i] != 0) {

                System.out.println("LETTER IS : " + tabOfAlphabet[i] + " -> " + tabOfCounter[i] + " times !!!");
            }
        }
    }

    //if it returns -1, then there is no letter
    private int findTheLetter(char[] tabOfAlphabet, char searchLetter) {
        for(int i = 0; i < tabOfAlphabet.length; i++) {

            if(searchLetter == tabOfAlphabet[i]) {
                return i;
            }
        }
        return -1;
    }


    private boolean checkIsGoodString(String text) {
        return text.matches(".*[a-zA-Z].*"); // there must be at least one letter from the alphabet
    }

    private String getText() {
        Scanner sc = new Scanner(System.in);
        boolean isExit;
        String text;
        do {
            System.out.println("enter the text: ");
            text = sc.nextLine();

            if (! text.isEmpty() ) {
                System.out.println("good value !!!");
                isExit = false;
            } else {
                System.out.println("wrong value !!!");
                isExit = true;
            }
        }while(isExit);
        return text;
    }
}
