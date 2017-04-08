package FileManager;

import java.io.File;
import java.util.ArrayList;

//TODO: cd                                                      #DONE (partly, not full)
//TODO: cd ~                                                    #
//TODO: ls
//TODO: ls -l (rwx)
//TODO: ls -l translate bytes in KBytes, MBytes, GBytes
//TODO: rm
//TODO: rm -r
//TODO: rm -f
//TODO: mv
//TODO: mv (renaming)
//TODO: cp

public class Commands {
    private File homeDirectory =  new File(System.getProperty("user.home"));
    private String currentDirectory = "";
    private ArrayList<String> containedFiles = new ArrayList<String>();
    //CommandsManager cm = new CommandsManager();

    public void cd(File path) {
        if (path.isDirectory()) {
            setCurrentDirectory(path.toString());
        }
        else if (!path.isDirectory()){
            System.out.println("Cannot find this path");
        }
    }

    public void ls(String path) {
        File dir = new File(path);
        File fileList[] = dir.listFiles();
        int nl = 1;

        for (File item : dir.listFiles()) {
            if (item.isDirectory()) {
                System.out.println(nl + " <DIR> \t" + item.getName());
            }
            else {
                System.out.println(nl + " <FILE>\t" + item.getName());
            }

            nl++;
        }
    }

    public void printCurrentDirectory() {
        System.out.print(getCurrentDirectory() + ">");
    }

    public File getHomeDirectory() {
        return homeDirectory;
    }

    public void setCurrentDirectory(String currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    public String getCurrentDirectory() {
        return currentDirectory;
    }
}
