//http://study.istamendil.info/tasks/21

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int a = sc.nextInt();
        while (a <= 0) {
            System.out.print("Please enter a positive number" + "\n" + "A: ");
            a = sc.nextInt();
        }

        System.out.print("B: ");
        int b = sc.nextInt();
        while (b <= 0) {
            System.out.print("Please enter a positive number" + "\n" + "B: ");
            b = sc.nextInt();
        }

        int lmc, i = 1;

        while (true) {
            lmc = a;
            lmc *= i;

            if (lmc % b == 0) {
                break;
            }

            i++;
        }

        System.out.println("The least multiple common of numbers A and B is " + lmc);
    }
}
