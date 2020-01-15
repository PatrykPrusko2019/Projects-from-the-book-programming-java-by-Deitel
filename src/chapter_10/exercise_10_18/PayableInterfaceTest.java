package chapter_10.exercise_10_18;

/**
 * The Payable interface testing program enables the processing of Invoice and Employee objects in a polymorphic way
 */
public class PayableInterfaceTest {
   public static void main(String[] args) {

      Payable[] payableObjects = new Payable[] {
         new Invoice("01234", "siedzenie", 2, 375.00),
         new Invoice("56789", "opona", 4, 79.95),
              new HourlyCompensationModel("Patrick", "Prusko", "123-12", 37.35, 67),
      new SalariedCompensationModel("Pati", "Prusko", "123-33",3500),
      new ComissionCompensationModel("Andriev", "Sevcenko", "897-543-432", 478.9, 0.3),
      new BasePlusComissionCompensationModel("Anna", "Tchew", "988-833-22", 27.33, 0.4,700.87)
      };

      System.out.println(
         "Polymorphically processed Invoice and Employee objects:");

      for (Payable currentPayable : payableObjects) {

         System.out.printf("%n%s %npayment amount: %,.2f zł%n",
            currentPayable.toString(),
            currentPayable.getPaymentAmount()); 
      }

   }

}
