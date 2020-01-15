package chapter_8.exercise.exercise_8_12_date_and_time;

/**
 * dziala do aktualnej daty i do godziny 23:59:59 godz. -> np dzisiaj jest 6.10.2019 godz jakas tam -> dziala do dzisiaj data ,
 * a czas caly czas zmienia sie do przodu
 */
public class Test {
    public static void main(String[] args) {

        DateAndTime dateAndTime = new DateAndTime(20,11, 2017, 12,53, 12 );

        System.out.println( dateAndTime.toString() );


        dateAndTime.nextMonth();

        System.out.println("\n\n next month -> " + dateAndTime.toString() );

        dateAndTime.incrementMinute();
        dateAndTime.incrementMinute();

        System.out.println("\n\n 2 minute -> " + dateAndTime.toString() );

        for(int i = 0; i < 43; i++) {
            dateAndTime.tick();
        }
        System.out.println("\n\n 43 seconds -> " + dateAndTime.toString() + "\n\n\n\n" );


        DateAndTime dateAndTime2 = new DateAndTime(20,11, 2017, 23,59, 59 );

        System.out.println("\n\n" +  dateAndTime2.toUniversalString());

        dateAndTime2.tick();

        System.out.println("\n\n 1 second -> " + dateAndTime2.toUniversalString());




        ///////////////////////////////

        DateAndTime dateAndTime3 = new DateAndTime(20,11, 2017, 23,59, 59 );

        System.out.println("\n\n" +  dateAndTime3.toUniversalString());

        dateAndTime3.incrementMinute();

        System.out.println("\n\n 1 minute -> " + dateAndTime3.toUniversalString());


        dateAndTime3.tick();
        dateAndTime3.tick();
        dateAndTime3.tick();
        dateAndTime3.tick();
        System.out.println("\n\n 4 second -> " + dateAndTime3.toUniversalString());

        dateAndTime3.incrementMinute();
        dateAndTime3.incrementMinute();
        dateAndTime3.incrementMinute();
        System.out.println("\n\n 3 minutes -> " + dateAndTime3.toUniversalString() + "\n\n");


        for(int i = 0; i < 24; i++) {
            dateAndTime3.incrementHour();
            System.out.println((i+1) + " hour -> " + dateAndTime3.toUniversalString());
        }

        System.out.println("\n\nactual date and time -> " + dateAndTime3.toUniversalString());


        dateAndTime3.nextDay();
        System.out.println("\n\nnext day -> " + dateAndTime3.toUniversalString());

        dateAndTime3.nextMonth();
        System.out.println("\n\nnext month -> " + dateAndTime3.toUniversalString());

        dateAndTime3.nextYear();
        System.out.println("\n\nnext year -> " + dateAndTime3.toUniversalString());


        dateAndTime3.nextMonth();
        System.out.println("\n\nnext month -> " + dateAndTime3.toUniversalString());

        dateAndTime3.nextMonth();
        System.out.println("\n\nnext month -> " + dateAndTime3.toUniversalString());

        dateAndTime3.nextYear();
        System.out.println("\n\nnext year -> " + dateAndTime3.toUniversalString());

        for(int i = 0; i < 23; i++) {
           dateAndTime3.incrementHour();
            System.out.println((i+1) + " " + dateAndTime3.toUniversalString());
        }

        System.out.println("\n\nnext day -> " + dateAndTime3.toUniversalString());


        for(int i = 0; i < 57; i++) {
            dateAndTime3.incrementMinute();
            System.out.println((i+1) + " " + dateAndTime3.toUniversalString());
        }

        System.out.println("\n\nnext day -> " + dateAndTime3.toUniversalString());




        /*
        System.out.println( dateAndTime.toString() );
        System.out.println( dateAndTime.toUniversalString() );

        dateAndTime.incrementHour();

        System.out.println("\n\n+ 1 hour -> " + dateAndTime.toString() );
        System.out.println("\n\n+ 1 hour -> " + dateAndTime.toUniversalString() );


        //+ minute
        dateAndTime.incrementMinute();

        System.out.println("\n\n+ 1 minute -> " + dateAndTime.toString() );
        System.out.println("\n\n+ 1 minute -> " + dateAndTime.toUniversalString() );


        dateAndTime.incrementMinute();

        System.out.println("\n\n+ 1 minute -> " + dateAndTime.toString() );
        System.out.println("\n\n+ 1 minute -> " + dateAndTime.toUniversalString() );


        System.out.println("\n\n");
        for(int i = 0; i < 60; i++) {
            dateAndTime.tick();

            System.out.println( (i+1) + " second -> " + dateAndTime.toString());

        }

        DateAndTime dateAndTime2 = new DateAndTime(6, 1,2019, 23, 59, 59 );


        System.out.println( dateAndTime2.toString() );

        dateAndTime2.tick();
        System.out.println(dateAndTime2.toString());
        */

    }
}
