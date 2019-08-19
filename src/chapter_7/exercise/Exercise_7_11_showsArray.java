package chapter_7.exercise;

/**
 * shows array
 */
public class Exercise_7_11_showsArray {
    public static void main(String[] args) {

        //a)
        int[] tab = new int[] {15, 18, 1, 7, 7, 9, 6, 3, 7, 9, 66, 12, 34, 56, 5};

        for(int counts = 0; counts < tab.length-5; counts++) {
            tab[counts] = 0;
        }

        //b)
        for(int bonus = 0; bonus < tab.length; bonus++) {
            tab[bonus] += 1;
        }



        for(int i = 0; i < tab.length; i++) {

            System.out.print("\t[" + i + "]= " + tab[i] + " | \t");
            if( (i+1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
