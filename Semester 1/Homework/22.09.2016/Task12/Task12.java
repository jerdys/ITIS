public class Task12 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int counter = n;

		for (int i = 1; i <= n; i++) {
			for (int j = counter - 1; j >= 1; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			counter--;
			System.out.println();

		}
	}
	
}
