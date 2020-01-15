package chapter_8.exercise.exercise_8_12_date_and_time;

import java.time.MonthDay;
import java.time.Year;

public class DateAndTime {

    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    private int month; // 1-12
    private int day; // 1-31
    private int year; //

    private int actualYear;
    private int actualDay;
    private int actualMonth;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //Constructor: confirm the correctness of the month and day based on the year
    public DateAndTime(int day, int month, int year, int hour, int minute, int second) {

        //set new time
        int result = ((3600 * hour) + (minute * 60) + second);
        checkTimeAndSet(result);


        //checks year
        this.actualYear = Year.now().getValue();
        this.actualMonth = MonthDay.now().getMonth().getValue();
        this.actualDay = MonthDay.now().getDayOfMonth();


        //Check if the month is in the supported range
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                    "month (" + month + ") musi się znajdować w zakresie 1-12");
        }

        // Check if the day is in the range for the month
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29) )  ) {
            throw new IllegalArgumentException("day (" + day +
                    ") poza zakresem dla danego miesiąca i roku");
        }

        //Check the leap year if the month is February and day 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +
                    ") poza zakresem dla danego miesiąca i roku");
        }

        if(checkTheDateActual(day, month, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            throw new IllegalArgumentException("wrong date !!!");
        }

    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    private boolean checkTheDateActual(int day, int month, int year) {
        if(this.actualYear == year) { //by year

            if(this.actualMonth == month) { //by month

                if(this.actualDay >= day) { //by day
                    return true;
                } else {
                    return false;
                }
            } else if(this.actualMonth < month) {
                return false;
            } else {
                return true;
            }

        } else if(this.actualYear > year) {
            return true; //good date
        } else {
            return false;
        }

    }

    //checks date
    public boolean checkTheDay(int day) {
        int dayInMonth = daysPerMonth[this.month];

        if(this.month == this.actualMonth && this.year == this.actualYear) {

            if(this.actualDay >= day) {
                return true;
            }

        } else if(dayInMonth >= day) {
            return true;
        } else { // over day 32
            this.day = 1;
            if (checkTheMonth(this.month + 1) ) {
                this.month++;
                return false;
            }
        }
        return false;
    }


    public boolean checkTheMonth(int month) {

        if(this.year == this.actualYear) {
            if(month >= this.month && month <= this.actualDay) {
                return true;
            } else {
                return false;
            }
        } else if(month > 0 && month < 13) {
            return true;
        } else {
            this.month = 1; // because it exceeds 12
            if(checkTheYear(this.year + 1) ) {
                this.year++;
                return false;
            }
        }
        return false;
    }


    public boolean checkTheYear(int year) {

        if(year < this.actualYear) { // if year

            return true;

        } else if(year == this.actualYear){
            this.day = this.actualDay;
            this.month = this.actualMonth;
            return true;
        } else {
            System.out.println("wrong year ...");
            return false;
        }

    }

    //Returns a String object as day / month / year
    public String toString() {

        return String.format("Date: %d/%d/%d", day, month, year) + String.format("\nTime: %d:%02d:%02d %s",
                (( getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public String toUniversalString() {
        return String.format(
                String.format("Date: %d/%d/%d", day, month, year) +
                "\nTime: %02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public void nextDay() {
        int newDay = this.day + 1;
        if(checkTheDay(newDay)) {
            this.day++;
        }
    }

    public void nextMonth() {
        int newMonth = this.month + 1;
        if(checkTheMonth(newMonth)) {
            this.month++;
        }
    }

    public void nextYear() {
        int newYear = this.year + 1;
        if(checkTheYear(newYear)) {
            this.year++;
        }

    }


    public void checkTimeAndSet(int second) {
        //3600 secund -> godzina, 60 secund -> minuta
        if ((second / 3600 >= 1) && (second / 3600 < 24)) { //hour 1 - 23
            this.hour = second / 3600;
            second = second - (hour * 3600);
            if (second / 60 >= 1) {
                this.minute = second / 60;
                this.second = second - (minute * 60);

            }
        } else {

            if (second / 3600 == 24) {
                second -= (3600 * 24); // odejmujemy
            }

            if ((second / 60 >= 1) && (second / 60 < 60)) { //minute 1 - 59
                this.minute = second / 60;
                this.second = second - (minute * 60);
                this.hour = 0;
            } else {
                this.second = second;
                this.minute = 0;
                this.hour = 0;
            }

        }
    }

    /**adds 1 second*/
    public void tick() {
        int checkHour = this.hour;
        int result = (3600 * this.hour) + (this.minute * 60) + this.second;
        checkTimeAndSet(result + 1); // 1 second

        if(checkHour == 23 && this.hour == 0) {
            nextDay();
        }
    }

    //adds 1 minute
    public void incrementMinute() {
        int checkHour = this.hour;
        int result = (3600 * this.hour) + (this.minute * 60) + this.second;
        checkTimeAndSet(result + 60); // 1 minute
        if(this.hour != checkHour) {//czyli jak sie zwiekszy godzina wyzeruj minuty i sekundy
            setMinute(0);
        }

        if(checkHour == 23 && this.hour == 0) {
            nextDay();
        }
    }


    //adds 1 hour
    public void incrementHour() {

        if(this.hour + 1 == 24) {
            nextDay();
        }

        int result = (3600 * this.hour) + (this.minute * 60) + this.second;
        checkTimeAndSet(result + 3600); // 1 hour
    }

}
