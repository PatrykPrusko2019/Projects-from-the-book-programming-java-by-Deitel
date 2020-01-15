package chapter_8.exercise_8_14_test_date;

public class Date {
    private int day;
    private int month;
    private int year;
    private String strMonth;
    private int numberOfDayOfYear;

    public Date(int day, int month, int year) {

        if(year < 1) {
            throw new IllegalArgumentException("wrong year");
        }
        //we check if the year is leap
        if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { // is a leap year

            if( (month != 2) || (day != 29)) {
                throw new IllegalArgumentException("is leap year, but wrong day or month");
            }

        } else {

            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("wrong month, range 1 - 12");
            }
            int[] daysPerMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if ((day > daysPerMonth[month]) || (day < 1)) {
                throw new IllegalArgumentException("wrong day, range 1 - " + daysPerMonth[month]);
            }
        }

        this.day = day;
        this.month = month;
        this.year = year;


    }

    public Date(int day, String strMonth, int year) {

        String[] strTab = new String[]{"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};

        if(year < 1) {
            throw new IllegalArgumentException("wrong year");
        }

        if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

            if( (strMonth == strTab[1]) && (day != 29)) {
                throw new IllegalArgumentException("is leap year, but wrong day");
            }

        } else {
                String value = "";
            for(int i = 0; i < strTab.length; i++) {
                if(strTab[i] == strMonth) {
                    value = strTab[i];
                    break;
                }
            }

            if (value != strMonth) {
                throw new IllegalArgumentException("wrong month, range 1 - 12");
            }
            int[] daysPerMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if ((day > daysPerMonth[month]) || (day < 1)) {
                throw new IllegalArgumentException("wrong day, range 1 - " + daysPerMonth[month]);
            }
        }


        this.day = day;
        this.year = year;
        this.strMonth = strMonth;
    }

    public Date(int numberOfDayOfYear , int year) {

        if(year < 1) {
            throw new IllegalArgumentException("wrong year");
        }

        //we check if the year is leap
        if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { //jest przestepny
            if(numberOfDayOfYear < 1 || numberOfDayOfYear > 366) {
                throw new IllegalArgumentException("is leap year, but wrong number day of year ");
            }
        } else {

            if((numberOfDayOfYear < 1) || (numberOfDayOfYear > 365)) {
                throw  new IllegalArgumentException("wrong number day of year, range 1 - 365");
            }
        }

        this.year = year;
        this.numberOfDayOfYear = numberOfDayOfYear;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String getStrMonth() {
        return strMonth;
    }
    public int getNumberOfDayOfYear() {
        return numberOfDayOfYear;
    }
    @Override
    public String toString() {

        if( (getDay() > 0) && (getMonth() > 0) && (getYear() > 0)) {
            return getYear() + "-" + getMonth() + "-" + getDay();
        } else if((getDay() > 0) && (getYear() > 0) && (getStrMonth() != null)) {
            return getDay() + "-" + getStrMonth() + "-" + getYear();
        } else if ((getNumberOfDayOfYear() > 0) && (getYear() > 0)) {
            return String.format("%03d %4d", getNumberOfDayOfYear(), getYear());
        } else {
            return "Date is empty !!!!";
        }
    }
}
