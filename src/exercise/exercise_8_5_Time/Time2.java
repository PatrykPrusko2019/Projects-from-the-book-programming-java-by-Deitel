package chapter_8.exercise.exercise_8_5_Time;


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
         //3600 secund -> godzina, 60 secund -> minuta
         if (second / 3600 >= 1) { //hour
            this.hour = second / 3600;
            second = second - (hour * 3600);
            if (second / 60 >= 1) {
               this.minute = second / 60;
               this.second = second - (minute * 60);

            }
         } else {
            if (second / 60 >= 1) {
               this.minute = second / 60;
               this.second = second - (minute * 60);
               this.hour = 0;
            } else {
               this.second = second;
               this.hour = 0;
               this.minute = 0;
            }
         }
   } 

   public Time2(int hour, int minute) {
      this((3600 * hour) + (minute * 60) );
   }

   public Time2(int hour, int minute, int second) {
      this((3600 * hour) + (minute * 60) + second);
   }


   public int getSecond() {
      return second;}

   public String toUniversalString() {
      return String.format(
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   }


   public String toString() {
      return String.format("%d:%02d:%02d %s", 
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   } 
}