import java.io.IOException;
import java.util.Scanner;

/**
 * Cities Chain
 * Created by @author jerdys on 28.05.17
 */

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Cities cities = new Cities();

        System.out.println("   ����� ���������� � ���� \"������\"");
        System.out.println("������ � �������� ������ �� ����� \"" + cities.lastLetter + "\":");
        System.out.print("����� 1: ");

        while (true) {
            cities.cityNameChecker(scanner.nextLine());
        }

        //cities.reset();
    }
}
