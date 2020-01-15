package chapter_8.exercise.exercise_8_7_add_seconds_minutes_hours;

public class Time2 {
   private int hour; // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   public Time2(Time2 t4) {
      this.hour = t4.hour;
      this.minute = t4.minute;
      this.second = t4.second;
   }
   public int getHour() {
      return hour;
   }
   public int getMinute() {
      return minute;
   }
   public void setMinute(int minute) {
      this.minute = minute;
   }

   public Time2() {
      this.second = 0;
      this.minute = 0;
      this.hour = 0;
   }


   public Time2(int second) {

      checkTimeAndSet(second);

   }


   //Time2 constructor: passing hours and minutes, seconds set to 0 by default.
   public Time2(int hour, int minute) {
      this((3600 * hour) + (minute * 60) );
   }

   public Time2(int hour, int minute, int second) {
      this((3600 * hour) + (minute * 60) + second);
   }


   public void setHour(int hour) {
      this.hour = hour;
   }
   public void setSecond(int second) {
      this.second = second;
   }

   public int getSecond() {
      return second;}

   //Converts to universal format (HH: MM: SS).
   public String toUniversalString() {
      return String.format(
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   }

   // Converts to text in 12-hour format (H: MM: SS AM or PM).
   public String toString() {
      return String.format("%d:%02d:%02d %s", 
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   }

   //adds 1 second
   public void tick() {
      int result = (3600 * this.hour) + (this.minute * 60) + this.second;
      checkTimeAndSet(result + 1); // 1 second
   }

   //adds 1 minute
   public void incrementMinute() {
      int result = (3600 * this.hour) + (this.minute * 60) + this.second;
      checkTimeAndSet(result + 60); // 1 minute
   }


   //adds 1 hour
   public void incrementHour() {
      int result = (3600 * this.hour) + (this.minute * 60) + this.second;
      checkTimeAndSet(result + 3600); // 1 hour
   }
   private void checkTimeAndSet(int second) {
      //3600 second -> hour, 60 second -> minute
      if ( (second / 3600 >= 1) && (second / 3600 < 24) ) { //hour 1 - 23
         this.hour = second / 3600;
         second = second - (hour * 3600);
         if (second / 60 >= 1) {
            this.minute = second / 60;
            this.second = second - (minute * 60);

         }
      } else {

         if(second / 3600 == 24) {
            second -= (3600 * 24);
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
}