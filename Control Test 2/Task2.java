import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        int[] arr = new int[k];
        
        for(int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int m = sc.nextInt();
        
    }
    
    public static void arrayMove(int[] arr, int n){
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        
        for (int i = 0; i < arr.length; i++) {
            if (i - n < 0) {
                arr[arr.length + (i - n)] = arr2[i];
            }
            else {
                arr[i - n] = arr2[i];
            }
        }
    }

    
}
