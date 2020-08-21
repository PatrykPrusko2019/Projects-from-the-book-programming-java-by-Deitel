package rozdzial_20.exercise.exerciseToGit.chapter_21.exercise_21_7_sortOneWayList;


/**
 * the class creates a one-way list
 *
 */
public class SortedList<E> {

    private String name;
    private ListNode<E> firstNode;


    public SortedList(String name) {
        this.name = name;
        this.firstNode = null;
    }

    public String getName() {
        return name;
    }

    public ListNode<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(ListNode<E> firstNode) {
        this.firstNode = firstNode;
    }

    /**
     * adds a value to the list and sorts it in ascending order
     * @param value -> value to be sorted
     */
    public void insertNewValueAndSortToList(E value) {

        if(isEmpty()) {
            firstNode = new ListNode<>(value); //creates the first node
        } else {

            NodePair<E> insertNewNode = sort(value);

            //add new node
            if(insertNewNode.previousNode == null) { // jesli nie ma zadnego wezla wczesniej

                firstNode = new ListNode<>(value, firstNode); //ustawia wartosc przed innymi, gdy nie ma nic wczesniej
            } else {
                ListNode<E> newNode = new ListNode<>(value);
                insertNewNode.previousNode.nextNode = newNode;
                newNode.nextNode = insertNewNode.currentNode;
            }


        }
    }

    /**
     *
     * sorts the one-way list by looking for a place between nodes where to put a new node.
     * Later, it creates a NodePair object with two nodes
     * @param value -> the value of the new node
     * @return NodePair object with two nodes
     */
    private NodePair<E> sort(E value) {
        ListNode<E> currentNode = firstNode;
        ListNode<E> previousNode = null;

        while(currentNode != null) {

            E second = currentNode.getData();

            if(checkTheValue(value, second)) break;
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }


        return new NodePair<E>(currentNode, previousNode);
    }

    /**
     * Check that the currentValue is less than the secondValue
     * @param currentValue
     * @param secondValue
     * @return
     */
    private boolean checkTheValue(E currentValue, E secondValue) {
        return (Integer) currentValue < (Integer) secondValue;
    }

    /**
     * shows the contents of a one-way list
     */
    public void showTheList() {
        ListNode<E> currentNode = firstNode;
        System.out.println( getName() + ":");
        while(currentNode != null) {
            System.out.printf("%s\t", currentNode.getData());
            currentNode = currentNode.nextNode; //nastepny wezel
        }
    }

    /**
     * returns the contents of the given index from the list
     * @param index
     * @return
     */
    public E returnsListValueFromGivenIndex(int index) {

        if( isEmpty() || index < 0 || index > getSize()-1 ) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }

        int currentIndex = 0;
        ListNode<E> currentNode = firstNode;

        while(currentNode != null) {
          if( currentIndex == index ) break;
          currentNode = currentNode.nextNode;
          currentIndex++;
        }
        return currentNode.getData();
    }

    /**
     * returns the size of the given list
     * @return
     */
    public int getSize() {

        int indexSize = 0;
        ListNode<E> current = firstNode;
        while(current != null) {
            current = current.nextNode;
            indexSize++;
        }
        return indexSize;
    }

    private boolean isEmpty() {
        if(firstNode == null) return true;
        return false;
    }


    /**
     * an add-on class creates a pair of the current and previous nodes
     * @param <E>
     */
    static class NodePair<E> {
        private final ListNode<E> currentNode;
        private final ListNode<E> previousNode;

        public NodePair(ListNode<E> currentNode, ListNode<E> previousNode) {
            this.currentNode = currentNode;
            this.previousNode = previousNode;
        }


    }
}


/**
 * add-on class creating the list node
 * @param <E>
 */
 class ListNode<E> {
    E data; //zawartosc wezla
    ListNode<E> nextNode; //nastepny wezel

    public ListNode(E value) {
        this(value, null);

    }

    public ListNode(E value, ListNode<E> node) {
        this.data = value;
        this.nextNode = node;
    }

    public E getData() {
        return data;
    }

    public ListNode<E> getNextNode() {
        return nextNode;
    }
}


