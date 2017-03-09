public class Array {

    public static void main(String[] args) {

        int size = ((int) (Math.random()*10)+3);    //print random number instead of *10
        System.out.println("The size of array is " + size);
        long[] array = new long[size];

        for (int i = 0; i < 2; i++) {
            array[i] = ((int) (Math.random()*4+1));
        }

        for (int i = 2; i < size; i++) {
            array[i] = array[i - 2] * array[i - 1];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
