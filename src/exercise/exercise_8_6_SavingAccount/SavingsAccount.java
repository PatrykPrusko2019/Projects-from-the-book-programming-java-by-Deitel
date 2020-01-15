package chapter_8.exercise.exercise_8_6_SavingAccount;

public class SavingsAccount {
    public static void main(String[] args) {

        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);

        SavingAccount.modifyOnterestRate(0.04); // 4 %

        saver1.calculateYearlyInterest(saver1.getSavingBalance());
        saver2.calculateYearlyInterest(saver2.getSavingBalance());

        System.out.printf("4 procent from 2000 a year -> %.2f", saver1.getSavingBalance());
        System.out.printf("\n4 procent from 3000 a year -> %.2f\n", saver2.getSavingBalance());


        SavingAccount.modifyOnterestRate(0.05); // 5 %

        saver1.setSavingBalance(2000.00);
        saver2.setSavingBalance(3000.00);

        saver1.calculateYearlyInterest(saver1.getSavingBalance());
        saver2.calculateYearlyInterest(saver2.getSavingBalance());

        System.out.printf("\n5 procent from 2000 a year -> %.2f" , saver1.getSavingBalance());
        System.out.printf("\n5 procent from 2000 a year -> %.2f" , saver2.getSavingBalance());


    }
}
