package Homework.Task62;

class Client extends Person {
    private String bank;

    public Client(String name, String surname, String company) {
        super(name, surname);
        this.bank = company;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + super.getName() + "\n" + "Surname: "
                + super.getSurname() + "\n" + "Client of: \"" + bank + "\"");
    }
}