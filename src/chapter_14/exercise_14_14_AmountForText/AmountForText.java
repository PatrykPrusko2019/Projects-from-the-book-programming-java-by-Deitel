package chapter_14.exercise_14_14_AmountForText;

import java.util.Scanner;

/**
 * the amount 0.00 - 1000.00 is given, then the text is converted to a string and the result is given at the end.
 *  If you enter an incorrect value, you will be asked again to enter the correct amount.
 *  Example of application:
 *
 *  give me a amount, range 0.00 - 1000.00:
 *  817.63
 *  amount is approx
 *  AMOUNT OF USER: 817.63, NUMBER AFTER CHANGES TO THE TEXT:
 *   eight hundred and seventeen euros sixty-three cents -> the result is given in euros and cents
 *
 */
public class AmountForText {
    public static void main(String[] args) {

        new AmountForText().startApp();
    }


    private void startApp() {


        double amount = getAmountByUser();

        createTheAmountInWords(amount);

    }

    private void createTheAmountInWords(double amount) {

        String textOfAmount;
        if (amount - (int) amount > 0) { //has the rest
            textOfAmount = String.valueOf(amount);
            int index = textOfAmount.indexOf('.');
            String restStr = textOfAmount.substring(index + 1);
            textOfAmount = textOfAmount.substring(0, index);

            char[] arrayOfNumbers = textOfAmount.toCharArray();

            if( Integer.parseInt(textOfAmount) > 0) { //if amount as int is true then add euros
                textOfAmount = lookingForTheRightWords(arrayOfNumbers) + " euros ";
            } else {
                textOfAmount = "";
            }

            restStr = restStr + checkRestOfAmount(amount); // for example 0.1 -> 0.10 appends 0 to the string

            arrayOfNumbers = restStr.toCharArray();

            textOfAmount += lookingForTheRightWords(arrayOfNumbers) + " cents ";


        } else { //no rest
            textOfAmount = String.valueOf((int) amount);
            textOfAmount = lookingForTheRightWords( textOfAmount.toCharArray() ) + " euros ";
        }

        showTextVersionOfTheAmount(amount, textOfAmount);
    }

    /**
     * display text
     * @param amount
     * @param textOfAmount
     */
    private void showTextVersionOfTheAmount(double amount, String textOfAmount) {
        System.out.println("AMOUNT OF USER: " + amount + ", NUMBER AFTER CHANGES TO THE TEXT:\n " + textOfAmount);
    }

    /**
     * create new text of number by get user
     * @param arrayOfNumbers
     * @return
     */
    private String lookingForTheRightWords(char[] arrayOfNumbers) {
        String newTextForNumber = "";
        if(arrayOfNumbers.length == 3) {   // adds hundreds

            newTextForNumber = createTheHundredthPart(newTextForNumber, arrayOfNumbers);

        } else if(arrayOfNumbers.length == 2 && ! (isLessThanTwenty(arrayOfNumbers)) ) {

            newTextForNumber = createDecimalPart(newTextForNumber, arrayOfNumbers);

        } else if(arrayOfNumbers.length == 2 &&  isLessThanTwenty(arrayOfNumbers) ){ // if 2 items and between 10 - 19

            newTextForNumber = createDecimalPartFromElevenToNineteen(newTextForNumber, arrayOfNumbers);

        } else {

            newTextForNumber = createOneDigitalPart(newTextForNumber, arrayOfNumbers);

        }

        return newTextForNumber;
    }

    /**
     * creates a one-digit number 1-9
     * @param newTextForNumber
     * @param arrayOfNumbers
     * @return returns the given string
     */
    private String createOneDigitalPart(String newTextForNumber, char[] arrayOfNumbers) {
        int value = Integer.parseInt( String.valueOf(arrayOfNumbers[0]));
        newTextForNumber += getUnits(value);
        return newTextForNumber;
    }

    /**
     * creates a two-digit number 11-19
     * @param newTextForNumber
     * @param arrayOfNumbers
     * @return returns the given string
     */
    private String createDecimalPartFromElevenToNineteen(String newTextForNumber, char[] arrayOfNumbers) {
        int value;
        value = Integer.parseInt(String.valueOf(arrayOfNumbers));
        newTextForNumber += getUnits(value);
        return newTextForNumber;
    }

    /**
     * creates a two-digit number e.g 20
     * @param newTextForNumber
     * @param arrayOfNumbers
     * @return returns the given string
     */
    private String createDecimalPart(String newTextForNumber, char[] arrayOfNumbers) {
        int value;
        String temp = "";
        value = Integer.parseInt( String.valueOf(arrayOfNumbers[0]));
        newTextForNumber += getTens(value * 10);
        int valueSecond = Integer.parseInt( String.valueOf(arrayOfNumbers[1]));
        if(value > 0 && ( valueSecond > 0 )) { temp = "-"; } else { temp = ""; }
        newTextForNumber += temp + getUnits(valueSecond);

        return newTextForNumber;
    }

    /**
     * forms the hundredth part of a number -> 3 items for example 300
     * @param newTextForNumber
     * @return returns np. 300
     */
    private String createTheHundredthPart(String newTextForNumber, char[] arrayOfNumbers) {
        int value;
        String temp = "";
        value = Integer.parseInt( String.valueOf(arrayOfNumbers[0]));
        newTextForNumber += getUnits(value) + " hundred ";
        value = Integer.parseInt( String.valueOf(arrayOfNumbers[1]));
        if(value > 0) { temp = "and "; }
        arrayOfNumbers =  new char[]{arrayOfNumbers[1], arrayOfNumbers[2]};
        if(isLessThanTwenty(arrayOfNumbers)) { // if 2 items and between 10 - 19
            value = Integer.parseInt(String.valueOf(arrayOfNumbers));
            newTextForNumber += temp + getUnits(value);
        } else {
            newTextForNumber += temp + getTens(value * 10);
            int valueSecond = Integer.parseInt(String.valueOf(arrayOfNumbers[1]));
            if (value > 0 && valueSecond > 0) {
                temp = "-";
            } else {
                temp = "";
            }
            newTextForNumber += temp + getUnits(valueSecond);
        }
        return newTextForNumber;
    }

    private boolean isLessThanTwenty(char[] arrayOfNumbers) {

        int value = Integer.parseInt(String.valueOf(arrayOfNumbers));

        if(value > 9 && value < 20) {
            return true;
        } else {
            return false;
        }
    }

    private String getTens(int value) {
        String str = "";
        switch (value) {
            case 20: {
                str = "twenty";
                break;
            }
            case 30: {
                str = "thirty";
                break;
            }
            case 40: {
                str = "forty";
                break;
            }
            case 50: {
                str = "fifty";
                break;
            }
            case 60: {
                str = "sixty";
                break;
            }
            case 70: {
                str = "seventy";
                break;
            }
            case 80: {
                str = "eighty";
                break;
            }
            case 90: {
                str = "ninety";
                break;
            }
        }
        return str;
    }

    private String getUnits(int value) {
        String str = "";
        switch (value) {
            case 1: {
                str = "one";
                break;
            }
            case 2: {
                str = "two";
                break;
            }
            case 3: {
                str = "three";
                break;
            }
            case 4: {
                str = "four";
                break;
            }
            case 5: {
                str = "five";
                break;
            }
            case 6: {
                str = "six";
                break;
            }
            case 7: {
                str = "seven";
                break;
            }
            case 8: {
                str = "eight";
                break;
            }
            case 9: {
                str = "nine";
                break;
            }
            case 10: {
                str = "ten";
                break;
            }
            case 11: {
                str = "eleven";
                break;
            }
            case 12: {
                str = "twelve";
                break;
            }
            case 13: {
                str = "thirteen";
                break;
            }
            case 14: {
                str = "fourteen";
                break;
            }
            case 15: {
                str = "fifteen";
                break;
            }
            case 16: {
                str = "sixteen";
                break;
            }
            case 17: {
                str = "seventeen";
                break;
            }
            case 18: {
                str = "eighteen";
                break;
            }
            case 19: {
                str = "nineteen";
                break;
            }
        }
        return str;
    }

    private double getAmountByUser() {
        boolean exit = true;
        Scanner sc = new Scanner(System.in);
        double amount = 0.0;

            do {
                System.out.println("give me a amount , range 0.00 - 1000.00: ");
                if (sc.hasNextDouble()) {
                    amount = sc.nextDouble();
                    sc.nextLine();
                    if (amount > 0 && amount - 1000 < 0) { // range 0.01 euro - 999.99
                        System.out.println("amount is ok");
                        exit = false;
                    } else {
                        System.out.println("no range ...");
                    }

                } else {
                    System.out.println("wrong value ...");
                    sc.nextLine();
                }

            } while (exit);

        return amount;
    }

    /**
     * checks the rest of the amount given by the user, if the rest e.g. range 0.1> amount <0.9 -> then you need to add 0.10
     * @param amount
     * @return
     */
    private String checkRestOfAmount(double amount) {

        String str = String.valueOf(amount);
        int value = str.indexOf('.');
        str = str.substring(value + 1);
        value = Integer.parseInt(str);

        if( (value > 0 && value < 10) && (str.length() == 1)) { // checks the string length of the rest because as e.g. 01.01 -> it can't add zero, only with e.g. 01.1 it has to add

            return "0";
        } else {
            return "";
        }
    }

}
