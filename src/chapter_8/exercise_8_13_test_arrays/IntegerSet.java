package chapter_8.exercise_8_13_test_arrays;

public class IntegerSet {
    //range 0 - 100
   private static boolean[] tabTrueOrFalse;
   private int[] tab;
   private int value;

    public IntegerSet() {
        this.tabTrueOrFalse = new boolean[101]; //range 0 - 100
        for(int i = 0; i < tabTrueOrFalse.length; i++) {
            tabTrueOrFalse[i] = false;
        }
    }
    public IntegerSet(int[] newtab) {
        this.tab = newtab;
    }
    public IntegerSet(int value) {
        this.value = value;
    }

    public static boolean[] getTabTrueOrFalse() {
        return tabTrueOrFalse;
    }
    public static void setTabTrueOrFalse(boolean[] tabTrueOrFalse) {
        IntegerSet.tabTrueOrFalse = tabTrueOrFalse;
    }
    public int[] getTab() {
        return tab;
    }
    public void setTab(int[] tab) {
        this.tab = tab;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public static void checkToGoodValue(int[] tab) {

        for(int i = 0; i < tab.length; i++) {
            int value = tab[i];
            if(value < 0 || value > 100) {
                continue;
            } else {
                    tabTrueOrFalse[value] = true;
                }
            }
    }


    //adds 2 tabs
    public static void union(IntegerSet first, IntegerSet second) {
        checkToGoodValue(first.getTab());
        checkToGoodValue(second.getTab());
    }

    //adds 1 tab
    public static void interSection(IntegerSet first) {
        checkToGoodValue(first.getTab());
    }

    //add value
    public void insertElement(int element) {
       if(checkToGoodValue2(element)) {
           System.out.println("adds new element to tab");
       } else {
           System.out.println("no adds the element");
       }
    }
    private boolean checkToGoodValue2(int element) {
        if(element < 0 || element > 100) {
            return false;
        } else {
            tabTrueOrFalse[element] = true;
            return true;
        }
    }

    //remove value
    public void deleteElement(int element) {
        if(element < 0 || element > 100) {
            System.out.println("no the value in tab");
        } else {

            if(tabTrueOrFalse[element]) {
                tabTrueOrFalse[element] = false;
                System.out.println("remove the element");
            } else {
                System.out.println("no the element in tab !!!");
            }
        }

    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < tabTrueOrFalse.length; i++) {
            if(tabTrueOrFalse[i]) {
                str += i + ", ";
            }
        }



        return str == "" ? "----- empty SET" : "IntegerSet{ " + str + " }";
    }
}
