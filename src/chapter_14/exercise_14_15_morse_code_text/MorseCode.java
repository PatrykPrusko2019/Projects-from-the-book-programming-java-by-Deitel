package chapter_14.exercise_14_15_morse_code_text;

/**
 * code morse class base abstract
 */
public abstract class MorseCode {

    private String[] arrayOfMorseCodeLetters;
    private String[] arrayOfMorseCodeNumbers;
    private char[] arrayOfLetters;
    private char[] arrayOfNumbers;

    public String[] getArrayOfMorseCodeLetters() {
        return arrayOfMorseCodeLetters;
    }
    public void setArrayOfMorseCodeLetters(String[] arrayOfMorseCodeLetters) {
        this.arrayOfMorseCodeLetters = arrayOfMorseCodeLetters;
    }
    public String[] getArrayOfMorseCodeNumbers() {
        return arrayOfMorseCodeNumbers;
    }
    public void setArrayOfMorseCodeNumbers(String[] arrayOfMorseCodeNumbers) {
        this.arrayOfMorseCodeNumbers = arrayOfMorseCodeNumbers;
    }
    public char[] getArrayOfLetters() {
        return arrayOfLetters;
    }
    public void setArrayOfLetters(char[] arrayOfLetters) {
        this.arrayOfLetters = arrayOfLetters;
    }
    public char[] getArrayOfNumbers() {
        return arrayOfNumbers;
    }
    public void setArrayOfNumbers(char[] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    public void completeTheArrays() {
        this.setArrayOfLetters(new char[26]);
        this.setArrayOfNumbers(new char[10]);
        createLettersOfAlphabet();
        createNumbersOfArray();
        this.setArrayOfMorseCodeLetters(new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."});
        this.setArrayOfMorseCodeNumbers(new String[]{".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"});
    }

    private void createNumbersOfArray() {
        for(char i = '1', j = 0; i <= '9'; i++, j++ ) {
           if(j == getArrayOfNumbers().length-1) {
                getArrayOfNumbers()[j] = '0';
           } else {
               getArrayOfNumbers()[j] = i;
           }
        }
    }

    private void createLettersOfAlphabet() {
        for(char i = 'A', j = 0; i <= 'Z'; i++, j++) {
            getArrayOfLetters()[j] = i;
        }
    }

    /**
     * replaces the digit found with morse code, if not found then an empty String
     * @param indexOfNumber
     * @return eturns the equivalent of the walrus code from the given digit
     */
    public String convertsNumbersToMorseaCode(int indexOfNumber) {
        if(indexOfNumber > -1 && indexOfNumber < getArrayOfMorseCodeNumbers().length) {
            return getArrayOfMorseCodeNumbers()[indexOfNumber];
        }
        return "";
    }

    /**
     * searches for the given character in numbers
     * @param wordForChar
     * @return
     */
    public int lookingInNumbers(char wordForChar) {
        for(int i = 0; i < getArrayOfNumbers().length; i++) {
            if(wordForChar == getArrayOfNumbers()[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * turns the letter found into a morsea code
     * @param indexOfLetter
     * @return
     */
    public String convertsLettersToMorseaCode(int indexOfLetter) {
        if(indexOfLetter > -1 && indexOfLetter < getArrayOfMorseCodeLetters().length){
            return getArrayOfMorseCodeLetters()[indexOfLetter];
        } else {
            return "";
        }
    }

    /**
     *
     * searches for the given letter in the alphabet, if so return the index number
     * so that you can then find the equivalent from the morse code
     * @param wordForChar
     * @return returns the index number of the given letter, -1 if the given letter is missing
     */
    public int lookingInLetters(char wordForChar) {
        for(int i = 0; i < getArrayOfLetters().length; i++) {
            if(getArrayOfLetters()[i] == wordForChar) {
                return i;
            }
        }
        return -1;
    }

    /**
     * looks for a given walrus code counterpart to create morse code text
     * @param codeMorsea
     * @return returns the index number of the given letter, -1 if no match exists from the walrus code
     */
    public int lookingInLetters(String codeMorsea) {
        for(int i = 0; i < getArrayOfMorseCodeLetters().length; i++) {
            if(getArrayOfMorseCodeLetters()[i].equals(codeMorsea) ) {
                return i;
            }
        }
        return -1;
    }

    /**
     * looks for a given walrus code counterpart to create morse code text
     * @param codeMorsea
     * @return
     */
    public int lookingInNumbers(String codeMorsea) {
        for(int i = 0; i < getArrayOfMorseCodeNumbers().length; i++) {
            if(getArrayOfMorseCodeNumbers()[i].equals(codeMorsea)) {
                return i;
            }
        }
        return -1;
    }

    public void showCodeMorseWithNumbers() {
        for(int i = 0; i < getArrayOfMorseCodeNumbers().length; i++) {
            System.out.println(getArrayOfMorseCodeNumbers()[i] + " -> " + getArrayOfNumbers()[i]);
        }
    }

    public void showCodeMorseWithLetters() {
        for(int i = 0; i < getArrayOfMorseCodeLetters().length; i++) {
            System.out.println(getArrayOfMorseCodeLetters()[i] + " -> " + getArrayOfLetters()[i]);
        }
    }

}
