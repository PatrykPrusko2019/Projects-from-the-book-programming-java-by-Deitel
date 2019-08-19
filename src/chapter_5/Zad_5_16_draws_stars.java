package chapter_5;

import java.util.Scanner;

/**
 * draws stars
 */
public class Zad_5_16_draws_stars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("choose five digits of range numbers 1 - 30: ");

        int[] tab = new int[5];
        int count = 0;
        while(count < 5) {

            System.out.println("give me a number: ");
            boolean flag = sc.hasNextInt();
            if(flag) {
                int number = sc.nextInt();
                sc.nextLine();
                if(number < 1 || number > 30) { System.out.println("wrong range ... 1 - 30"); continue; }
                tab[count] = number;
                count++;
            } else {
                System.out.println("wrong value ...");
                sc.nextLine();
            }

        }

        //rysuje *

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i] ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
