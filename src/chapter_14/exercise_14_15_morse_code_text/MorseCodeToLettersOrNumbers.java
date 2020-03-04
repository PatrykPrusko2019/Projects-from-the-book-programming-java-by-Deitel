package chapter_14.exercise_14_15_morse_code_text;

import java.util.Scanner;

/**
 * The program converts plain text downloaded from the user into a morse code.
 *
 * Later, it turns the walrus code into plain text that the user understands. You must enter one character at a time,
 * the comma serves as a pause between words, to end you need to use the word stop
 * The result shows at the end as text.
 *
 * Examples of program operation:
 *
 *  please give me a text to convert to morse code:
 * jestem ciekawy  (I'm curious)
 * .---. ... - - -.-. ... -.- .- .-- -.--
 * please give me a morse code to convert to text:
 * Show code morse -> letter in alphabet:
 * .- -> A
 * -... -> B
 * -.-. -> C.
 * - .. -> D
 * . -> E
 * ..-. -> F
 * -. -> G
 * .... -> H
 * .. -> And
 * .--- -> J
 * -.- -> K
 * .- .. -> L
 * - -> M
 * -. -> N
 * --- -> O
 * .--. -> P
 * --.- -> Q
 * .-. -> R
 * ... -> S
 * - -> T.
 * ..- -> U
 * ...- -> V
 * .-- -> W
 * -..- -> X
 * -.-- -> Y
 * - .. -> Z
 * .---- -> 1
 * ..--- -> 2
 * ...-- -> 3
 * ....- -> 4
 * ..... -> 5
 * -.... -> 6
 * --... -> 7
 * --- .. -> 8
 * ----. -> 9
 * ----- ->
 * sign comma in morse code -> - •• -, use this sign as spaces between words
 * .---
 * add new sign of code morsea ... please again (stop -> finish adding new sign)
 * .
 * add new sign of code morsea ... please again (stop -> finish adding new sign)
 * ...
 * add new sign of code morsea ... please again (stop -> finish adding new sign)
 * -
 * add new sign of code morsea ... please again (stop -> finish adding new sign)
 * .
 * add new sign of code morsea ... please again (stop -> finish adding new sign)
 * -
 * add new sign of code morsea ... please again (stop -> finish adding new sign)
 * - •• -
 * add new sign of code morsea ... please again (stop -> finish adding new sign)
 * -
 * add new sign of code morsea ... please again (stop -> finish adding new sign)
 * ..-
 * add new sign of code morsea ... please again (stop -> finish adding new sign)
 * Stop
 * add new sign of code morsea ... please again (stop -> finish adding new sign)
 * alphabet text: JESTEM TU   (I AM HERE)
 *
 * Process finished with exit code 0
 */
public class MorseCodeToLettersOrNumbers extends MorseCode{

    public MorseCodeToLettersOrNumbers() {
        completeTheArrays();
    }

    /**
     * retrieves the text of the morse code
     * @return
     */
    public String getTextByUserForMorseCode() {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        String text, textOfResult = "";
        System.out.println("Show code morse -> letter in alphabet:");

        showCodeMorseWithLetters();
        showCodeMorseWithNumbers();

        System.out.println("sign comma in morse code -> --••-- , use this sign as spaces between words");

        while(exit) {
            text = sc.nextLine();

            if( (text.equals("stop")) ) {
                exit = false;
            }

            textOfResult += checkTheTextByUser(text);
            System.out.println("add new sign of code morsea ... please again ( stop -> finish adding new sign)");
        }
        return textOfResult;
    }

    /**
     * converts morse code to plain text
     * @param textByUser
     */
    public void changingGivenMorseCodeToSentence(String textByUser) {

        String[] textUser = textByUser.split(" ");

        String normalText = "";
        for(int i = 0; i < textUser.length; i++) {
            normalText += morseaCodeOnletterOrNumber(textUser[i]);
        }

        System.out.println("alphabet text: " + normalText); //show normal text
    }


    /**
     * Morsea code to words
     * @param codeMorsea
     * @return
     */
    public String morseaCodeOnletterOrNumber(String codeMorsea) {
        int index = lookingInLetters(codeMorsea); //checks by the letter
        if(index > -1) {
            return String.valueOf( getArrayOfLetters()[index] );
        }
        index = lookingInNumbers(codeMorsea); // by number
        if(index > -1) {
            return String.valueOf( getArrayOfNumbers()[index] );
        }
        if(codeMorsea.equals("--••--")) {
            return " "; // space as a morse code commaa
        }
        return "";
    }

    public String checkTheTextByUser(String text) {
        int index = lookingInLetters(text);
        if (index > -1) {
            return text + " ";
        }
        index = lookingInNumbers(text);
        if(index > -1) {
            return text + " ";
        }
        if(text.equals("--••--")) {
            return "--••--" + " ";
        }


        return "";
    }
}
