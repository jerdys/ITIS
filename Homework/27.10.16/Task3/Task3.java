import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        long[] array = createArray();

        System.out.println("First element of original array : " + array[0]);

        changingArray(array);

        System.out.println("Changed array : " + Arrays.toString(array));
    }

    public static long[] createArray(){
        int capacity = (int) (3 + Math.random() * 10);
        long[] array = new long[capacity];
        for (int i = 0; i < 1; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(capacity);
        return array;
    }

    public static void changeArray(long[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1]*arr[i-1];
        }
    }

}