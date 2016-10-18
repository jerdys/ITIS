import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Point {
	int x;
	int y;
	int x0;
	int y0;

	public void readFromFile() throws FileNotFoundException {
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);

		while(sc.hasNextInt()) {
			x = sc.nextInt();
			y = sc.nextInt();
			x0 = sc.nextInt();
			y0 = sc.nextInt();
		}

	}
}
