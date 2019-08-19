package chapter_4.exercise_4_36_Triangle;

import java.util.Scanner;

//sides of the triangle
public class Triangle {

    private static int[] tab;
    private static boolean isA = false;
    private static boolean isB = false;
    private static boolean isC = false;

    public static void main(String[] args) {


        passSidesOfTriangle();

        checkSidesAreCorrect();

    }

    private static void checkSidesAreCorrect() {

        int a = tab[0]; //3 boki trojkata
        int b = tab[1];
        int c = tab[2];

        if(a < b + c) {
            isA = true;
        } else {
            System.out.println("wrong value a !!!");
        }

        if(b < a + c) {
            isB = true;
        } else {
            System.out.println("wrong value b !!!");
        }

        if(c < a + b) {
            isC = true;
        } else {
            System.out.println("wrong value c !!!");
        }

        if(isA && isB && isC) {
            System.out.println("create new triangle !!!");
        }


    }

    private static void passSidesOfTriangle() {
        tab = new int[3];
        int sides;
        Scanner sc = new Scanner(System.in);

        System.out.println("give me 3 sides of triangle : ");
        for(int i = 0; i < tab.length; i++) {

            do {
                sides = sc.nextInt();
                sc.nextLine();

            }while(sides <= 0);

            tab[i] = sides;
        }

    }

}
