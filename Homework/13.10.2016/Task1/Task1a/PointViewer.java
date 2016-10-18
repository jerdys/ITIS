import java.io.FileNotFoundException;


public class PointViewer {

	public static void main(String[] args) throws FileNotFoundException {
		DistanceCalc calc = new DistanceCalc();

		System.out.println(DistanceCalc.getResult());
	}

}
