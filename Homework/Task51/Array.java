package Homework.Task51;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first element of array: ");
        int first = scanner.nextInt();

        System.out.println(Arrays.toString(fillWithSquare(first)));
    }


    public static long[] fillWithSquare(int first) {
        long[] array = new long[10];
        array[0] = first;
        for (int i = 1; i < 10; i++) {
            array[i] = array[i - 1] * array[i - 1];
        }

        return array;
    }
}
