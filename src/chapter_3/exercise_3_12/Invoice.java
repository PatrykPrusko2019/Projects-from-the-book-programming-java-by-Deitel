package chapter_3.exercise_3_12;

//invoice -> faktura
public class Invoice {

    //pola
    private String numberProduct; // numer
    private String productDescription; //opis produktu
    private int number_purchasedItems; //liczba zakupionych sztuk
    private double pricePerItem; //cena za sztuke

    //constructor
    public Invoice(String numberProduct, String productDescription, int number_purchasedItems, double pricePerItem) {

        this.numberProduct = numberProduct;
        this.productDescription = productDescription;
        this.number_purchasedItems = number_purchasedItems;
        this.pricePerItem = pricePerItem;
    }

    //getter
    public String getNumberProduct() {
        return numberProduct;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getNumber_purchasedItems() {
        return number_purchasedItems;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    //return calculates the amount on the invoice
    public double getInvoiceAmount() {

        if(number_purchasedItems < 0) {
            number_purchasedItems = 0;
        } else if(pricePerItem < 0) {
            pricePerItem = 0.0;
        }
        return number_purchasedItems * pricePerItem;
    }

    //setter
    public void setNumberProduct(String numberProduct) {
        this.numberProduct = numberProduct;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setNumber_purchasedItems(int number_purchasedItems) {
        this.number_purchasedItems = number_purchasedItems;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }










}
