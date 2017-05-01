package FileManager;

import java.io.IOException;

public class FileManager {
    public static void main(String[] args) throws IOException, FileManagerException {
        CommandsManager cm = new CommandsManager();
        cm.start();
    }
}
