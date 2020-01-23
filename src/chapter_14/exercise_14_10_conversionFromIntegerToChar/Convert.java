package chapter_14.exercise_14_10_conversionFromIntegerToChar;

import java.util.Scanner;

/**
 * the program asks the user to enter 10 numbers,
 * then the result on the console converting from integer to char
 */
public class Convert {

    public static void main(String[] args) {

        new Convert().startApp();
    }


    private void startApp() {

        int[] tabNumericCode = getTheNumericCode();

        showNumericCodeToSign(tabNumericCode);

    }

    private void showNumericCodeToSign(int[] tabNumericCode) {
        //convert int to char
        char[] tabChar = new char[tabNumericCode.length];
        for(int i = 0; i < tabNumericCode.length; i++) {
            tabChar[i] += tabNumericCode[i];
        }
        //show
        String helpZero = "";
        for(int i = 0; i < tabChar.length; i++) {

            if(tabNumericCode[i] > -1 && tabNumericCode[i] < 10) {
                helpZero = "00" + tabNumericCode[i];
            } else if(tabNumericCode[i] > 9 && tabNumericCode[i] < 100) {
                helpZero = "0" + tabNumericCode[i];
            } else {
                helpZero = "" + tabNumericCode[i];
            }

            System.out.println("integer: " + helpZero + " to char: " + tabChar[i]);
        }
    }

    private int[] getTheNumericCode() {
        Scanner sc = new Scanner(System.in);
        int[] tabNumericCode = new int[10];
        boolean isExit = true;
        int counter = 0;
        do {
            System.out.println("give me a numeric code 0 - 255: (please 10 numbers select)");
            if( sc.hasNextInt() ) {
                int value = sc.nextInt();
                sc.nextLine();
                if(value > -1 && value < 256) {
                    if( counter < tabNumericCode.length) {
                        tabNumericCode[counter] = value;
                        counter++;
                        if(counter == tabNumericCode.length) {
                            isExit = false;
                        }
                    }
                } else {
                    System.out.println("wrong range 0 - 255");
                }
            } else {
                System.out.println("wrong value , no integer");
                sc.nextLine();
            }
        } while (isExit);

        return tabNumericCode;
    }
}
