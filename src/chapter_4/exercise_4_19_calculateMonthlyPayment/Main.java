package chapter_4.exercise_4_19_calculateMonthlyPayment;

/**
 * produkty:
 *
 * 1  239.99 zl
 * 2  1129.75 zl
 * 3  99.95 zl
 * 4  850.89 zl
 */

public class Main {

    public static void main(String[] args) {

        Salesman salesman = new Salesman();
        salesman.addProductAmount(239.99); //dodaje dany produkt
        salesman.addProductAmount(1129.75);
        salesman.addProductAmount(99.95);
        salesman.addProductAmount(850.89);

        double monthlyPayment = salesman.calculateMonthlyPayment();
        System.out.printf("wyplata %.2f zl miesieczna", monthlyPayment);


    }
}
