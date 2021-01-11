package builtins.lectures.arrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        double average = getAverage(myIntegers);
        System.out.println("This is the average " + average);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + "integer values. \r");
        int[] values= new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index: " + i + " Value of array: " + array[i]);
        }
    }

    public static double getAverage(int[] array) {
        int total = 0;
        for(int element: array) {
            total += element;
        }

        return (double) total/(double) array.length;
    }
}
