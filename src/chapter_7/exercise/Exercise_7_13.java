package chapter_7.exercise;

public class Exercise_7_13 {
    public static void main(String[] args) {
        //3 x 5
        int[][] salesTab = new int[3][5];

        for(int row = 0; row < salesTab.length; row++) {
            for(int column = 0; column < salesTab[row].length; column++) {
            salesTab[row][column] = 0;
                System.out.print( salesTab[row][column] + ", ");

            }
            System.out.println();
        }
    }
}
