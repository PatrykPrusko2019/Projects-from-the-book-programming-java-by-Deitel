package chapter_6.exercise;

import java.util.Scanner;

/**
 *
 * gets a given number of digits and checks if it is positive or not
 */
public class Exercise_6_17_ifPositiveValue{
    public static void main(String[] args) {

        int[] tab = selectTheNumbers();

        for(int i : tab) {
            System.out.println("the number " + i + " is even -> " + isEven(i) );
        }
    }

    private static int[] selectTheNumbers() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int[] tabNumbers = new int[0];

        while(! exit) {
            System.out.println("select the numbers : ");
            boolean isInt = sc.hasNextInt();
            if(isInt) {
                int numbers = sc.nextInt();
                sc.nextLine();

                tabNumbers = new int[numbers];
                tabNumbers = createToTab(tabNumbers);
                exit = true;
            } else {
                System.out.println("wrong value ... ");
                sc.nextLine();
            }

        }

        return tabNumbers;
    }

    //
    private static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int[] createToTab(int[] tab) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int counter = 0;

        while(! exit) {
            System.out.println("give me a number for tab : ");
            boolean isInt = sc.hasNextInt();
            if(isInt) {

                int numberInTab = sc.nextInt();
                sc.nextLine();

                    tab[counter] = numberInTab;
                    counter++;

                if(counter == tab.length) { exit = true; }

            } else {
                System.out.println("wrong value ... ");
                sc.nextLine();
            }

        }
        return tab;
    }
}
