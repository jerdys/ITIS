//http://study.istamendil.info/tasks/28

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine(), b = sc.nextLine();
        char[] line1 = a.toCharArray(), line2 = b.toCharArray();

        for (int i = 0; i < line1.length; i++) {
            if (line1[i] < line2[i]) {
                System.out.println(a + " < " + b);
                break;
            }
            else if (line1[i] > line2[i]) {
                System.out.println(a + " > " + b);
                break;
            }
            else if (line1[i] == line2[i]) {
                continue;
            }

            System.out.println(a + " = " + b);
        }
    }
}
