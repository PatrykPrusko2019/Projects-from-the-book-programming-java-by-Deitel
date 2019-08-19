package chapter_5;

import java.util.Scanner;

//1 - > 19 range create diamond
public class Zad_5_25_create_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        boolean flag = false;
        while(! flag) {

            System.out.println("hello , give some number (range 1 - 19) to create a diamond : ");
            boolean isInt = sc.hasNextInt();

            if (isInt) {

                counter = sc.nextInt();
                sc.nextLine();
                if(counter > 0 && counter < 20) { // 1 - 19
                    flag = true;
                }
            } else {
                System.out.println("wrong value a number ... try again");
                sc.nextLine();
            }
        }




        if(counter % 2 == 0) { counter++; } //jesli parzysta liczba aby zbudowac romb to dodaj jeden aby dolny czubek byl

        for (int i = 0; i < counter; i++) { //column -> |
            for(int j = 0; j < counter; j++) { //line -> -


                if(i <= counter/2) {
                    if ((j >= (counter / 2) - i) && (j <= (counter / 2) + i)) { // 9/2 -> 4  -> j < 4 || j > 4
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                } else { // i >= 5  , (i - (counter/2)) -> 5 - 4 -> 1 , 2, 3, 4 ...
                    if ( (j >= (i - (counter/2)) ) &&  (j < ( counter - (i - (counter/2)) )  ) ){ // 9/2 -> 4  -> j < 4 || j > 4
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }

    }

}
