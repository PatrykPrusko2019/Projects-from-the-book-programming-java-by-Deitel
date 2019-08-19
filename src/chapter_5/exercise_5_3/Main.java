package chapter_5.exercise_5_3;

public class Main {
    public static void main(String[] args) {


        //a)
        int sum = 0;

        for(int i = 1; i < 100; i++) {
            if(i % 2 != 0) {
                sum += i;//sumuje liczby nieparzyste
            }
        }
        System.out.println("sum " + sum);

        //b)
        double b = 2.5;

        b = Math.pow(b, 3);

        System.out.println(b);

        //c)
        int i = 1;

        while(i <= 20) {
            System.out.print(i);
            if(i % 5 == 0) {
                System.out.println();
            } else {
                System.out.print('\t');
            }
            i++;
        }


        for(i = 1; i <= 20; i++) {

            System.out.print(i);

            if(i % 5 == 0) {
                System.out.println();
            } else {
                System.out.print('\t');
            }
        }

    }
}
