public class Task11c {

	public static void main(String[] args) {
		long timeoutEucl = System.nanoTime();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int a1 = a;
		int b1 = b;

		while (a != 0 && b != 0) {
			if (a > b) {
				a %= b;
			}
			else {
				b %= a;
			}
		}

		System.out.println("Euclid's method:");
		System.out.println(a + b);
		timeoutEucl = System.nanoTime() - timeoutEucl;
		System.out.println("Euclid's method takes " + timeoutEucl + " nanoseconds");

		System.out.println();
		System.out.println();

		//////******		BRUTE FORCE METHOD		******///////

		long timeoutBrute = System.nanoTime();
		int min = a1;
		int max = 0;

		if (a1 == b1) {
			System.out.println(a1);
		}
		else {
			if (b1 < min) {
				min = b1;
			}

			for (int i = 2; i <= min; i++) {
				if (a1 % i == 0 && b1 % i == 0) {
					max = i;
				}
			}
		}

		System.out.println("Brute force method:");
		System.out.println(max);
		timeoutBrute = System.nanoTime() - timeoutBrute;
		System.out.println("Brute force method takes " + timeoutBrute + " nanoseconds");
		System.out.println();
		System.out.println();

		if (timeoutBrute > timeoutEucl) {
			System.out.println ("Euclid's algorithm is faster on " + (timeoutBrute - timeoutEucl) + " microseconds");
		}

		if (timeoutEucl > timeoutBrute) {
			System.out.println ("Brute force method is faster at" + (timeoutEucl - timeoutBrute) + " microseconds");
		}
	}

}
