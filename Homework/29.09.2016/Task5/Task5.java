import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];

		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();

		boolean contains = false;

		for (int i = 0; i < b1.length; i++) {
			contains = false;

			for (int j = 0; j < a1.length; j++) {
				if (a1[j] == b1[i]) {
					System.out.println("b[" + i + "] " + "first appearance " + "a[" + j + "]");
					contains = true;
				}
			}

			if (!contains) {
				System.out.println("b[" + i + "] " + "doesn't appear");
			}
		}

	}

}
