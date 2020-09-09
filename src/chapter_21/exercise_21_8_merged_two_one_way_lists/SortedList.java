package rozdzial_20.exercise.exerciseToGit.exercise_21_8_merged_two_one_way_lists;


/**
 * the class creates a one-way list
 *
 */
public class SortedList<E>  {

    private String name;
    private ListNode<E> firstNode;

    public SortedList(String name) {
        this.name = name;
        this.firstNode = null;
    }

    public SortedList(String name, E[] arrayWithValues) {
        this(name);
        for(E value : arrayWithValues) insertNewValueAndSortToList( value); //completes a one-way list
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
            if(insertNewNode.previousNode == null) { //if there is no node before

                firstNode = new ListNode<>(value, firstNode); //sets the value in front of the others when there is nothing before
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

            if(checkTheValue(value, second) < 0) break;
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }


        return new NodePair<E>(currentNode, previousNode);
    }

    /**
     * Check that the currentValue is less than the secondValue
     * @param currentValue
     * @param secondValue
     * @return returns negative if true. Returns false if zero or positive
     */
    private int checkTheValue(E currentValue, E secondValue) {

        Object obj_1 = currentValue;
        Object obj_2 = secondValue;

        if(obj_1 instanceof String) {

            String str_1 = (String) obj_1;
            String str_2 = (String) obj_2;
            return str_1.compareTo(str_2);
        }

        if(obj_1 instanceof Character) {

            Character char_1 = (Character) obj_1;
            Character char_2 = (Character) obj_2;
            return char_1.compareTo(char_2);
        }

        if(obj_1 instanceof Number) {

            if(obj_1 instanceof Double) {
                Double valueDouble_1 = (Double) obj_1;
                Double valueDouble_2 = (Double) obj_2;
                return valueDouble_1.compareTo(valueDouble_2);
            }
            if(obj_1 instanceof Float) {
                Float valueFloat_1 = (Float) obj_1;
                Float valueFloat_2 = (Float) obj_2;
                return valueFloat_1.compareTo(valueFloat_2);
            }

            Number value_1 = (Number) obj_1;
            Number value_2 = (Number) obj_2;

            return  value_1.intValue() - value_2.intValue();
        }

        try {
            throw new Exception("wrong value !!! ");

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * shows the contents of a one-way list
     */
    public void showTheList() {
        ListNode<E> currentNode = firstNode;
        System.out.println("\n" + getName() + ":");
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
        return currentNode.data;
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
     * merges two one-way lists and sorts them
     * @param secondList
     */
    public void merge(SortedList<E> secondList) {
        ListNode<E> currentNode = secondList.firstNode;

        while(currentNode != null) {
            this.insertNewValueAndSortToList(currentNode.data); //merges the liste secondList with the list that called merge ()
            currentNode = currentNode.nextNode;
        }
    }

    /**
     * merges two one-way lists and without sorts them
     * @param secondList
     */
    public void mergeWithoutSort(SortedList<E> secondList) {

        ListNode<E> currentNode = this.firstNode;

        while(currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }

            currentNode.nextNode = secondList.firstNode; // merges the last item in the first list that link to the second list with the first item
    }

    /**
     * sorts the given one-way list
     */
    public void sort() {
        SortedList<E> sortedList = new SortedList<>(this.getName()); // creates a new one-way list object
        ListNode<E> currentNode = this.firstNode;
        while(currentNode != null) {
            sortedList.insertNewValueAndSortToList(currentNode.getData()); // assigns each value from the current list to a new list
            currentNode = currentNode.nextNode;
        }
        this.firstNode = sortedList.firstNode; // creates a new sorted list
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
    E data; //node content
    ListNode<E> nextNode;

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



