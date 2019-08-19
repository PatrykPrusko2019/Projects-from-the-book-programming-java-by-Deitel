package chapter_5;
//product of odd numbers
public class Zad_5_12_product_of_odd_numbers {
    public static void main(String[] args) {

        int result = 1;
        for(int i = 1; i <= 15; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
                result *= i;
            }
        }

        System.out.println(result);

    }
}
