package builtins.lectures.types;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        printInt(myIntValue);
        printInt(anotherIntValue);
        // same values

        myIntValue = 11;

        printInt(myIntValue);
        printInt(anotherIntValue);
        // gives 11 10, because ints hold the actual value instead of refrence.

        // REFs work differently

        int[] myIntArray = new int[5];
        int [] anotherArray = myIntArray;


        printIntArray(myIntArray);
        printIntArray(anotherArray);

        myIntArray[0] = 1;

        printIntArray(myIntArray);
        printIntArray(anotherArray);
        // note here both values are the same, because they do not hold the actual value but the refrence;

        // if you want to make them two different ones with copy, you need to deep copy that array

        anotherArray = Arrays.copyOf(myIntArray, myIntArray.length);
        anotherArray[0] = 2;

        printIntArray(myIntArray);
        printIntArray(anotherArray);
        // now these two arrays are separate

    }

    private static void printInt(int number) {
        System.out.println(number);
    }

    private static void printIntArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
