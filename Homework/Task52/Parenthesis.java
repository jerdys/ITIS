package Homework.Task52;

import java.util.Scanner;

public class Parenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int counter = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            System.out.print(c);

            if (c == '(') {
                counter++;
            }
            else if (c == ')') {
                if (--counter < 0) {
                    break;
                }
            }
        }

        if (counter == 0) {
            System.out.println(" <-- True");
        }
        else {
            System.out.println(" <-- False");
        }
    }
}
