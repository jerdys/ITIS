public class Task2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		int part1 = n / 1000;	//getting the first 3 numerals of the number
		int part2 = n % 1000;	//getting the last 3 numerals of the number

		part1 = (part1 / 100) + (part1 % 100 / 10) + (part1 % 10);
		part2 = (part2 / 100) + (part2 % 100 / 10) + (part2 % 10);

		if (part1 == part2) {
			System.out.println("The number is lucky");
		}
		else {
			System.out.println("The number is not lucky");
		}
	}

}
