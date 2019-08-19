package chapter_7.exercise;

import java.util.Random;

/**
 * result Of Rolling Dice
 */
public class Exercise_7_17_rollingDice {
    static Random rand = new Random();

    public static void main(String[] args) {

        int[] resultTab = rollsOfDice();

        showTabResult(resultTab);


    }

    private static void showTabResult(int[] resultTab) {

        for(int i = 2; i < resultTab.length; i++) { //range 2 - 12
            System.out.println(i + " : result -> " + resultTab[i]);
        }
    }

    private static int[] rollsOfDice() {
        int[] scoreOfBonesToPlay = new int[13];
        for(int i = 0; i < 36_000_000; i++) {

            int result = resultOfRollingDice();
           fillOfScoreOfBonesToPlay(scoreOfBonesToPlay, result);


        }

        return scoreOfBonesToPlay;
    }

    private static void fillOfScoreOfBonesToPlay(int[] scoreOfBonesToPlay, int result) {
        for(int i = 2; i < scoreOfBonesToPlay.length; i++ ) {
            if(result == i) {
                scoreOfBonesToPlay[i]++; //the number of repetitions
            }
        }

    }

    private static int resultOfRollingDice() {
        int diceFirst, diceSecond;
        diceFirst = rand.nextInt(6) + 1; //range 1 - 6
        diceSecond = rand.nextInt(6) + 1;

        return diceFirst + diceSecond;
    }
}
