package chapter_9.exercise_9_15;

public class PieceWorker extends Employee {

    private int numberOfPiecesProduced;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int iloscWyprodukowaychSztuk) {
        super(firstName, lastName, socialSecurityNumber);

        if(iloscWyprodukowaychSztuk < 0) {
            System.out.println("wrong value, range 0 - something");
            this.numberOfPiecesProduced = 0;
        } else {
            this.numberOfPiecesProduced = iloscWyprodukowaychSztuk;
        }
    }

    public int getNumberOfPiecesProduced() {
        return numberOfPiecesProduced;
    }

    public void setNumberOfPiecesProduced(int numberOfPiecesProduced) {
        if(numberOfPiecesProduced < 0) {
            System.out.println("wrong value, range 0 - something");
            this.numberOfPiecesProduced = 0;
        } else {
            this.numberOfPiecesProduced = numberOfPiecesProduced;
        }
    }

  //we assume that for one piece it has PLN 4 profit
    public double earnings() {
        return numberOfPiecesProduced * 4;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("PieceWorker { iloscWyprodukowaychSztuk = %d,%n" +
                "za sztuke 4 zł -> zarobek laczny : %.2f }", numberOfPiecesProduced, earnings());
    }
}
