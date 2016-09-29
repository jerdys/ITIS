public class Task1 {

	public static void main(String[] args) {	
		int x0 = Integer.parseInt(args[0]);
		int y0 = Integer.parseInt(args[1]);

		if (x0 == 0) {
			System.out.println("Dividing by zero is forbidden")
		}
		else {
			if (y0 == 1 / x0 + x0) {
				System.out.println("The dot lies on the graph");
			}
			else {
				System.out.println("The dot doesn't lie on the graph");
			}
		}
	}

}