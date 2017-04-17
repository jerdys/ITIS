package NewFileManager;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CommandsManager {
    Commands commands = new Commands();
    String line, command;
    File item;
    Scanner sc = new Scanner(System.in);
    boolean clause1 = true, clause2 = true;

    public void start() throws IOException, FileManagerException {
        while (true) {
            line = sc.nextLine();
            item = new File(commands.getParameter(line));
            command = commands.getCommand(line);

            switch(command) {
                case "cd":
                    commands.cd(item.toString());
                    break;

                case "ls":  //DONE
                    commands.ls(item.toString(), !clause1, !clause2);
                    break;

                case "ls -l":
                    commands.ls(item.toString(), clause1, !clause2);
                    break;

                case "ls -a":   //DONE
                    commands.ls(item.toString(), !clause1, clause2);
                    break;

                case "ls -la":
                    commands.ls(item.toString(), clause1, clause2);
                    break;

                case "rm":
                    commands.rm(item.toString());
                    break;

                case "rm -r":
                    commands.rm(item.toString(), clause1);
                    break;

                case "rm -f":
                    commands.rm(item.toString(), !clause1);
                    break;

                case "mv":
                    commands.mv(item.toString());
                    break;

                case "cp":
                    commands.cp(item.toString());
                    break;

                case "":

            }

            if (commands.getCurrentDirectory() != "") {
                System.out.println(">" + commands.getCurrentDirectory());
            }
        }
    }
}
