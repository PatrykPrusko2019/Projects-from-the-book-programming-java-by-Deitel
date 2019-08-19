package chapter_2;

import java.util.Scanner;

public class Exercise_24_25_26_27 {

    public static void main(String[] args) {


        int[] tab = new int[]{2, 100, -8, 700, -33};

        int max = 0, min = 0;
        for (int i = 1; i < tab.length; i++) {

            if (max < tab[i]) {
                max = tab[i];
            } else {
                min = tab[i];
            }
        }

        System.out.println(max + " max, " + min + " min");


        //25
        int[] tab_parzysta = new int[]{4, 8, 17, 16, 233, 100, 7};

        for(int i = 0; i < tab_parzysta.length; i++) {

            if(tab_parzysta[i] % 2 == 0) {
                System.out.println("even numbers: " + tab_parzysta[i]);//parzysta
            } else {
                System.out.println("odd numbers: " + tab_parzysta[i]);//nieparzysta
            }
        }


        //26
        int first = 17;
        int second = 4;

        if(first % second == 0) {
            System.out.println(" pierwsza liczba jest wielokrotnoscia drugiej liczby : first " + first + ", second " + second );
        } else {
            System.out.println(" nie jest pierwsza liczba wielokrotnoscia drugiej liczby : first " + first + ", second " + second );
        }


        //27

        for(int i = 0; i < 8; i++) {
            if(i % 2 == 0) {
                System.out.println("* * * * * * * *");
            } else {
                System.out.println(" * * * * * * * *");
            }
        }

        //28
        Scanner sc = new Scanner(System.in);
        System.out.println("give me a radius a circle ");
        int radius = sc.nextInt();

        System.out.printf("%d srednica, %f obwod, %f pole", (2*radius)
                , (2 * Math.PI * radius), (Math.PI * (radius * radius)) );


        //29
        System.out.println();
        System.out.printf("%c = %d%n %c = %d%n %c = %d%n %c = %d%n %c = %d%n %c = %d%n %c = %d%n %c = %d%n %c = %d%n %c = %d%n %c = %d%n %c = %d%n  ",
                'A', ((int) 'A') ,'B', ((int) 'B'),  'C', ((int) 'C'),  'a', ((int) 'a'),  'b', ((int) 'b'),  'c', ((int) 'c') ,
                '1', ((int) '1') ,  '2', ((int) '2') ,  '$', ((int) '$') ,  '*', ((int) '*') ,  '+', ((int) '+') ,  '/', ((int) '/') );






    }
    }



