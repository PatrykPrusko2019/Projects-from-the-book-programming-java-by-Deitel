package chapter_14.exercise_14_13_show_check;

import java.util.Scanner;

/**
 shows the correct statement from a given check:
 - item 9 maximum
 - if there are empty fields, please fill in: *

 example of operation:


 enter the amount, maximum length of 9 items (for example 99 999,99 euros):
 sda
 wrong value
 enter the amount, maximum length of 9 items (for example 99 999,99 euros):
 87.78
 amount is ok
 valid check:
 ****87.78
 Process finished with exit code 0

 */
public class Check {
    public static void main(String[] args) {

        new Check().startApp();
    }


    private void startApp() {
        double amount = getAmountByUser();

        showToTheDisplay(amount);

    }

    private void showToTheDisplay(double amount) {

        char[] tabOfAmount;
        double rest = amount % (int)amount;

        String emptyField = addsEmptyField(amount);

        if(rest > 0.0) {
            String str = String.valueOf(amount);
            tabOfAmount = str.toCharArray();
        } else {
            String str = String.valueOf(amount + "0");
            tabOfAmount = str.toCharArray();
        }

        tabOfAmount = completesTheTableWithStars(tabOfAmount, emptyField); //complete * when empty position

        System.out.println("valid check: ");
        for(int i = tabOfAmount.length-1; i >= 0; i--) {
            System.out.print(tabOfAmount[i]);
        }

    }

    private String addsEmptyField(double amount) {
        if(amount / 1000 > 0) {
            return " ";
        } else {
            return "";
        }
    }

    private char[] completesTheTableWithStars(char[] tabOfAmount, String emptyField) {
        String str = "";
        int counter = 0;
        for(int i = tabOfAmount.length-1; i >= 0; i--) {

            if(counter == 6) {// when it is on the 6th position from the back, add or add nothing to String
                str += emptyField + tabOfAmount[i];
            } else {
                str += tabOfAmount[i];
            }
            counter++;
        }

        counter = 9 - str.length();
        for(int i = 0; i < counter; i++) {
            str += "*";
        }

        tabOfAmount = str.toCharArray();
        return tabOfAmount;
    }

    private double getAmountByUser() {

        Scanner sc = new Scanner(System.in);
        double amount = 0.0;
        boolean exit = true;
        do {
            System.out.println("enter the amount, maximum length of 9 items (for example 99 999,99 euros):");
            if(sc.hasNextDouble()) {
                amount = sc.nextDouble();
                sc.nextLine();
                if(amount > 0 && amount < 100000) {
                    System.out.println("amount is ok");
                    exit = false;
                } else {
                    System.out.println("wrong range 0 - 99 999.99");
                }
            } else {
                System.out.println("wrong value ");
                sc.nextLine();
            }

        }while(exit);
        return amount;
    }
}
