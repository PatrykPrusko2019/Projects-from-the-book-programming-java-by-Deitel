package chapter_4.exercise_4_22_shows_the_array;
//shows the array
public class Main {
    public static void main(String[] args) {

        System.out.printf("\tN \t10*N \t100*N \t1000*N %n");

        for(int i = 1; i < 6; i++) {
                System.out.printf("\t%d \t%d \t\t%d \t%d %n", i, i*10, i*100, i*1000);
            }
        }



}
