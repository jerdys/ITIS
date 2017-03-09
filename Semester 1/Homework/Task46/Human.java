package Homework.Task46;

public class Human extends Monkey {
    private String residence;
    private String profession;
    private int cash;
    private boolean instincts = true;
    private boolean logic = true;


    Human(String name, int age, String sex, String residence, String profession, int cash) {
        super(name, age, sex);
        this.residence = residence;
        this.profession = profession;
        this.cash = cash;
    }

    @Override
    public void walk() {
        System.out.println("I am going towards something. But it is also" +
                "possible that I am just walking in the park after a long day");
    }

    private void fight(Human human2) {
        System.out.println("Looks like I'm in trouble, cause I'm fighting + " + human2.getName() +
                " for some reason");
    }

    public void goHome(String residence) {
        System.out.println("I am going back to my home. I live in " + residence);
    }

    public void makeMoney(int cash, int salary) {
        this.cash += salary;
        System.out.println("Today I made " + salary + " dollars");
    }

    /*****SETTERS AND GETTERS DOWN HERE*****/

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getResidence() {
        return residence;
    }

    public String getProfession() {
        return profession;
    }

    public int getCash() {
        return cash;
    }
}
