package rozdzial_20.exercise.exerciseToGit.chapter_20.exercise_20_8_TestPair;


/**
 * Testing the generalized class of Pairs
 * creates 3 Pair objects with two elements or with a map and display the results
 *
 * program operation:
 *
 *
 * the contents of the pair object:
 *
 * shows the map content:
 * 1. 	key: 26	 value: string second
 * 2. 	key: 13	 value: string first
 * object content Pair:
 * elementFirst: is empty !!!	, elementSecond: is empty !!!
 *
 * the contents of the pair2 object:
 *
 * object content Pair:
 * elementFirst: keyString	, elementSecond: 13
 *
 * maps is empty !!!
 * element first : keyString
 *
 * the contents of the pair3 object:
 *
 * object content Pair:
 * elementFirst: newKeyString	, elementSecond: 23
 *
 * shows the map content:
 * 1. 	key: 26	 value: string second
 * 2. 	key: 13	 value: string first
 *
 * Process finished with exit code 0
 */
public class TestPair {
    public static void main(String[] args) {


        new TestPair().start();
    }

    private void start() {


        System.out.println("the contents of the pair object: \n");

        Pair pair = new Pair(); // creates a new Pair object


        pair.setKeyAndValueToMap(13, "string first"); //adds 2 pairs to the map
        pair.setKeyAndValueToMap(26, "string second");

        pair.showMapContent();
        pair.showContentsOfPair();

        System.out.println("the contents of the pair2 object: \n");

        //////////////////////////////////////////////

        Pair pair2 = new Pair("keyString", 13);

        pair2.showContentsOfPair();
        pair2.showMapContent();


        System.out.println("element first : " + pair2.getElementFirstKey() );

        ////////////////////////////////////////////////

        System.out.println("\nthe contents of the pair3 object: \n");

        Pair pair3 = new Pair( pair.getMaps(), "newKeyString", 23);



        pair3.showContentsOfPair();
        pair3.showMapContent();
    }
}
