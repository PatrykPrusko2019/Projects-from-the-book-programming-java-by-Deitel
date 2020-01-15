package chapter_9.exercise_9_8;

public class Rectangle extends Quadrilateral {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public int calculateField(Rectangle rectangle) {
        return rectangle.getX() * rectangle.getY();
    }
}
