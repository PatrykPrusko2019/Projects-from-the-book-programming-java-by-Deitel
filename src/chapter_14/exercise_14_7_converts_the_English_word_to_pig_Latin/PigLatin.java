package chapter_14.exercise_14_7_converts_the_English_word_to_pig_Latin;

import java.util.Scanner;

/**
 *
 * converts the English word to pig Latin
 *
 * Foundation:
 * word has at least 2 characters, the space between words is a space
 */
public class PigLatin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "";
        boolean exit = true;
        while(exit) {

            System.out.println("please give me a word in english: ");
            String strTemp = sc.nextLine();
            if(strTemp.length() > 1) {
                strTemp.toLowerCase(); //na male litery
                str += strTemp + " ";
                System.out.println("add new word");
                exit = checksWhatsNext(sc);
            } else {
                System.out.println("wrong range word < 2 ... try again");
            }

        }

        printLatinWord(str);

    }
    private static boolean checksWhatsNext(Scanner sc) {
        String strTemp;
        boolean exit = false;
        do {
            System.out.println("do you want add next word ?? y or n: ");
            strTemp = sc.nextLine();
            if (strTemp.equals("y")) {
                exit = true;
            } else if (strTemp.equals("n")) {
                exit = false;
            } else {
                System.out.println("wrong value , please again ...");
            }

        }while( ! (strTemp.equals("y") || strTemp.equals("n")) );

        return exit;
    }


    private static void printLatinWord(String str) {

        String[] tabStrings = str.split(" ");

        //vowels as they occur, skip the word change -> A E I O U Y

        for(int i = 0; i < tabStrings.length; i++) {
            String temp = tabStrings[i];

            if( ! ( (temp.startsWith("a")) || (temp.startsWith("e")) || (temp.startsWith("i")) || (temp.startsWith("o")) ||
                    (temp.startsWith("u")) || (temp.startsWith("y")) )   ) {

                char c = temp.charAt(0);
                temp = temp.substring(1); // removes the first character from the word
                temp = temp + c + "ay";
                tabStrings[i] = temp; //change for example "jump" -> ump + j + ay -> umpjay
            }
        }

        //show words
        System.out.println("show words after changes: ");
        for(int i = 0; i < tabStrings.length; i++) {
            System.out.println(tabStrings[i]);
        }
    }
}
