package rozdzial_20.exercise.exerciseToGit.chapter_20.exercise_20_8_TestPair;

import java.util.HashMap;
import java.util.Map;

/**
 * Creation and use of the Generalized Map Class Pair
 */
public class Pair <F, S>{

    private Map<F, S> maps;
    private F elementFirstKey;
    private S elementSecondValue;


    public Pair() {
        maps = new HashMap<>();
        this.elementFirstKey = (F) "is empty !!!";
        this.elementSecondValue =  (S) "is empty !!!";
    }

    public Pair(F elementFirst, S elementSecond) {
        this.maps = new HashMap<>();
        this.elementFirstKey = elementFirst;
        this.elementSecondValue = elementSecond;
    }

    public Pair(Map<F, S> maps) {
        this.maps = maps;
        this.elementFirstKey = (F) "is empty !!!";
        this.elementSecondValue =  (S) "is empty !!!";
    }

    public Pair(Map<F, S> maps, F elementFirst, S elementSecond ) {
        this.maps = maps;
        this.elementFirstKey = elementFirst;
        this.elementSecondValue =  elementSecond;
    }




    public Map<F, S> getMaps() {
        return maps;
    }

    public void setMaps(Map<F, S> maps) {
        this.maps = maps;
    }

    public F getElementFirstKey() {
        return elementFirstKey;
    }

    public void setElementFirstKey(F elementFirstKey) {
        this.elementFirstKey = elementFirstKey;
    }

    public S getElementSecondValue() {
        return elementSecondValue;
    }

    public void setElementSecondValue(S elementSecondValue) {
        this.elementSecondValue = elementSecondValue;
    }

    /**
     * adds to map key and value
     * @param elementFirstKey
     * @param elementSecondValue
     */
    public void setKeyAndValueToMap(F elementFirstKey, S elementSecondValue) {
        this.maps.put(elementFirstKey, elementSecondValue);
    }


    /**
     * shows the map content
     */
    public void showMapContent() {
        if(this.maps.isEmpty()) {
            System.out.println("maps is empty !!!");
        } else {
            System.out.println("shows the map content: ");
            int count = 1;
            for (Map.Entry<F, S> pairs : maps.entrySet()) {
                F key = pairs.getKey();
                S value = pairs.getValue();
                System.out.printf("%d. \tkey: %s\t value: %s%n", count++, key, value);
            }
        }
    }

    /**
     * shows the contents of a pair of elements
     */
    public void showContentsOfPair() {
        System.out.printf("object content Pair:\nelementFirst: %s\t, elementSecond: %s%n%n", getElementFirstKey(), getElementSecondValue());
    }
}
