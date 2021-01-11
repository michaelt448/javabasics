package builtins.challenge.types;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] values = readElements(5);
        int minimum = findMin(values);
    }

    private static int[] readElements(int count ) {
        Scanner scanner = new Scanner(System.in);
        int[] values= new int[count];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    private static int findMin(int[] array) {
        int minimum = array[0];
        for (int number: array) {
            if (number < minimum) minimum = number;
        }

        return minimum;
    }
}
