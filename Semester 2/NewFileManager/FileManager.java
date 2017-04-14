package NewFileManager;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) throws IOException {
        CommandsManager cm = new CommandsManager();
        cm.start();

        /*Scanner sc = new Scanner(System.in);
        *//*File file = new File("/home/jerdys/Android");*//*

        Commands commands = new Commands();

        while (true) {
            System.out.println(commands.getParameter(sc.nextLine()));
        }*/
        /*System.out.println(commands.getParameter("ls"));
        System.out.println(commands.getParameter("ls -l"));
        System.out.println(commands.getParameter("ls -a"));*//*

        *//*System.out.println(commands.getCommand("cd /home/jerdys"));
        System.out.println(commands.getCommand("ls"));
        System.out.println(commands.getCommand("ls -a"));
        System.out.println(commands.getCommand("ls -l"));
        System.out.println(commands.getCommand("ls -la"));*//*

        System.out.println(file.getAbsolutePath());*/
    }

    /*public static String[] getFilesInDirectory(String dir) {
        File file = new File(dir);
        File[] fileList = file.listFiles();
        String[] filesInDirectory = new String[fileList.length];

        for (int i = 0; i < fileList.length; i++) {
            filesInDirectory[i] = fileList[i].toString();
        }

        return filesInDirectory;
    }*/
}
