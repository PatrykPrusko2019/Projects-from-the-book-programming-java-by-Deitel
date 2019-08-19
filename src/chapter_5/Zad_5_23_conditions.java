package chapter_5;

/**
 * conditions
 */
public class Zad_5_23_conditions {
    public static void main(String[] args) {
        /**
         * !(x < 5) && !(y >=7)
         *
         * !(a == b) || !(g != 5)
         *
         * !( (x <= 8) && (y > 4)  )
         *
         * !( (i > 4 ) || (j <= 6) )
         */


        int y , a , b , g , i , j , x = 2;
         x = y = a = b = g = i = j = 2;


         //false true
         if( !(x < 5) && !(y >=7) ) {
             System.out.println("warunek first -> " + true);

         } else {
             System.out.println("warunek first -> " + false);
         }


         //false false
        if( !(a == b) || !(g != 5) ) {
            System.out.println("warunek second -> " + true);

        } else {
            System.out.println("warunek second -> " + false);
        }

        //true false
        if( ! ( (x <= 8) && (y > 4)  ) ) {
            System.out.println("warunek third -> " + true);

        } else {
            System.out.println("warunek third -> " + false);
        }

            //false true
        if( !( (i > 4 ) || (j <= 6) ) ) {
            System.out.println("warunek forth -> " + true);

        } else {
            System.out.println("warunek forth -> " + false);
        }

        System.out.println();


        // rownowazne

        //false
        if( ! ( ( x < 5) || ( y >=7) ) ) { // !(x < 5) && !(y >= 7) -> false
            System.out.println("warunek first -> " + true);

        } else {
            System.out.println("warunek first -> " + false);
        }


        //false
        if( ! ( (a == b) && (g != 5) ) ) { //!(a == b) || !(g != 5) -> false
            System.out.println("warunek second -> " + true);

        } else {
            System.out.println("warunek second -> " + false);
        }

        // true
        if(   ! (x <= 8) || ! (y > 4)  ) { //!( (x <= 8) && (y > 4)  ) -> true
            System.out.println("warunek third -> " + true);

        } else {
            System.out.println("warunek third -> " + false);
        }

        // false
        if( ! (i > 4 ) && ! (j <= 6)  ) { //!( (i > 4 ) || (j <= 6) ) -> false
            System.out.println("warunek forth -> " + true);

        } else {
            System.out.println("warunek forth -> " + false);
        }
    }
}
