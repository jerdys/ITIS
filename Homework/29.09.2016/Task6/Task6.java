public class Task6 {

	public static void main(String[] args) {
		String s = args[0];
		char[] c = s.toCharArray();
		boolean isPalindrome = false;

		for (int i = 0; i < c.length / 2; i++) {
			if (c[i] == c[c.length - 1 - i]) {
				isPalindrome = true;
			}
			else {
				isPalindrome = false;
				break;
			}
		}

		System.out.println(isPalindrome);
	}

}
