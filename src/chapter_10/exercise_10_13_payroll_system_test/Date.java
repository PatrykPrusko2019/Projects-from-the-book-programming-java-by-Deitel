package chapter_10.exercise_10_13_payroll_system_test;

public class Date {
   private int month; // 1-12
   private int day; // 1-31
   private int year;

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   

   public Date(int month, int day, int year) {

      if (month <= 0 || month > 12) {
         throw new IllegalArgumentException(
            "month (" + month + ") must be in range 1-12");
      }


      if (day <= 0 || 
         (day > daysPerMonth[month] && !(month == 2 && day == 29) )  ) {
         throw new IllegalArgumentException("day (" + day + 
            ") out of range for given month and year");
      }

      if (month == 2 && day == 29 && !(year % 400 == 0 || 
           (year % 4 == 0 && year % 100 != 0))) {
         throw new IllegalArgumentException("day (" + day +
            ") out of range for given month and year");
      }
   
      this.month = month;
      this.day = day;
      this.year = year;

      System.out.printf("The construction of a Date object for a date %s%n", this);
   }


   public int getMonth() {
      return month;
   }
   public int getDay() {
      return day;
   }
   public int getYear() {
      return year;
   }

   public String toString() {
      return String.format("%d/%d/%d", day, month, year);
   } 
} 
