package chapter_9.exercise_9_8;


public class Trapezoid extends Quadrilateral{

    private int h;

    public Trapezoid(int x, int y, int h) {
        super(x, y);
        this.h = h;
    }


    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }

    public int calculateField(Trapezoid t) {
        return ( (t.getX() + t.getY()) * t.getH() ) / 2;
    }
}
