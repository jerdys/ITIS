import java.io.FileNotFoundException;

public class DistanceCalc {

	static double getResult() throws FileNotFoundException {
		Point point = new Point();
		point.readFromFile();

		double result = Math.sqrt(Math.pow(point.x0 - point.x, 2) + Math.pow(point.y0 - point.y, 2));

		return result;
	}	
}
