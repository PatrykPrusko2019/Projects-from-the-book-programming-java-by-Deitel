package chapter_3.exercise_3_14_validates_the_date;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {

        if(isGoodDate( day, month, year) ) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    //getter
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //setter
    public void setDay(int day) {
        if(isGoodDate( day, 1, 1) ) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if(isGoodDate(1, month, 1) ) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if(isGoodDate(1, 1, year) ) {
            this.year = year;
        }
    }

    public void displayDate() {
        System.out.printf("date -> day - month - year : %d - %d - %d %n", day, month, year );
    }

    public boolean isGoodDate(int day, int month, int year) {

        if( (day > 31 || day < 1) || (month > 12 || month < 1) || (year > 2050 || year < 1900) ) { //zakladamy 150 lat zakres -> range
            return false;
        }
        return true;


    }

}
