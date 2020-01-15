package chapter_8.exercise.exercise_8_17_testBigIntegers;

import java.math.BigInteger;
import java.util.Arrays;

public class HugeInteger {

    private BigInteger[] tabBigInteger;

    public HugeInteger() {
        this.tabBigInteger = new BigInteger[40]; // 40 elements maximum
    }


    public BigInteger[] getTabBigInteger() {
        return tabBigInteger;
    }
    public void setTabBigInteger(BigInteger[] tabBigInteger) {
        this.tabBigInteger = tabBigInteger;
    }
    public void addNewNumberToArray(BigInteger b) {
        String str = b.toString();
        int value = str.length(); //ilosc cyfr
        if(value > 40 || value < 0) {
            System.out.println("wrong value to add range 1 - 40 digits, please again ...");
        } else {
            for(int i = 0; i < tabBigInteger.length; i++) {
                if(tabBigInteger[i] == null) {
                    tabBigInteger[i] = b;
                    System.out.println("add new value of BigInteger");
                    break;
                }
                if(i == tabBigInteger.length-1) {
                    System.out.println("array is full !!!");
                }
            }

        }

    }

    @Override
    public String toString() {
        return "HugeInteger{" +
                "tabBigInteger=" + Arrays.toString(tabBigInteger) +
                '}';
    }

    public void add(BigInteger bigIntegerToAdd, int numberIndexOfArray) {
    numberIndexOfArray--;

        if(tabBigInteger[numberIndexOfArray] != null) {
            BigInteger newValue = tabBigInteger[numberIndexOfArray].add(bigIntegerToAdd);
            String str = newValue.toString();//number of digits

            if(str.length() < 41) {
                tabBigInteger[numberIndexOfArray] = newValue;
                System.out.println("add 2 BigIntegers");
            } else {
                System.out.println("range 1- 40 digits, no add another value of BigInteger");
            }
        } else {
            System.out.println("wrong index of array");
        }
    }

    public void subtract(BigInteger bigIntegerToAdd, int numberIndexOfArray) {
        numberIndexOfArray--;

        if(tabBigInteger[numberIndexOfArray] != null) {
            BigInteger newValue = tabBigInteger[numberIndexOfArray].subtract(bigIntegerToAdd);
            String str = newValue.toString();

            if(str.length() < 41 ) {
                tabBigInteger[numberIndexOfArray] = newValue;
                System.out.println("subtract 2 BigIntegers");
            } else {
                System.out.println("range 1- 40 digits, no add another value of BigInteger");
            }
        } else {
            System.out.println("wrong index of array");
        }
    }

    //adding a numeric string to a given array
    public void parseToArray(String str) {
        if(str.length() < 41) {
            for (int i = 0; i < tabBigInteger.length; i++) {
                if (tabBigInteger[i] == null) {
                    tabBigInteger[i] = new BigInteger(str);
                    System.out.println("add new value from method parse");
                    break;
                }
            }
        } else {
            System.out.println("too much value !!!");
        }
    }


    public boolean isEqualTo(BigInteger first, BigInteger second) {
        if((first == null) || (second == null)) {
            System.out.println("wrong value !!!");
            return false;
        }
        char[] firstTab = first.toString().toCharArray();
        char[] secondTab = second.toString().toCharArray();
        if(firstTab.length == secondTab.length) {
            for(int i = 0; i < firstTab.length; i++) {

                if(firstTab[i] - secondTab[i] > 0) {
                    return false;
                } else if (firstTab[i] - secondTab[i] < 0){
                    return false;
                }
            }
         return true;   //is equal
        } else {
            return false;
        }
    }


    public boolean isNotEqualTo(BigInteger first, BigInteger second) {
        if((first == null) || (second == null)) {
            System.out.println("wrong value !!!");
            return false;
        }
        char[] firstTab = first.toString().toCharArray();
        char[] secondTab = second.toString().toCharArray();
        if(firstTab.length == secondTab.length) {
            for(int i = 0; i < firstTab.length; i++) {

                if(firstTab[i] - secondTab[i] != 0) { //it is enough that it is only once different from 0, it means that it is not equal
                    return true;
                }
            }
            return false;   //is equal
        } else {
            return true; // is not equals
        }
    }

    //is bigger than -> meaningi first > second
    public boolean isGreaterThan(BigInteger first, BigInteger second) {
        if((first == null) || (second == null)) {
            System.out.println("wrong value !!!");
            return false;
        }
        char[] firstTab = first.toString().toCharArray();
        char[] secondTab = second.toString().toCharArray();
        if(firstTab.length == secondTab.length) {
            for(int i = 0; i < firstTab.length; i++) {

                if(firstTab[i] - secondTab[i] > 0) { // it will only be smaller once it is false
                    return true; // is true
                } else if(firstTab[i] - secondTab[i] < 0) {
                    return false;
                }
            }
            return false;
        } else if(firstTab.length > secondTab.length){
            return true;
        } else {
            return false;
        }
    }

    //is smaller than ->  first < second
    public boolean isLessThan(BigInteger first, BigInteger second) {
        if((first == null) || (second == null)) {
            System.out.println("wrong value !!!");
            return false;
        }
        char[] firstTab = first.toString().toCharArray();
        char[] secondTab = second.toString().toCharArray();
        if(firstTab.length == secondTab.length) {
            for(int i = 0; i < firstTab.length; i++) {

                if(firstTab[i] - secondTab[i] > 0) {
                    return false;
                } else if(firstTab[i] - secondTab[i] < 0) {
                    return true;
                }
            }
            return false;
        } else if(firstTab.length > secondTab.length){
            return false;
        } else {
            return true;
        }
    }


    //is larger than or equal -> first > second || first == second
    public boolean isGreaterThanOrEqualTo(BigInteger first, BigInteger second) {
        boolean equalTo = isEqualTo(first, second);
        boolean isGreaterThan = isGreaterThan(first, second);

        if(equalTo || isGreaterThan) {
            System.out.println("equalTo -> " + equalTo + ", isGreaterThan -> " + isGreaterThan + " -> return true !!!");
            return true;
        } else {
            System.out.println("equalTo -> " + equalTo + ", isGreaterThan -> " + isGreaterThan + " -> return false !!!");
            return false;
        }
    }

    //is smaller or equal -> first < second || first == second
    public boolean isLessThanOrEqualTo(BigInteger first, BigInteger second) {

        boolean equalTo = isEqualTo(first, second);
        boolean isLessThan = isLessThan(first, second);

        if(equalTo || isLessThan) {
            System.out.println("equalTo -> " + equalTo + ", is Less Than -> " + isLessThan + " -> return true !!!");
            return true;
        } else {
            System.out.println("equalTo -> " + equalTo + ", is Less Than -> " + isLessThan + " -> return false !!!");
            return false;
        }
    }

    //zero in at least one parameter
    public boolean isZero(BigInteger first, BigInteger second) {
        if((first == null) || (second == null)) {
            System.out.println("wrong value !!!");
            return false;
        }

        char[] firstTab = first.toString().toCharArray();
        char[] secondTab = second.toString().toCharArray();

        for(int i = 0; i < firstTab.length; i++) {
            if(firstTab[i] == '0') {
                return true;
            }
        }
        for(int i = 0; i < secondTab.length; i++) {
            if(secondTab[i] == '0') {
                return true;
            }
        }
        return false; //no zero in both values
    }

    public BigInteger multiply (BigInteger first, BigInteger second) {
        return first.multiply(second);
    }


    public BigInteger divide (BigInteger first, BigInteger second) {
        return first.divide(second);
    }

    //rest
    public BigInteger remainder(BigInteger first, BigInteger second) {

        return first.remainder(second);
    }
}
