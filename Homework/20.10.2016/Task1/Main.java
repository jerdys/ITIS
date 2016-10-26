public class Main {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey(40, 100, 2005, true);
        monkey1.Age();
        System.out.println(monkey1);
        PrintHuman printHuman = new PrintHuman();
        printHuman.print();
    }
}
