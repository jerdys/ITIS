package Homework.Task53;

import java.util.Scanner;

public class Brackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            System.out.print(c);

            if (c == '(') {
                counter1++;
            }
            else if (c == ')') {
                if (--counter1 < 0) {
                    break;
                }
            }
            else if (c == '[') {
                counter2++;
            }
            else if (c == ']') {
                if (--counter2 < 0) {
                    break;
                }
            }
            else if (c == '{') {
                counter3++;
            }
            else if (c == '}') {
                if (--counter3 < 0) {
                    break;
                }
            }
        }

        if (counter1 == 0 && counter2 == 0 && counter3 == 0) {
            System.out.println(" <-- True");
        }
        else {
            System.out.println(" <-- False");
        }
    }
}
