package chapter_8.exercise.exercise_8_7_add_seconds_minutes_hours;

/**
 * adds seconds, minutes, hours to a given time
 */
public class Test {
    public static void main(String[] args) {



        Time2 t = new Time2(14, 30, 12);

        System.out.println( t.toUniversalString() );

        //adds 1 second
        t.tick();

        System.out.println("adds 1 second -> " + t.toUniversalString());

        t.incrementMinute();

        System.out.println("adds 1 minute -> " + t.toUniversalString());

        t.incrementHour();

        System.out.println("adds 1 hour -> " + t.toUniversalString());



        Time2 t2 = new Time2(23,59,59);

        System.out.println(t2.toUniversalString());

        t2.tick();

        System.out.println(t2.toUniversalString());

        t2.tick();

        System.out.println(t2.toUniversalString());


        t2.tick();

        System.out.println(t2.toUniversalString());


        ////////////////

        Time2 t3 = new Time2(23,0,0);

        System.out.println(t3.toUniversalString());

        t3.incrementHour();

        System.out.println("adds 1 hour -> " + t3.toUniversalString());

        t3.incrementMinute();

        System.out.println("adds 1 minute -> " + t3.toUniversalString());


    }
}
