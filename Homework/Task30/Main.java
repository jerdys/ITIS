//http://study.istamendil.info/tasks/30

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] c = s.toCharArray();
        boolean isPalindrome = true;

        for (int i = 0; i < c.length / 2; i++) {
            if (c[i] == c[c.length - 1 - i]) {
                isPalindrome = true;
            }
            else {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
