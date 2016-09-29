public class Task4 {

	public static void main(String[] args) {
		double n = Integer.parseInt(args[0]);
		double x = Integer.parseInt(args[1]);
		double S = 0;

		if (x == 3) {
			System.out.println("You can't divide by zero");
		}
		else {
			for (int i = 1; i <= n; i++) {
				S += ((2 * i - 1) / (Math.pow(x, (2 * i - 1)) - 3) * Math.pow(-1, i + 1));
			}

			System.out.println(S);
		}
	}

}