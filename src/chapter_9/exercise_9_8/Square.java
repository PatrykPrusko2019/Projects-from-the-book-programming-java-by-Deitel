package chapter_9.exercise_9_8;



 class Square extends Quadrilateral {


    public Square(int a) {
        super(a);
    }

    public int calculateField(Square square) {
        return square.getX() * square.getX();
    }
}
