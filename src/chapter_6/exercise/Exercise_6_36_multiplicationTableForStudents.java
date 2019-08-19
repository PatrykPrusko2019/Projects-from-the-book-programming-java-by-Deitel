package chapter_6.exercise;

import java.security.SecureRandom;
import java.util.Scanner;

//multiplication table for students

class Exercise_6_36_multiplicationTableForStudents {
    static SecureRandom rand = new SecureRandom();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        choiceOfOptions();

    }

    private static void choiceOfOptions() {

        System.out.println("welcome my friend : ");
        boolean exit = false, exit_2 = false;
        printOptions();

        while(! exit) {

            int first = randomNumber();
            int second = randomNumber();
            System.out.println("how much is " + first + " * " + second + " = ");
            checksTheGivenNumber(first, second);

            exit_2 = false;
            while (! exit_2) {
                System.out.println("choose options (2- show options): ");
                boolean isInt = sc.hasNextInt();

                if (isInt) {
                    int number = sc.nextInt();
                    sc.nextLine();

                    if (number >= 0 && number < 3) {
                        switch (number) {
                            case 0: {
                                System.out.println("exit applications , bye !!!");
                                exit_2 = true;
                                exit = true;
                                break;
                            }
                            case 1: {
                                System.out.println("************ next task ************");
                                exit_2 = true;
                                break;
                            }
                            case 2: {
                                System.out.println("**********************");
                                printOptions();
                                System.out.println("**********************");
                                break;
                            }
                        }
                    } else {
                        System.out.println("wrong value 0 - 2 ...");
                        exit_2 = false;
                    }
                } else {
                    System.out.println(" wrong value not INTEGER ");
                    sc.nextLine();
                }
            }
        }



    }

    private static void checksTheGivenNumber(int first, int second) {
        boolean exit = false;
        int result = first * second;
        while(! exit) {
            System.out.println("choose the result: ");
            boolean isInt = sc.hasNextInt();

            if(isInt) {
                int number = sc.nextInt();
                sc.nextLine();
                if(number == result) {
                    System.out.println(" correct answer -> " + first + " * " + second + " = " + number);
                    showComment(true);
                    exit = true;
                } else {
                    showComment(false);
                }
            } else {
                System.out.println("wrong value ...");
                sc.nextLine();
            }
        }
    }

    private static void showComment(boolean result) {

        if (result) { //if good answer
            int valueRandom = rand.nextInt(4) + 1;
            switch (valueRandom) {
                case 1: {
                    System.out.println("perfectly");
                    break;
                }
                case 2: {
                    System.out.println("great");
                    break;
                }
                case 3: {
                    System.out.println("keep it up");
                    break;
                }
                case 4: {
                    System.out.println("good job");
                    break;
                }
            }
        } else { //if bad answer
            int valueRandom_2 = rand.nextInt(4) + 1;
            System.out.println(valueRandom_2);
            switch (valueRandom_2) {
                case 1: {
                    System.out.println("do not try again");
                    break;
                }
                case 2: {
                    System.out.println("wrong again");
                    break;
                }
                case 3: {
                    System.out.println("do not give up");
                    break;
                }
                case 4: {
                    System.out.println("no . you have another chance");
                    break;
                }
            }

        }

    }

    private static int randomNumber() {
        int result = rand.nextInt(10) + 1;
        return result;
    }

    private static void printOptions() {
        System.out.println("0. exit \n1.next task of the multiplication table \n2. show options");
    }
}