package chapter_8.exercise.exercise_8_8_test_date;

/**
 * Date Test, adds day, month, year
 */
public class TestDate {
    public static void main(String[] args) {

        Date date = new Date(3,11, 2016);

        System.out.println( date.toString() );

        date.nextDay();

        System.out.println("next day -> " + date.toString());

        date.nextMonth();

        System.out.println("next month -> " + date.toString());

        date.nextYear();
        System.out.println("next year -> " + date.toString()); //2017


        date.nextYear();
        System.out.println("next year -> " + date.toString()); //2018

        date.nextYear();
        System.out.println("next year -> " + date.toString()); // 2019

        date.nextYear();
        System.out.println("next year -> " + date.toString()); // 2020

        date.nextYear();
        System.out.println("next year -> " + date.toString()); //2020


        System.out.println("\n\n");

        Date date2 = new Date(31,12, 2013);

        System.out.println(date2.toString());

        date2.nextDay();

        System.out.println(date2.toString());

        date2.nextDay();

        System.out.println(date2.toString());

        System.out.println("\n\n");

        for(int i = 0; i < 30; i++) { //next month
            date2.nextDay();
            System.out.println(date2.toString());
        }


        Date date3 = new Date(4,5, 2020); //wrong date !!!
    }
}
