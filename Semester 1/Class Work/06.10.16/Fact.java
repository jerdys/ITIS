public class Fact {

	public static void main(String[] args) {
		//System.out.println(System.currentTimeMillis());
		long start = System.nanoTime();
		System.out.println(recursion(25));
		//System.out.println(System.currentTimeMillis());
		long finish = System.nanoTime();

		System.out.println("Recursion takes " + ((finish - start) / 100));

		start = System.nanoTime();
		System.out.println(fact(25));
		finish = System.nanoTime();

		System.out.println("Cycle takses " + ((finish - start) / 100));
	}

	
	public static int recursion(int a) {
		if (a == 1) {
			return 1;
		}

		return a * recursion(a - 1);
	}

	

	public static int fact(int a) {
		int x = 1;

		for (int i = 1; i <= a; i++) {
			x *= i;
		}

		return x;
	}

}
