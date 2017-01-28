package Homework.Task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number in decimal representation: ");
        int decimal = sc.nextInt();

        if (decimal < 0) {
            while (decimal < 0) {
                System.out.print("Please enter the positive number: ");
                decimal = sc.nextInt();
            }
        }

        System.out.print("Enter the base of number system: ");
        int radix = sc.nextInt();

        if (radix > 10 || radix < 2) {
            while (radix > 10 || radix < 2) {
                System.out.println("Please enter the number from 2 to 10");
                radix = sc.nextInt();
            }

        }
        System.out.println();

        int result = Integer.parseInt(toRadix(decimal, radix));
        System.out.println(decimal + " in " + radix + " number system: " + result);
        System.out.println("Sum of digits in " + result + " equals to: " + digitSum(result));
    }

    public static String toRadix(int decimal, int radix) {
        String sDecimal = "";

        while (decimal != 0) {
            int mod = decimal % radix;

            if (mod != 0) {
                sDecimal += mod;
            }
            else {
                sDecimal += "0";
            }

            decimal /= radix;
        }

        StringBuilder binary = new StringBuilder(sDecimal.length());

        for (int i = (sDecimal.length() - 1); i >= 0; i--) {
            binary.append(sDecimal.charAt(i));
        }

        return binary.toString();
    }

    public static int digitSum(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
