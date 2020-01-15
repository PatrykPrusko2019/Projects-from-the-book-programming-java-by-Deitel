package chapter_9.exercise_9_8;



 class Parallelogram extends Quadrilateral {

     private int h;

    public Parallelogram(int x, int h) {
        super(x);
        this.h = h;
    }

    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }

    public int calculateField(Parallelogram p) {
        return p.getX() * p.getH();
    }
}
