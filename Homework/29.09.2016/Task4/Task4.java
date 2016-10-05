public class Task4 {

	public static void main(String[] args) {
		String s1 = args[0];
		String s2 = args[1];

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		boolean isSame = false;

		for (int i = 0; i < c1.length; i++) {
			if (c1[i] == c2[i]) {
				isSame = true;
			}
			else {
				isSame = false;
				break;
			}
		}

		System.out.println(isSame);
	}

}
