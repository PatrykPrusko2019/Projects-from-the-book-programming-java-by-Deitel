package chapter_8.exercise_8_10;

public enum TrafficLight {

    RED(10),
    GREEN(15),
    YELLOW(7);

    private int lenghtOfLight;


    TrafficLight(int timeOfSecond) {
        lenghtOfLight = timeOfSecond;
    }

    public int getLenghtOfLight() {
        return lenghtOfLight;
    }

}
