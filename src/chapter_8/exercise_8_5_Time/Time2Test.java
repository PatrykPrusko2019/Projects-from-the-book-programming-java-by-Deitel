package chapter_8.exercise_8_5_Time;


public class Time2Test {
   public static void main(String[] args) {
      Time2 t1 = new Time2(); // 00:00:00
      Time2 t2 = new Time2(8900); // 02:00:00
      Time2 t3 = new Time2(21, 34); // 21:34:00
      Time2 t4 = new Time2(12, 25, 42); // 12:25:42
      Time2 t5 = new Time2(t4); // 12:25:42

      System.out.println("Created with:");
      displayTime("t1: all default arguments", t1);
      displayTime("t2: the time is given default minutes and seconds", t2);
      displayTime("t3: hour and minutes are given; default seconds", t3);
      displayTime("t4: hour, minutes and seconds are given", t4);
      displayTime("t5: the t4 object of Time2 class was indicated", t5);


      try {
         Time2 t6 = new Time2(27, 74, 99); // wrong value
      } 
      catch (IllegalArgumentException e) {
         System.out.printf("%nException during initialization t6: %s%n",
            e.getMessage());
      } 
   } 


   private static void displayTime(String header, Time2 t) {
      System.out.printf("%s%n   %s%n   %s%n",
         header, t.toUniversalString(), t.toString());
   } 
} 
