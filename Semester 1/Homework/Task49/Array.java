package Homework.Task49;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = generateArray(10);
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Upturned array: " + upturnArray(array));
    }

    public static int[] generateArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        return array;
    }

    public static String upturnArray(int[] array) {
        int tmp;

        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }

        return Arrays.toString(array);
    }
}
