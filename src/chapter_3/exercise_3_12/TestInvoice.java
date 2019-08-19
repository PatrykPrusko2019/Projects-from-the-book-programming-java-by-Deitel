package chapter_3.exercise_3_12;

public class TestInvoice {

    public static void main(String[] args) {

        Invoice faktura_1 = new Invoice("1", "TV samsung", 3, 2000 );


        Invoice faktura_2 = new Invoice("2", "TV Sony", 5, -1 );


        System.out.printf("result -> %.2f %s %s %d %.2f %n" , faktura_1.getInvoiceAmount(), faktura_1.getNumberProduct(), faktura_1.getProductDescription(),
                 faktura_1.getNumber_purchasedItems(), faktura_1.getPricePerItem() );



        System.out.printf("result -> %.2f %s %s %d %.2f" , faktura_2.getInvoiceAmount(), faktura_2.getNumberProduct(), faktura_2.getProductDescription(),
                faktura_2.getNumber_purchasedItems(), faktura_2.getPricePerItem() );

    }
}
