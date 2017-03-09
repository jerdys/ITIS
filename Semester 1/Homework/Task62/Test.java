package Homework.Task62;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Adolf", "Hitler", "Drittes Reich");
        employee.displayInfo();

        Client client = new Client("Joseph", "Stalin", "Drittes Reich");
        client.displayInfo();
    }
}
