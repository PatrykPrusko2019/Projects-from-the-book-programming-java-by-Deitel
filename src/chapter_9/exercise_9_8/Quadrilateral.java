package chapter_9.exercise_9_8;


public class Quadrilateral {

    private int x;
    private int y;

    public Quadrilateral(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Quadrilateral(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
