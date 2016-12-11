package Homework.Task62;

public class Employee extends Person {
    private String bank;

    public Employee(String name, String surname, String company) {
        super(name, surname);
        this.bank = company;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + super.getName() + "\n" + "Surname: "
                + super.getSurname() + "\n" + "Works in: \"" + bank + "\"");
    }
}
