import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Monkey {
    protected int weight;
    protected int height;
    protected int yearOfBirth;
    protected int age;

    private boolean wool;

    protected Monkey(int weight, int height, int yearOfBirth, boolean wool) {
        this.weight = weight;
        this.height = height;
        this.yearOfBirth = yearOfBirth;
        this.wool = wool;
    }

    public int Age() {
        return getCurrentYear() - yearOfBirth;
    }

    public static int getCurrentYear() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTime(new Date());
        return calendar.get(Calendar.YEAR);
    }

    public String toString() {
        if (wool) {
            return "This monkey is " + weight + " kilograms, he is " + height + " cm tall." + "\n" + "He was born in " +
                    yearOfBirth + ". Today he is " + Age() + " years old. " + "\n" + "He also has got a lot of wool." +
                    "\n" + "\n";
        }
        else {
            return "This human is " + weight + " kilograms, he is " + height + " cm tall." + "\n" + "He was born in " +
                    yearOfBirth + ". Today he is " + Age() + " years old. " + "\n" + "He's got no wool. It's obvious " +
                    "because he's not a monkey :)";
        }
    }

}

