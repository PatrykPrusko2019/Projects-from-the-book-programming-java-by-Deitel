package chapter_4.exercise_4_19_calculateMonthlyPayment;
//sprzedawca
public class Salesman {

    private double payment;
    private double product;

    public Salesman() {
        this.payment = 2000.00; //wyplata
        this.product = 0.0;
    }


    public double getPayment() {
        return payment;
    }

    public double getProduct() {
        return product;
    }

    //dodanie kwoty produktu
    public void addProductAmount (double product) {
        this.product += product;
    }

    public double calculateMonthlyPayment() {

        return payment + (product * (9.0 / 100.0));
    }


}
