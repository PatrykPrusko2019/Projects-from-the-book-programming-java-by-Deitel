package chapter_14.exercise_14_15_morse_code_text;

/**
 * morse code start class
 */
public class StartApp {

    public static void main(String[] args) {

        new StartApp().startApp();

    }

    private void startApp() {


        LettersOrNumbersOnCodeMorse l = new LettersOrNumbersOnCodeMorse();

        System.out.println("please give me a text to convert to morse code:");
        l.changingGivenSentenceToMorseCode(l.getTextByUser());

        MorseCodeToLettersOrNumbers m = new MorseCodeToLettersOrNumbers();

        System.out.println("please give me a morse code to convert to text:");
        m.changingGivenMorseCodeToSentence(m.getTextByUserForMorseCode());
    }
}
