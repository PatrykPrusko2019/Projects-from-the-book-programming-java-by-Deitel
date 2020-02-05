package chapter_14.exercise_14_11_five_letters_word_for_three_letters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * creating three-letter words from five-letter words
 *
 * The program asks the user to enter a 5 letter word,
 * then finds what combinations can be made 3 words,
 * then displays all combinations and the number of them
 */
public class Exercise {

    private List<String> listOfWords = new ArrayList<>();

    public static void main(String[] args) {

        new Exercise().startApp();
    }
    private void startApp() {

        String text = getFiveLetterWordFromTheUser();

        createNewThreeLetterWords(text);
    }

    /**
     * create new three-letter words from a five-letter word
     *
     *                  abcde
     *            combination of letters 'a' -> [0][1][2] -> a b c
     *                                          [0][1][3] -> a b d
     *                                          [0][1][4] -> a b e
     *                                          [0][2][3] -> a c d
     *                                          [0][2][4] -> a c e
     *                                          [0][3][4] -> a d e
     *                                          next letter b , c , d , e
     *
     * @param text
     */
    private void createNewThreeLetterWords(String text) {
        char[] fiveLetterWord = text.toCharArray();

        for(int i = 0; i < fiveLetterWord.length; i++) {

                //6 steps -> 6 combinations each letter with each

                    addNewWordsToList( "" + fiveLetterWord[i] + fiveLetterWord[1] + fiveLetterWord[2] );
                    addNewWordsToList( "" + fiveLetterWord[i] + fiveLetterWord[1] + fiveLetterWord[3] );
                    addNewWordsToList( "" + fiveLetterWord[i] + fiveLetterWord[1] + fiveLetterWord[4] );
                    addNewWordsToList( "" + fiveLetterWord[i] + fiveLetterWord[2] + fiveLetterWord[3] );
                    addNewWordsToList( "" + fiveLetterWord[i] + fiveLetterWord[2] + fiveLetterWord[4] );
                    addNewWordsToList( "" + fiveLetterWord[i] + fiveLetterWord[3] + fiveLetterWord[4] );

        }

        int counter = 1;
        for(String s : listOfWords) {
            System.out.println( (counter++) + " -> " + s);
        }


    }

    /**
     * checks 6 possibilities of arranging 3 letters
     *
     * a b c
     * [0][1][2] -> a b c
     * [0][2][1] -> a c b
     * [1][0][2] -> b a c
     * [1][2][0] -> b c a
     * [2][1][0] -> c b a
     * [2][0][1] -> c a b
     * @param threeLetterWord
     */
    private void addNewWordsToList(String threeLetterWord) {

        char[] threeLetterWordOfTab = threeLetterWord.toCharArray();

        switch(1) {
            case 1: {
                threeLetterWord = "" + threeLetterWordOfTab[0] + threeLetterWordOfTab[1] + threeLetterWordOfTab[2];
                if( ! (listOfWords.contains(threeLetterWord)) ) { // if it is not on the list, add a new word
                    listOfWords.add(threeLetterWord);
                }
            }
            case 2: {
                threeLetterWord = "" + threeLetterWordOfTab[0] + threeLetterWordOfTab[2] + threeLetterWordOfTab[1];
                if( ! (listOfWords.contains(threeLetterWord)) ) {
                    listOfWords.add(threeLetterWord);
                }
            }
            case 3: {
                threeLetterWord = "" + threeLetterWordOfTab[1] + threeLetterWordOfTab[0] + threeLetterWordOfTab[2];
                if( ! (listOfWords.contains(threeLetterWord)) ) {
                    listOfWords.add(threeLetterWord);
                }
            }
            case 4: {
                threeLetterWord = "" + threeLetterWordOfTab[1] + threeLetterWordOfTab[2] + threeLetterWordOfTab[0];
                if( ! (listOfWords.contains(threeLetterWord)) ) {
                    listOfWords.add(threeLetterWord);
                }
            }
            case 5: {
                threeLetterWord = "" + threeLetterWordOfTab[2] + threeLetterWordOfTab[1] + threeLetterWordOfTab[0];
                if( ! (listOfWords.contains(threeLetterWord)) ) {
                    listOfWords.add(threeLetterWord);
                }
            }
            case 6: {
                threeLetterWord = "" + threeLetterWordOfTab[2] + threeLetterWordOfTab[0] + threeLetterWordOfTab[1];
                if( ! (listOfWords.contains(threeLetterWord)) ) {
                    listOfWords.add(threeLetterWord);
                }
            }
        }

    }

    private String getFiveLetterWordFromTheUser() {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        char[] tabChar;
        String resultText = "";
        do {
            System.out.println("please give me five letter word: ");

            String str = sc.nextLine();
            if(str.length() == 5) {

                str = str.toLowerCase();
                tabChar = str.toCharArray();
                if(checkIfThereAreLetters(tabChar)) {
                    resultText = str;
                    exit = false;
                } else {
                    System.out.println("wrong word !!! only 5 letters");
                }
            }

            System.out.println("wrong value !!! only 5 letters");
        }while (exit);
        return resultText;

    }
    /**
     * checks if there are 5 letters to be able to create other 3 letter words from them
     * @param tabChar
     * @return
     */
    private boolean checkIfThereAreLetters(char[] tabChar) {
        for(int i = 0; i < tabChar.length; i++) {

            if(tabChar[i] < 'a' || tabChar[i] > 'z') {
               return false;
            }
        }
        return true;
    }
}
