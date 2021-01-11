package builtins.challenge.types;

import java.util.Arrays;

public class MainReverse {

    public static void main(String[] args) {
        int[] array1 = { 2, 4,3, 6, 0 };
        int[] array2 = { 2, 4,3, 6, 0, 8 };
        System.out.println(Arrays.toString(array1));

        reverse(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(array2));

        reverse(array2);
        System.out.println(Arrays.toString(array2));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length -1;

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
