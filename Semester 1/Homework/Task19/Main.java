//http://study.istamendil.info/tasks/19

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

        System.out.println(decimal + " in binary representation: " + toBinary(decimal));
        System.out.print("Maximal ones in a row in binary representation of number " + decimal + ": " +
                maxOnesInRow(toBinary(decimal)));
    }

    public static String toBinary(int decimal) {
        String sDecimal = "";

        while (decimal != 0) {
            if (decimal % 2 != 0) {
                sDecimal += "1";
            }
            else {
                sDecimal += "0";
            }

            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder(sDecimal.length());

        for (int i = (sDecimal.length() - 1); i >= 0; i--) {
            binary.append(sDecimal.charAt(i));
        }

        return binary.toString();
    }

    public static int maxOnesInRow(String decimal) {
        int max = 0, counter = 0;
        char[] cDecimal = decimal.toCharArray();

        for (int i = 0; i < cDecimal.length; i++) {
            if (cDecimal[i] == '1') {
                counter += 1;

                if (counter > max) {
                    max = counter;
                }
            }
            else {
                counter = 0;
            }
        }

        return max;
    }
}
