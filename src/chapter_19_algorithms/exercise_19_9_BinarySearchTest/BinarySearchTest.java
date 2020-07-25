package rozdzial_19.exercise_github.exercise_19_9_BinarySearchTest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * using recursive binary search to find an element of an array
 *
 * sample operation:
 *
 * [14, 16, 18, 19, 34, 36, 40, 52, 61, 65, 72, 75, 82, 85, 86]
 *
 * Enter an integer (-1 to quit): 52
 * 52 found in position 7
 *
 *
 * Process finished with exit code 0
 *
 * ///////////////////////////////////////
 *
 *[9, 15, 34, 35, 41, 43, 58, 61, 63, 90, 92, 93, 94, 98, 98]
 *
 * Enter an integer (-1 to quit): error
 * wrong value given by user !!!
 * java.util.InputMismatchException
 * java.util.InputMismatchException
 * 	at java.util.Scanner.throwFor(Scanner.java:864)
 * 	at java.util.Scanner.next(Scanner.java:1485)
 * 	at java.util.Scanner.nextInt(Scanner.java:2117)
 * 	at java.util.Scanner.nextInt(Scanner.java:2076)
 * 	at rozdzial_19.exercise.exercise_19_9.BinarySearchTest.start(BinarySearchTest.java:54)
 * 	at rozdzial_19.exercise.exercise_19_9.BinarySearchTest.main(BinarySearchTest.java:41)
 *
 * Process finished with exit code 0
 *
 *
 */
public class BinarySearchTest {

   private int[] data;

   public int[] getData() {
      return data;
   }

   public void setData(int[] data) {
      this.data = data;
   }

   public static void main(String[] args) {

      new BinarySearchTest().start();
   }

   private void start() {
      Scanner input = new Scanner(System.in);
      SecureRandom generator = new SecureRandom();

      setData( generator.ints(15, 1, 101).sorted().toArray() ); // creates a 15-element array with a range from 1 to 100 and sorts
      System.out.printf("%s%n%n", Arrays.toString( getData() )); // show array

      System.out.print("Enter an integer (-1 to quit): ");

      try {
         int searchKey = input.nextInt();

         int location = recursiveBinarySearch(searchKey, 0, getData().length - 1);

         if (location == -1) {
            System.out.printf("%d no found%n%n", searchKey);
         } else {
            System.out.printf("%d found in position %d%n%n",
                    searchKey, location);
         }
      } catch (InputMismatchException e) {
         System.out.println("wrong value given by user !!!\n" + e);
         e.printStackTrace();
      }

   }

   /**
    * recursive binary search
    * @param searchKey
    * @param startIndex
    * @param endIndex
    * @return index number of the value searched by the user or -1 if no found
    */
   private int recursiveBinarySearch(int searchKey, int startIndex, int endIndex) {
      int middleIndex;
      while (startIndex < getData().length && endIndex > -1) {
         middleIndex =  (endIndex + startIndex) / 2 ;

         if (getData()[middleIndex] == searchKey) {
            return middleIndex;

         } else if (getData()[middleIndex] > searchKey) { //deletes right half
            endIndex = middleIndex - 1;

         } else { //deletes left half
            startIndex = middleIndex + 1;

         }
         recursiveBinarySearch(searchKey, startIndex, endIndex);
      }
      return -1;
   }
} 