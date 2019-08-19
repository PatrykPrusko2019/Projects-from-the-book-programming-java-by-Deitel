package chapter_4.exercise_4_33_Chessboard;

public class Chessboard {

    public static void main(String[] args) {

        for(int i = 0; i < 8; i++) {
            if(i % 2 != 0) System.out.print(" ");//jesli i niepazyste to przesun " "
            for(int j = 0; j < 8; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
