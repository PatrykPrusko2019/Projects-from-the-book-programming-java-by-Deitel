package rozdzial_19.exercise_github.exercise_19_8_recursiveLinearSearch;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 using recursive linear search finds where the given number by the user is in the array, its index


 sample operation:


 [65, 63, 77, 66, 62, 45, 54, 86, 68, 61]

 Enter an integer (-1 to finish): 86
 86 found in position 7


 Process finished with exit code 0


 ///////////////////////////////////////////////////////////


 [90, 43, 16, 89, 76, 93, 97, 17, 60, 73]

 Enter an integer (-1 to finish): asd
 bad type value, no integer !!!, java.util.InputMismatchException
 java.util.InputMismatchException
 at java.util.Scanner.throwFor(Scanner.java:864)
 at java.util.Scanner.next(Scanner.java:1485)
 at java.util.Scanner.nextInt(Scanner.java:2117)
 at java.util.Scanner.nextInt(Scanner.java:2076)
 at rozdzial_19.exercise.exercise_19_8_recursiveLinearSearch.LinearSearchTest.start(LinearSearchTest.java:45)
 at rozdzial_19.exercise.exercise_19_8_recursiveLinearSearch.LinearSearchTest.main(LinearSearchTest.java:29)

 Process finished with exit code 0

 */
public class LinearSearchTest {

   private int[] data;

   public int recursiveLinearSearch(int searchKey, int startKey) {

      if(startKey < data.length) {
         if(searchKey == data[startKey]) {
            return startKey; // found
         }
      } else {
         return -1; // no found
      }
     return recursiveLinearSearch(searchKey, startKey+1);
   }

   public static void main(String[] args) {
      new LinearSearchTest().start();
   }

   private void start() {
      Scanner input = new Scanner(System.in);
      SecureRandom generator = new SecureRandom();

      data = generator.ints(10, 10, 100).toArray(); // Create an array -> 10 items, range 10 to 99

      System.out.printf("%s%n%n", Arrays.toString(data));

      // Pobranie danych od użytkownika
      System.out.print("Enter an integer (-1 to finish): ");

      try {

         int searchInt = input.nextInt();
         int indexNumber = recursiveLinearSearch(searchInt, 0); // Performing a search

         if (indexNumber == -1) { // no found
            System.out.printf("%d no found%n%n", searchInt);
         } else { // found
            System.out.printf("%d found in position %d%n%n",
                    searchInt, indexNumber);
         }
      } catch (InputMismatchException e) {
         System.out.println("bad type value, no integer !!!" + ", " + e);
         e.printStackTrace();
      }
   }
} 
