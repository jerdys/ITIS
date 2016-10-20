import java.io.*;
import java.util.*;

public class RWFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);

		System.out.println(sc.nextLine());

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

}