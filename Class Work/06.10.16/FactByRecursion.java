public class FactByRecursion {

	public static void main(String[] args) {
		System.out.println(recursion(25));
	}

	public static int recursion(int a) {
		if (a == 1) {
			return 1;
		}

		return a * recursion(a - 1);
	}

}
