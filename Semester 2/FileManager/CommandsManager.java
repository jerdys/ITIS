package FileManager;

import java.io.File;
import java.util.Scanner;

public class CommandsManager {
    Commands commandList = new Commands();
    Scanner sc = new Scanner(System.in);
    String command;
    File path = null;

    public void start() {
        while (true) {
            command = sc.nextLine();

            switch (getCommand(command)) {
                case "cd":
                    path = new File(getParameter(command));
                    commandList.cd(path);

                    break;

                case "ls":
                    commandList.ls(commandList.getCurrentDirectory());

                    break;

                case "rm":
                    break;
                case "mv":
                    break;
                case "cp":
                    break;
                case "":
                    break;
                default:
                    System.out.println(getCommand(command) + " is not a command");
            }

            commandList.printCurrentDirectory();
        }
    }

    public String getParameter(String line) {
        String[] parameter = line.split(" ", 2);

        if (parameter.length == 2) {
            return parameter[1];
        }
        else {
            return "";
        }
    }

    public String getCommand(String line) {
        String[] command = line.split(" ");

        return command[0];
    }
}
