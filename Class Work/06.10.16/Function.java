public class Function {

	public static void main(String[] args) {
		double n = Double.parseDouble(args[0]);
		double m = Double.parseDouble(args[1]);
		double x = 0;

		for (x = 0; x <= 10; x += 0.1) {
			if (x > 0 && x < 3) {
				System.out.println("x = " + x + "; " + "y = 5");
			}
			else if (x >= 3 && x < 7.5) {
				System.out.println("x = " + x + "; " + "y = " + func1(x));
			}
			else if (x >= 7.5) {
				System.out.println("x = " + x + "; " + "y = " + func2(x));
			}
		}

		if (n > m || n < 0 || m < 0) {
			System.out.println("Both n and m must be positive, m > n");
		} 
		else {
			for (x = n; x <= m; x += 0.1) {
				if (x > 0 && x < 3) {
					System.out.println("x = " + x + "; " + "y = 5");
				}
				else if (x >= 3 && x < 7.5) {
					System.out.println("x = " + x + "; " + "y = " + func1(x));
				}
				else if (x >= 7.5) {
					System.out.println("x = " + x + "; " + "y = " + func2(x));
				}
			}
		}
	}


	public static double func1 (double x) {
		double y = 5 / x + 10 + Math.pow(x, 3);
		return y;
	}

	public static double func2 (double x) {
		double y = x * x + 3.5 + Math.log(x);
		return y;
	}

}
