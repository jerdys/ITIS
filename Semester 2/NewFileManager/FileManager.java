package NewFileManager;

import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) throws IOException {
        Commands commands = new Commands();
        Scanner sc = new Scanner(System.in);

        //System.out.println(commands.getParameter("cd ~"));
        commands.cd("cd ~");
    }
}
