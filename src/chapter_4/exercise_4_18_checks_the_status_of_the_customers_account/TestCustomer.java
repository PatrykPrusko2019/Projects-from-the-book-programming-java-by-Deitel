package chapter_4.exercise_4_18_checks_the_status_of_the_customers_account;

public class TestCustomer {

    public static void main(String[] args) {
        Customer customer_1 = new Customer(854554545, 1700, 500,
                700, 2000);
        customer_1.accountBalance(customer_1);

        Customer customer_2 = new Customer(87878, 300, 200,150
                , 300);
        customer_2.accountBalance(customer_2);
    }
}
