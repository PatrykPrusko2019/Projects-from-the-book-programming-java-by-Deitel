package chapter_9.exercise_9_10;

public class PieceWorker extends Employee{

    public PieceWorker() {
        super("Pati", "White", 1001);
    }
    @Override
    public String toString() {
        System.out.println(super.toString() );
        return "the PieceSorker class toString method";
    }
}
