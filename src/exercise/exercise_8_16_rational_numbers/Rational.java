package chapter_8.exercise.exercise_8_16_rational_numbers;

import java.util.Scanner;

//liczby wymierne
public class Rational {
    private int numerator; //licznik - góra
    private int denominator; //mianownik -> na dole

    public Rational() {
        this.numerator = 1;
        this.denominator = 2;
    }


    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
            return numerator + "\n---\n" + denominator;
    }

    static Rational add(Rational rational_1, Rational rational_2) {
        int topValue_first = rational_1.getNumerator();
        int topValue_second = rational_2.getNumerator();
        int bottomValue_first = rational_1.getDenominator();
        int bottomValue_second = rational_2.getDenominator();

        //wspólny najmniejszy mianownik
        int valueBottom;
        if(bottomValue_first - bottomValue_second > 0) {
            valueBottom = bottomValue_first;

            do {
                valueBottom += bottomValue_first;
            }while (valueBottom % bottomValue_second != 0);

        } else {
            valueBottom = bottomValue_second;

            do {
                valueBottom += bottomValue_second;
            }while (valueBottom % bottomValue_first != 0);
        }

        bottomValue_first = valueBottom / bottomValue_first;
        bottomValue_second = valueBottom / bottomValue_second;

        int resultTop = (topValue_first * bottomValue_first ) + (topValue_second * bottomValue_second);

        Rational rationalResult = new Rational(resultTop, valueBottom);

        return rationalResult;
    }


    static Rational subract(Rational rational_1, Rational rational_2) {
        int topValue_first = rational_1.getNumerator();
        int topValue_second = rational_2.getNumerator();
        int bottomValue_first = rational_1.getDenominator();
        int bottomValue_second = rational_2.getDenominator();

        //wspólny najmniejszy mianownik
        int valueBottom;
        if(bottomValue_first - bottomValue_second > 0) {
            valueBottom = bottomValue_first;

            do {
                valueBottom += bottomValue_first;
            }while (valueBottom % bottomValue_second != 0);

        } else {
            valueBottom = bottomValue_second;

            do {
                valueBottom += bottomValue_second;
            }while (valueBottom % bottomValue_first != 0);
        }

        bottomValue_first = valueBottom / bottomValue_first;
        bottomValue_second = valueBottom / bottomValue_second;

        int resultTop = (topValue_first * bottomValue_first ) - (topValue_second * bottomValue_second);

        Rational rationalResult = new Rational(resultTop, valueBottom);

        return rationalResult;
    }


    //mnozenie
    static Rational multiplication(Rational rational_1, Rational rational_2) {
        int topValue_first = rational_1.getNumerator();
        int topValue_second = rational_2.getNumerator();
        int bottomValue_first = rational_1.getDenominator();
        int bottomValue_second = rational_2.getDenominator();

      topValue_first *= topValue_second;
      bottomValue_first *= bottomValue_second;

      if(bottomValue_first % topValue_first == 0) {
          bottomValue_first = bottomValue_first / topValue_first;
          topValue_first = 1;
      } else if (topValue_first % bottomValue_first == 0) {
          topValue_first = topValue_first / bottomValue_first;
          bottomValue_first = 1;
      }

        Rational rationalResult = new Rational(topValue_first, bottomValue_first);

        return rationalResult;
    }

    static Rational divide(Rational rational_1, Rational rational_2) {
        //divide change by multiply
        int topValue_first = rational_1.getNumerator();
        int topValue_second = rational_2.getDenominator();
        int bottomValue_first = rational_1.getDenominator();
        int bottomValue_second = rational_2.getNumerator();

        topValue_first *= topValue_second;
        bottomValue_first *= bottomValue_second;

        if(bottomValue_first % topValue_first == 0) {
            bottomValue_first = bottomValue_first / topValue_first;
            topValue_first = 1;
        } else if (topValue_first % bottomValue_first == 0) {
            topValue_first = topValue_first / bottomValue_first;
            bottomValue_first = 1;
        }

        Rational rationalResult = new Rational(topValue_first, bottomValue_first);

        return rationalResult;
    }



    public String showToResult() {


        if(getNumerator() % getDenominator() == 0) {
            return "result -> " + (getNumerator() / getDenominator() );
        } else { // reszta

            return ( (numerator / denominator) == 0 ? " " : (numerator / denominator) + " i ") + (numerator%denominator) + " / " + denominator;


           // double result = (double) getNumerator() / getDenominator();
           // return String.format("result -> %.2f" , result);
        }
    }

    public String showToResultByDoubleValue() {

        if(getNumerator() % getDenominator() == 0) {
            return "result -> " + (getNumerator() / getDenominator() );
        } else { // reszta

            System.out.println("how many digits should be after the decimal point ? :\n0. exit\n else some number: ");
            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();
            sc.nextLine();

            switch (value) {
                case 0: {
                    break;
                }
                default: {
                    double result = (double) getNumerator() / getDenominator();
                    String str = String.valueOf(result);
                    char[] tabChar = str.toCharArray();
                    str = "";
                    if(value >= tabChar.length-1) {
                        System.out.println("too big number");
                    } else {

                        for(int j = 0; j < tabChar.length; j++) {
                            str += tabChar[j];
                            if(tabChar[j] == '.') {
                                for (int i = 0; i < value; i++) {
                                    str += tabChar[j+1+i];
                                }
                                break;
                            }
                        }

                        return "result -> " + str;
                    }
                    break;
                }
            }

             double result = (double) getNumerator() / getDenominator();
             return String.format("result -> %.2f" , result);
        }
    }


}
