package rozdzial_20.exercise.exerciseToGit.chapter_20.exercise_20_5_GenericMethodTest;

public class InvalidIndexException extends Exception {

    public InvalidIndexException() {
        this("Invalid Index Exception !!!!!");
    }

    public InvalidIndexException(String message) {
        super(message);
    }
}
