package builtins.lectures.boxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // In order to do ArrayList of ints, you need to uses wrappers, way to do it:
        // It's the same with any primitives.

        ArrayList<Integer> myIntegers = new ArrayList<>();
        myIntegers.add(4);
        myIntegers.add(8);

        for(int integer: myIntegers) {
            System.out.println("This is the integer " + integer);
        }
    }
}
