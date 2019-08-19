package chapter_7.exercise;
//shows array
public class Exercise_7_15 {
    public static void main(String[] args) {

        int[] array;

        if(args.length == 0 ) { // jesli nie poda sie np java Exercise_7_15 13, to tablica 10 elementowa
            array = new int[10];
        } else {
            int size = Integer.parseInt(args[0]);
            array = new int[size];
        }


        System.out.printf("%s%10s%n", "Indeks", "Wartość"); // Nagłówki kolumn.

        // Wyświetl wartości poszczególnych elementów tablicy.
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%6d%10d%n", counter, array[counter]);
        }

    }
}
