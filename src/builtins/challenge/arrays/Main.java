package builtins.challenge.arrays;

// create method which leasts numbers in descending order.

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] inputArray = geIntegers();
        int[] sortedArray = sortDescending(inputArray);
        printArray(sortedArray);
    }


    // On^2
    private static int[] sortDescending(int[] array) {
        for (int i=0; i < array.length; i++ ) {
            for (int j=i+1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            if (i==0) {
                System.out.print(array[i]);
            } else {
                System.out.print("," + array[i]);
            }
        }
    }

    private static int[] geIntegers() {
        int length = 6;
        System.out.print("Please enter " + length +   " digits \n");
        int[] resultArray = new int[length];
        for (int i = 0; i < length; i++) {
            resultArray[i] = scanner.nextInt();
        }
        return resultArray;
    }
}
