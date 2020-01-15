package chapter_8.exercise.exercise_8_6_SavingAccount;

public class SavingAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingAccount(double savingBalance) {
        this.savingsBalance = savingBalance;
    }
    public static double getAnnualOnterestRate() {
        return annualInterestRate;
    }

    public static void modifyOnterestRate(double annualOnterestRate) {
        annualInterestRate = annualOnterestRate;
    }
    public double getSavingBalance() {
        return this.savingsBalance;
    }
    public void setSavingBalance(double savingBalance) {
        this.savingsBalance = savingBalance;
    }

    //calculates the monthly profit
    public void calculateMonthlyInterest(double savingBalance) {
        double result = (savingBalance * annualInterestRate) / 12;
        setSavingBalance(getSavingBalance() + result);
    }

    //calculate year
    public void calculateYearlyInterest(double savingBalance) {
        double result = savingBalance * annualInterestRate;
        setSavingBalance(getSavingBalance() + result);
    }


}
