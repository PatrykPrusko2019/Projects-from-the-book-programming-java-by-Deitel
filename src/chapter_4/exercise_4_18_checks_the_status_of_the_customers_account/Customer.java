package chapter_4.exercise_4_18_checks_the_status_of_the_customers_account;

/**
 *
 checks the status of the customer's account
 */
public class Customer {
    private long accountNumber;
    private int accountBalancePerMonth; // stan konta poczatkowy
    private int amountOfPurchases; //kwota zakupow
    private int paymentAmount;//kwota wplat
    private int acceptableCreditLimit; //dopuszczalny limit kredytowy

    public Customer(long accountNumber, int accountBalancePerMonth, int amountOfPurchases, int paymentAmount, int acceptableCreditLimit) {
        this.accountNumber = accountNumber;
        this.accountBalancePerMonth = accountBalancePerMonth;
        this.amountOfPurchases = amountOfPurchases;
        this.paymentAmount = paymentAmount;
        this.acceptableCreditLimit = acceptableCreditLimit;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalancePerMonth() {
        return accountBalancePerMonth;
    }

    public int getAmountOfPurchases() {
        return amountOfPurchases;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public int getAcceptableCreditLimit() {
        return acceptableCreditLimit;
    }

    //oblicza nowy stan konta danego klienta
    public void accountBalance(Customer customer) {

        int result = customer.accountBalancePerMonth + amountOfPurchases - paymentAmount;
        if(acceptableCreditLimit - result < 0) {
            int temp = acceptableCreditLimit - result;
            temp *= (-1);//pozbycie sie minusa
            System.out.println("przekroczenie limitu kredytowego !!! na minusie jestes -> " + (temp) );
        } else {
            int positiveCredit = acceptableCreditLimit - result;
            System.out.println("wszystko ok, do wykorzystania masz kredyt -> " + positiveCredit);
        }
    }
}
