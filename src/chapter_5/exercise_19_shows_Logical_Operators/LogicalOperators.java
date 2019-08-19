package chapter_5.exercise_19_shows_Logical_Operators;// Rysunek 5.19. LogicalOperators.java
// shows Logical Operators

public class LogicalOperators {
   public static void main(String[] args) {
      // Tablica prawdy dla operatora && (warunkowe AND)
      System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
         "Warunkowe AND (&&)", "false && false", (false && false),
         "false && true", (false && true), 
         "true  && false", (true && false),
         "true  && true", (true && true));

      // Tablica prawdy dla operatora || (warunkowe OR)
      System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
         "Warunkowe OR (||)", "false || false", (false || false),
         "false || true", (false || true),
         "true  || false", (true || false),
         "true  || true", (true || true));

      // Tablica prawdy dla operatora & (logiczne AND)
      System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
         "Logiczne AND (&)", "false & false", (false & false),
         "false & true", (false & true),
         "true  & false", (true & false),
         "true  & true", (true & true));

      // Tablica prawdy dla operatora | (logiczne OR)
      System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
         "Logiczne OR (|)",
         "false | false", (false | false),
         "false | true", (false | true),
         "true  | false", (true | false),
         "true  | true", (true | true));

      // Tablica prawdy dla operatora ^ (logiczne XOR)
      System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
         "Logiczne XOR (^)",
         "false ^ false", (false ^ false),
         "false ^ true", (false ^ true),
         "true  ^ false", (true ^ false),
         "true  ^ true", (true ^ true));

      // Tablica prawdy dla operatora ! (logiczna negacja)
      System.out.printf("%s%n%s: %b%n%s: %b%n", "Logiczne NOT (!)",
         "!false", (!false), "!true", (!true));
   } 
} 
