package chapter_5;

public class Zad_5_18_interest {
    //interest -> 5, 6 ,7 ,8 ,9 ,10 %
    //oprocentowanie -> 5, 6 ,7 ,8 ,9 ,10 %

        public static void main(String[] args) {
            int principal = 1000; // Kapitał początkowy
            int rate = 5; // Oprocentowanie
            double resultRate; //oprocentowanie
            int resultCentsInt = 0;
            // Wyświetl nagłówki
            System.out.printf("%s%20s%n", "Rok", "Saldo");

            // Oblicz saldo dla każdego z 10 lat
            for (int year = 1; year <= 6; ++year, rate++) {
                // Oblicz nowe saldo dla konkretnego roku

                resultRate =  ( principal * ( (double) rate / 100) );
                //wydobywamy grosze
                double cents = resultRate - ((int) resultRate); // np 71.92 - 71 = 0.71

                if(cents < 1) {
                    resultCentsInt += (int) (cents * 100); // 0.27 * 100 = 27

                    if (resultCentsInt > 99) { //gdy przekroczy 1 zl to odejmuj i zwieksz kwote -> principal
                        resultCentsInt -= 100;
                        principal += 1;
                    }
                }


                principal += (int) resultRate;

                System.out.println("result rate -> " + principal + " zl, " + resultCentsInt + " centow !!!");





                // Wyświetl rok i saldo
            //    System.out.printf("%3d%,20d%n", year, amount);
            }
        }



}
