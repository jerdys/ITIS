package Homework.Task46;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Bulat", 18, "male", "Universiade Village", "Programmer", 1000);
        System.out.println("This " + human.getSex() + "'s name is " + human.getName());
        System.out.println("He's " + human.getAge() + " and he lives in " + human.getResidence());
        System.out.println(human.getName() + " works as a " + human.getProfession());

        System.out.println("Today he'll go to his work and will make some money");
        System.out.println("Right now he has " + human.getCash() + " dollars");
        human.makeMoney(1000, 114);

        System.out.println("The day has ended, now he has " + human.getCash() + " dollars");
        System.out.println("Now he is about to walk in the park and then he'll go home and get some rest");

        human.walk();
        human.goHome("UV");
    }
}
