import java.io.*;

/**
 * Cities Chain
 * Created by @author jerdys on 28.05.17
 */

public class Cities {
    private final File cities = new File("src/resources/russia.csv");
    private File mentionedCities = new File("src/resources/mentionedCities.csv");
    private final FileInputStream citiesInputStream = new FileInputStream(cities);
    private FileInputStream mentionedCitiesInputStream = new FileInputStream(mentionedCities);
    private BufferedReader citiesReader = new BufferedReader(new InputStreamReader(citiesInputStream));
    private BufferedReader mentionedCitiesReader = new BufferedReader(new InputStreamReader(mentionedCitiesInputStream));
    private PrintWriter writer = new PrintWriter(new FileOutputStream(mentionedCities, true));
    private String line;
    private int player = 2;
    private boolean clause = true, q1;
    String lastLetter = "А";

    public Cities() throws IOException {
    }

    public void cityNameChecker(String city) throws IOException {
        citiesReader.mark(24000);

        while ((line = citiesReader.readLine()) != null) {
            if (line.toLowerCase().equals(city.toLowerCase())) {
                q1 = true;

                if (!checkIfMentioned(city)) {
                    if (checkFirstLetter(city)) {
                        writeToFile(city);

                        System.out.println("Отлично, теперь введите название города на букву \"" +
                                lastLetter.toUpperCase() + "\":");

                        playerSwap();
                        printCurrentPlayer();

                        break;
                    }
                    else {
                        System.out.println("Вам нужно ввести название города на букву \"" +
                                lastLetter.toUpperCase() + "\":");

                        printCurrentPlayer();
                    }
                }
                else {
                    System.out.println("Этот город уже был введен. Попробуйте другой город на букву \"" +
                            lastLetter.toUpperCase() + "\":");

                    printCurrentPlayer();
                    break;
                }
            }
            else if (line.equals("-1")) {
                System.out.println("Хм, кажется, такого города не существует, попробуйте ввести " +
                        "название другого города на букву \"" + lastLetter.toUpperCase() + "\":");

                printCurrentPlayer();
            }
        }

        citiesReader.reset();
    }

    private boolean checkFirstLetter(String city) {
        if (city.toLowerCase().startsWith(lastLetter.toLowerCase())) {
            lastLetter = Character.toString(city.toLowerCase().charAt(city.length() - 1));

            if (lastLetter.equals("ь") || lastLetter.equals("ъ") || lastLetter.equals("ы")) {
                lastLetter = Character.toString(city.toLowerCase().charAt(city.length() - 2));
            }

            return true;
        }
        else {
            return false;
        }
    }

    private boolean checkIfMentioned(String city) throws IOException {
        mentionedCitiesReader.mark(24000);

        while ((line = mentionedCitiesReader.readLine()) != null) {
            if (line.toLowerCase().equals(city.toLowerCase())) {
                mentionedCitiesReader.reset();
                return true;
            }
        }

        mentionedCitiesReader.reset();
        return false;
    }

    private void writeToFile(String city) throws IOException {
        writer.write(city + "\n");
        writer.flush();
    }

    private void playerSwap() {
        if (!clause) {
            player = 1;
            clause = true;
        }
        else {
            player = 2;
            clause = false;
        }

    }

    private void printCurrentPlayer() {
        System.out.print("Игрок " + player + ": ");
    }

    public void reset() throws IOException {
        writer = new PrintWriter(new FileOutputStream(mentionedCities));
    }
}
