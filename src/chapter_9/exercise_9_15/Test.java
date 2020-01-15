package chapter_9.exercise_9_15;

/**
 *tests employees' earnings
 */
public class Test {
    public static void main(String[] args) {

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Patryk", "Prusko", "123213", 68, 30);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Pati", "Prusko", "123124", 50000);
        PieceWorker pieceWorker = new PieceWorker("Junior", "Miko", "1232132222", 50);


        System.out.println( hourlyEmployee.toString() );
        System.out.println();
        System.out.println( salariedEmployee.toString());
        System.out.println();
        System.out.println( pieceWorker.toString());
    }
}
