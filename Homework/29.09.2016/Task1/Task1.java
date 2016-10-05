import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		double[] arr = new double[10];
		boolean swapped = false;
		double k = 0; //variable for swapping a[j] and a[j - 1] values

		for (int i = 0; i < arr.length; i ++) {
			arr[i] = (int)(Math.random() * 100);
		}

		System.out.println(Arrays.toString(arr));

		for (int i = arr.length; i > 0; i--) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					k = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = k;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
