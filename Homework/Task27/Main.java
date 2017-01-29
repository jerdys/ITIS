//http://study.istamendil.info/tasks/27

public class Main {
    public static void main(String[] args) {
        int[] a = {4, 8, 15, 16, 23, 42};
        int[] b = {16, 23, 42};
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[0]) {
                for (int j = 0; j < b.length; j++) {
                    if (i + j < a.length && a[i + j] == b[j]) {
                        counter++;
                    } else {
                        break;
                    }
                }

                if (counter == b.length) {
                    System.out.print("First entry index is: " + i);
                    break;
                }
                else {
                    counter = 0;
                }
            }
        }
    }
}
