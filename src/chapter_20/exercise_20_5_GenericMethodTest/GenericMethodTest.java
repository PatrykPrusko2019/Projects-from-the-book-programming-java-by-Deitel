package rozdzial_20.exercise.exerciseToGit.chapter_20.exercise_20_5_GenericMethodTest;


/**
 * testing the overloaded generalized printArray method. The use of your error exception.
 *
 *  program operation:
 *
 * use of the generalized method:
 *
 * The array integerArray contains: 1 2 3 4 5
 * The Array doubleArray contains: 1.1 2.2 3.3 4.4 5.5 6.6 7.7
 * The Array characterArray contains: W I T A J
 *
 *
 * use of the overloaded generalized print Array:
 *
 * The array integerArray contains: rozdzial_20.exercise.exercise_20_5.InvalidIndexException: Invalid Index Exception !!!!!
 * rozdzial_20.exercise.exercise_20_5.GenericMethodTest.start(GenericMethodTest.java:38)
 * number of items displayed = 0
 * The Array doubleArray contains: 1.1  2.2  3.3  4.4  5.5  number of items displayed = 5
 * The Array characterArray contains: T  number of items displayed = 1
 * The array integerArray contains: rozdzial_20.exercise.exercise_20_5.InvalidIndexException: Invalid Index Exception !!!!!
 * rozdzial_20.exercise.exercise_20_5.GenericMethodTest.start(GenericMethodTest.java:45)
 * number of items displayed = 0
 * The Array doubleArray contains: 1.1  2.2  3.3  4.4  5.5  number of items displayed = 5
 * The Array characterArray contains: rozdzial_20.exercise.exercise_20_5.InvalidIndexException: Invalid Index Exception !!!!!
 * rozdzial_20.exercise.exercise_20_5.GenericMethodTest.start(GenericMethodTest.java:49)
 * number of items displayed = 0
 *
 * Process finished with exit code 0
 */
public class GenericMethodTest {
   public static void main(String[] args) {

      new GenericMethodTest().start();

   }

   private void start() {

      Integer[] integerArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
      Character[] characterArray = {'W', 'I', 'T', 'A', 'J'};

      System.out.println("use of the generalized method: \n");

      System.out.printf("The array integerArray contains: ");
      printArray(integerArray);
      System.out.printf("The Array doubleArray contains: ");
      printArray(doubleArray);
      System.out.printf("The Array characterArray contains: ");
      printArray(characterArray);

      /////////////////

      System.out.println("\n\nuse of the overloaded generalized print Array: \n");

      System.out.printf("The array integerArray contains: ");
      System.out.println("number of items displayed = " +  printArray(integerArray, -1, 3) ); // error -> -1
      System.out.printf("The Array doubleArray contains: ");
      System.out.println("number of items displayed = " +  printArray(doubleArray, 0, doubleArray.length-3) );
      System.out.printf("The Array characterArray contains: ");
      System.out.println("number of items displayed = " +  printArray(characterArray, 2, 2) );

      System.out.printf("The array integerArray contains: ");
      System.out.println("number of items displayed = " + printArray(integerArray, -1, 3) ); // error -> -1
      System.out.printf("The Array doubleArray contains: ");
      System.out.println("number of items displayed = " +  printArray(doubleArray, 0, doubleArray.length-3) );
      System.out.printf("The Array characterArray contains: ");
      System.out.println("number of items displayed = " +  printArray(characterArray, 2, 5) ); //error -> 5





   }

   /**
    * overloaded generalized print Array
    * @param inputArray
    * @param <T>
    */
   public <T> int printArray(T[] inputArray, int lowSubscript, int highSubscript) {
      int count = 0;
      try {
            if( (lowSubscript > -1 && lowSubscript <= highSubscript && lowSubscript < inputArray.length) &&
                    (highSubscript >= lowSubscript && highSubscript < inputArray.length) ) {

                  for(; lowSubscript < highSubscript+1; lowSubscript++, count++) {
                     System.out.printf("%s  " , inputArray[lowSubscript]);
                  }

            } else {
               throw new InvalidIndexException(); // creates an exception when an index overrun occurs
            }
         } catch (InvalidIndexException e) {
         System.out.println(e.toString() + "\n" + e.getStackTrace()[1]);
         }
         return count; // the number of occurrences of the elements
   }


   //The generalized printArray method
   public <T> void printArray(T[] inputArray) {

      for (T element : inputArray) {       
         System.out.printf("%s ", element);
      }                                    

      System.out.println();
   } 
}