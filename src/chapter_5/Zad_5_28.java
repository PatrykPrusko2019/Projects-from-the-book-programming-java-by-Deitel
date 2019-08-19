package chapter_5;

public class Zad_5_28 {

    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) { // Przejdź przez pętlę 10 razy
            if (count != 5) {
                System.out.printf("%d ", count);   // Pomiń pozostały kod pętli, jeśli count wynosi 5
            }


        }

        System.out.printf("%nUżyto continue do pominięcia wyświetlenia 5%n");
    }
}
