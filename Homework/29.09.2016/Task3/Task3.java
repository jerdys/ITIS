import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		int[] a = {4, 8, 15, 16, 23, 42};			//change arrays' values here
		int[] b = {0, 15, 4, 8, 15, 16, 23};		//change arrays' values here
		boolean contains = false;

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println();

		for (int i = 0; i < b.length; i++) {
			contains = false;

			for (int j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
					System.out.println("b[" + i + "]: "+"First entrance: " + j);
					contains = true;

					break;
				}
			}

			if (!contains) {
				System.out.println("b[" + i + "]: "+"No entrances");
			}
		}
	}

}
