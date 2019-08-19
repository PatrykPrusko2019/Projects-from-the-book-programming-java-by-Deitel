package chapter_3.exercise_3_14_validates_the_date;

public class TestDate {
    public static void main(String[] args) {

        Date date = new Date(13,1,1987);

        date.displayDate();

        date.setMonth(0);

        date.displayDate();


        date.setYear(-1);

        date.displayDate();


        date.setDay(32);

        date.displayDate();

        Date date2 = new Date(0,-1,2051); //zakladamy zakres year 150 lat
    }
}
