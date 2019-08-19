package chapter_4.exercise_4_26;

//shows even / odd number graphics
public class Mystery3 {
   public static void main(String[] args) {
      int row = 10;

      while (row >= 1) {
         int column = 1;

         while (column <= 10) {
            System.out.print(row % 2 == 1 ? "<" : ">"); //jesli nieparzyste -> "<" , parzyste -> ">"
            ++column;
         }

         --row;
         System.out.println();
      } 
   } 
}



