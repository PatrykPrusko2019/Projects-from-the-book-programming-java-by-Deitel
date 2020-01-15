package chapter_8.exercise.exercise_8_8_test_date;

import java.time.MonthDay;
import java.time.Year;

public class Date {
   private int month; // 1-12
   private int day; // 1-31 but taking into account the month
   private int year; //any year

   private int actualYear;
   private int actualDay;
   private int actualMonth;

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //days in a month

   //Constructor: confirm the correctness of the month and day based on the year.
   public Date(int day, int month, int year) {

      //checks year
      this.actualYear = Year.now().getValue();
      this.actualMonth = MonthDay.now().getMonth().getValue();
      this.actualDay = MonthDay.now().getDayOfMonth();


      //Check if the month is in the supported range.
      if (month <= 0 || month > 12) {
         throw new IllegalArgumentException(
            "month (" + month + ") must be in the range 1-12");
      }

      //Check if the day is in the range for the month.
      if (day <= 0 || 
         (day > daysPerMonth[month] && !(month == 2 && day == 29) )  ) {
         throw new IllegalArgumentException("day (" + day + 
            ") out of range for given month and year");
      }

      //Check the leap year if the month is February and day 29.
      if (month == 2 && day == 29 && !(year % 400 == 0 || 
           (year % 4 == 0 && year % 100 != 0))) {
         throw new IllegalArgumentException("day (" + day +
            ") out of range for given month and year");
      }

      if(checkTheDateActual(day, month, year)) {
         this.month = month;
         this.day = day;
         this.year = year;
      } else {
         throw new IllegalArgumentException("wrong date !!!");
      }




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
      return String.format("%d/%d/%d", day, month, year);
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

} 
