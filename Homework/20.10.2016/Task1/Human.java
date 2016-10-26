public class Human extends Monkey {
    private String name;
    private String surname;

    protected Human(String name, String surname, int weight, int height, int yearOfBirth, boolean wool) {
        super(weight, height, yearOfBirth, wool);
        setName(name);
        setSurname(surname);
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Surname: " + surname + "\n" + super.toString();


    }
}
