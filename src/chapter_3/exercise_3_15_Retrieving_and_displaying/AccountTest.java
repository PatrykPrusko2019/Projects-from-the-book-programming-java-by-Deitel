package chapter_3.exercise_3_15_Retrieving_and_displaying;
// Pobieranie i wyświetlanie liczb zmiennoprzecinkowych z obiektów Account

import java.util.Scanner;

public class AccountTest {

   public static void main(String[] args) {

      Account account1 = new Account("Anna Nowak", 50.00);
      Account account2 = new Account("Jan Kowalski", -7.53);

      // Wyświetl stan konta każdego obiektu
      displayAccount(account1);
      displayAccount(account2);

      // Utwórz obiekt Scanner, aby pobrać wartości z konsoli
      Scanner input = new Scanner(System.in);

      System.out.print("Wpisz kwotę do wpłacenia na konto account1: "); // Zapytanie
      double depositAmount = input.nextDouble(); // Pobranie wartości od użytkownika
      System.out.printf("%nDodawanie %.2f do stanu konta account1%n%n", 
         depositAmount);
      account1.deposit(depositAmount); // Dodanie wartości do stanu account1

      // Wyświetlenie stanu kont
      displayAccount(account1);
      displayAccount(account2);

      System.out.print("Wpisz kwotę do wpłacenia na konto account2: "); // Zapytanie
      depositAmount = input.nextDouble(); // Pobranie wartości od użytkownika
      System.out.printf("%nDodawanie %.2f do stanu konta account2%n%n", 
         depositAmount);
      account2.deposit(depositAmount); // Dodanie wartości do stanu account2

      // Wyświetlenie stanu kont
      displayAccount(account1);
      displayAccount(account2);
   }

   public static void displayAccount(Account account) {
      System.out.printf("%s - stan konta: %.2f zł%n",
              account.getName(), account.getBalance());
   }
} 

