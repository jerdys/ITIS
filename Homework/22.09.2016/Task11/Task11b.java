public class Task11b {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int min = a;
		int max = 0;

		if (a == b) {
			System.out.println(a);
		}
		else {
			if (b < min) {
				min = b;
			}

			for (int i = 2; i <= min; i++) {
				if (a % i == 0 && b % i == 0) {
					max = i;
				}
			}
		}

		System.out.println(max);
	}

}
