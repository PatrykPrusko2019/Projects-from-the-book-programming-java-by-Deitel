package chapter_14.exercise_14_15_morse_code_text;

import java.util.Scanner;

public class LettersOrNumbersOnCodeMorse extends MorseCode {


    public LettersOrNumbersOnCodeMorse() {
        completeTheArrays();
    }


    /**
     * converting letters to morse code -> given word or letter
     * */
    private String lettersForMorseaCode(String word) {

        char[] wordForChars = word.toCharArray();
        String codeMorseaOnString = "";

        for(int i = 0; i < wordForChars.length; i++) {

            int indexOfLetter = lookingInLetters(wordForChars[i]); //search in letters

            if(indexOfLetter > -1) {
                codeMorseaOnString += convertsLettersToMorseaCode(indexOfLetter);
            } else {
                int indexOfNumber = lookingInNumbers(wordForChars[i]); //search in numbers
                if(indexOfNumber > -1) {
                    codeMorseaOnString += convertsNumbersToMorseaCode(indexOfNumber);
                }
            }

            if(wordForChars.length-1 != i) {
                codeMorseaOnString += " "; //space every letter
            }
        }
        return codeMorseaOnString;
    }


    /**
     * gets text from the user
     * @return returns text
     */
    public String getTextByUser() {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        String text = "";
        while(exit) {
            text = sc.nextLine();
            if( ! (text.isEmpty()) ) {
                exit = false;
            } else {
                System.out.println("text is empty ... please again");
            }
        }
        return text;
    }

    /**
     * converts user text to morse code
     * @param textByUser
     */
    public void changingGivenSentenceToMorseCode(String textByUser) {
        textByUser = textByUser.toUpperCase();

        String[] textUser = textByUser.split(" ");

        String codeMorseaOnText = "";

        //puts the sentence in morse code
        for(int i = 0; i < textUser.length; i++) {
            codeMorseaOnText += lettersForMorseaCode(textUser[i]) + "   ";
        }

        System.out.println(codeMorseaOnText);
    }

}
