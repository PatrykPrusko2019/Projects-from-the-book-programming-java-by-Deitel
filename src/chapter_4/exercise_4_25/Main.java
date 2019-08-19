package chapter_4.exercise_4_25;
//shows graphics
public class Main {
    public static void main(String[] args) {

        int count = 1;

        while (count <= 10) {

            System.out.println(count % 2 == 1 ? "****" : "+++++++++"); //jesli jest nieparzyste -> "****" , a parzyste -> "+++++++++"
            ++count;
        }

    }

}
