package NewFileManager;

import java.io.File;
import java.io.IOException;

public class Commands {
    private final String HOME_DIRECTORY = System.getProperty("user.home");
    private String currentDirectory = "";

    public void cd(String path) throws IOException {
        File absolutePath = new File(getParameter(path));
        File relativePath;

        if (getParameter(path).toCharArray()[0] == 126) {
            currentDirectory = HOME_DIRECTORY;
            System.out.println(currentDirectory);
        }
        else if (checkIfAbsolute(getParameter(path))) {
            if (absolutePath.isDirectory()) {
                currentDirectory = absolutePath.toString();
                System.out.println(currentDirectory);
            }
            else if (!absolutePath.isDirectory()) {
                System.out.println("Cannot find this path");
            }
        }
        else {
            relativePath = absolutePath;

            //USE @PARAM LS TO CHECK FILES IN DIRECTORY
            //IF IT CONTAINS relativePath THEN TRUE
        }
    }

    public boolean checkIfAbsolute(String path) {
        if (path.contains("\\")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void ls(String path) {

    }

    public String getParameter(String path) {
        String[] parameter = path.split(" ", 2);
        return parameter[1];
    }
}
