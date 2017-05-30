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

        System.out.println("   Добро пожаловать в игру \"Города\"");
        System.out.println("Начнем с названия города на букву \"" + cities.lastLetter + "\":");
        System.out.print("Игрок 1: ");

        while (true) {
            cities.cityNameChecker(scanner.nextLine());
        }

        //cities.reset();
    }
}
