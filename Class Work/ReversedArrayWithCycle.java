public class ReversedArrayWithCycle {

    public static void main(String[] args) {
        int[] a = new int[10];
        int temp = 0;
        System.out.println("The array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }

        System.out.println("\n" + "\n" + "Reversed array (by-hand):");

        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
