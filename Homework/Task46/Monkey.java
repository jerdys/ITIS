package Homework.Task46;

public class Monkey {
    protected String name;
    protected int age;
    protected String sex;
    private boolean instincts = true;
    private boolean logic = false;

    public Monkey() { }

    public Monkey(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void walk() {
        System.out.println("I am a monkey and I am just walking");
    }

    public void eat(String food) {
        System.out.println("I am eating " + food);
    }

    private void fight(Monkey monkey2) {
        System.out.println("I am fighting with " + monkey2.getName());
    }

    /*****SETTERS AND GETTERS DOWN HERE*****/

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public boolean getLogic() {
        return logic;
    }

    public boolean getInstincts() {
        return instincts;
    }
}
