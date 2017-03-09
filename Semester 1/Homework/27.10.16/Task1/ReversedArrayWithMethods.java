import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ReversedArrayWithMethods {
    public static void main(String[] args) {
        ArrayList<Integer>[] a = new ArrayList[10];

        System.out.println("The array:");

        for (int i = 0; i < a.length; i++) {
            a[i] = new ArrayList<>();
            Collections.addAll(a[i], ((int) (Math.random() * 100)));
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.println("Reversed array:");
        Collections.reverse(Arrays.asList(a));

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}