package chapter_8.exercise_8_14_test_date;

public class Test {
    public static void main(String[] args) {

        Date date1 = new Date(31,1, 2019);

        System.out.println(date1.toString());


        Date date2 = new Date(29,"february", 1992);

        System.out.println(date2.toString());


        Date date3 = new Date(366, 2020);

        System.out.println(date3.toString());

    }
}
