package chapter_3.exercise_3_15_Retrieving_and_displaying;
// Klasa Account ze zmienną instancji balance typu double
// i metodą deposit przyjmującą wartość i dokonującą walidacji

public class Account {
   private String name; // Zmienna instancji
   private double balance; // Zmienna instancji

   // Konstruktor Account, który otrzymuje dwa parametry
   public Account(String name, double balance) {
      this.name = name; // Przypisanie parametru name do zmiennej instancji name

      // Sprawdzenie, czy stan konta jest większy od 0.0; jeśli nie,
      // zastosuj wartość początkową równą 0.0
      if (balance > 0.0) { // Jeśli stan konta jest poprawny,
         this.balance = balance; // przypisz go do zmiennej instancji balance
      }
   }

   // Metoda, która deponuje (dodaje) poprawną kwotę do aktualnego salda
   public void deposit(double depositAmount) {      
      if (depositAmount > 0.0) { // Jeśli depositAmount jest poprawne,
         balance = balance + depositAmount; // dodaj go do aktualnego salda
      }
   }

   // Metoda zwraca zawartość balance z obiektu
   public double getBalance() {
      return balance; 
   } 

   // Metoda ustawiająca name w obiekcie
   public void setName(String name) {
      this.name = name; 
   } 

   // Metoda pobierająca name w obiekcie
   public String getName() {
      return name; 
   }
}
