package chapter_5;
//interest -> 5, 6 ,7 ,8 ,9 ,10 %
//oprocentowanie -> 5, 6 ,7 ,8 ,9 ,10 %
public class Zad_5_14_interest {
    public static void main(String[] args) {
        double principal = 1000.0; // Kapitał początkowy
        double rate = 5; // Oprocentowanie
        double resultRate;
        // Wyświetl nagłówki
        System.out.printf("%s%20s%n", "Rok", "Saldo");

        // Oblicz saldo dla każdego z 10 lat
        for (int year = 1; year <= 6; ++year, rate++) {
            // Oblicz nowe saldo dla konkretnego roku
            resultRate = rate / 100;
            double amount = principal * Math.pow(1.0 + resultRate, year);
            System.out.println(resultRate + " oprocentowanie ");
            // Wyświetl rok i saldo
            System.out.printf("%3d%,20.2f%n", year, amount);
        }
    }


}
