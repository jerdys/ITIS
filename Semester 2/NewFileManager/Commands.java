package NewFileManager;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class Commands {
    private final String HOME_DIRECTORY = System.getProperty("user.home");
    private String currentDirectory = "";
    boolean r = false, w = false, x = false;
    String readable, writable, executable;
    double size;

    public void cd(String path) throws IOException {
        File absolutePath = new File(path);
        File relativePath;

        if (absolutePath.toString().toCharArray()[0] == 126) {
            setCurrentDirectory(HOME_DIRECTORY);
        }
        else if (absolutePath.toString().toCharArray()[0] == 47) {
            if (absolutePath.isDirectory()) {
                setCurrentDirectory(absolutePath.toString());
            }
            else {
                System.out.println("Path not found");
            }
        }
        else if (absolutePath.toString().toCharArray()[0] == 46 && absolutePath.toString().toCharArray()[1] == 46) {
            File parentFolder = new File(getCurrentDirectory());
            setCurrentDirectory(parentFolder.getParent());
        }
        else {
            relativePath = absolutePath;
            File toAbsolutePath = new File(getCurrentDirectory() + "/" + relativePath);

            if (toAbsolutePath.isDirectory()) {
                setCurrentDirectory(toAbsolutePath.toString());
            }
            else {
                System.out.println("Path not found");
            }
        }
    }

    public void ls(String path, boolean clause1, boolean clause2) {
        File dir = new File(getCurrentDirectory());

        if (!clause1) {
            if (!clause2) {
                for (File item : dir.listFiles()) {
                    if (item.isDirectory() && !item.isHidden()) {
                        System.out.println("<DIR> \t\t" + item.getName());
                    }
                    else if (!item.isDirectory() && !item.isHidden()) {
                        System.out.println("<FILE>\t\t" + item.getName());
                    }
                }
            }
            else {
                for (File item : dir.listFiles()) {
                    if (item.isDirectory()) {
                        System.out.println("<DIR> \t\t" + item.getName());
                    }
                    else {
                        System.out.println("<FILE>\t\t" + item.getName());
                    }
                }
            }
        }
        else if (clause1) {
            if (!clause2) {
                for (File item : dir.listFiles()) {
                    r = item.canRead();
                    w = item.canWrite();
                    x = item.canExecute();

                    if (r) {
                        readable = "r";
                    }
                    else {
                        readable = "-";
                    }
                    if (w) {
                        writable = "w";
                    }
                    else {
                        writable = "-";
                    }
                    if (x) {
                        executable = "x";
                    }
                    else {
                        executable = "-";
                    }

                    if (item.isDirectory() && !item.isHidden()) {
                        File directory = new File(item.getAbsolutePath());
                        size = folderSize(directory);
                        System.out.println("<DIR>\t\t" + readable + writable + executable + "\t\t"
                                + parseSize(size) + "\t\t" + item.getName());
                    }
                    else if (!item.isDirectory() && !item.isHidden()) {
                        size = item.length();
                        System.out.println("<FILE>\t\t" + readable + writable + executable + "\t\t"
                                + parseSize(size) + "\t\t" + item.getName());
                    }
                }
            }
            else {
                for (File item : dir.listFiles()) {
                    r = item.canRead();
                    w = item.canWrite();
                    x = item.canExecute();

                    if (r) {
                        readable = "r";
                    }
                    else {
                        readable = "-";
                    }
                    if (w) {
                        writable = "w";
                    }
                    else {
                        writable = "-";
                    }
                    if (x) {
                        executable = "x";
                    }
                    else {
                        executable = "-";
                    }

                    if (item.isDirectory()) {
                        File directory = new File(item.getAbsolutePath());
                        size = folderSize(directory);
                        System.out.println("<DIR>\t\t" + readable + writable + executable + "\t\t"
                                + parseSize(size) + "\t\t" + item.getName());
                    }
                    else {
                        size = item.length();
                        System.out.println("<FILE>\t\t" + readable + writable + executable + "\t\t"
                                + parseSize(size) + "\t\t" + item.getName());
                    }
                }
            }
        }

    }

    public void rm(String item) {
        File file;

        if (item.toCharArray()[0] != '/') {
            file = new File(getCurrentDirectory() + "/" + item);
        }
        else {
            file = new File(item);
        }

        if (file.isFile()) {
            file.delete();
            System.out.println(file + " was deleted");
        }
        else {
            System.out.println("rm command doesn't delete directories. " + "\n" +
                    "Use 'rm -r' if you want to delete a directory");
        }
    }

    public void rm(String item, boolean clause) throws IOException {
        File file;
        File testFile = new File(item);

        if (clause) {
            if (item.toCharArray()[0] != '/') {
                file = new File(getCurrentDirectory() + "/" + item);
            }
            else {
                file = new File(item);
            }

            recursiveDeletion(file);
        }
        else {

        }
    }

    public void mv(String file, String moveTo) {

    }

    public void cp(String file) {

    }

    public boolean checkIfAbsolute(String path) {
        if (path.contains("\\") || path.contains("/")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void printCurrentDirectory() {
        System.out.println(getCurrentDirectory());
    }

    public String textAlign() {
        //TODO method will align the text for when ls is called
        return null;
    }

    public void recursiveDeletion(File folder) {
        for (File item : folder.listFiles()) {
            if (item.isFile()) {
                item.delete();
                System.out.println(item + " was deleted");
            }
            else {
                recursiveDeletion(item);
            }

            folder.delete();
            System.out.println(folder + " was deleted");
        }
    }

    public long folderSize(File directory) {
        long length = 0;
        for (File item : directory.listFiles()) {
            if (item.isFile())
                length += item.length();
            else
                length += folderSize(item);
        }

        return length;
    }

    public String parseSize(double size) {
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String finalSize = Double.toString(size);
        int divideCounter = 0;

        while ((int) size > 0) {
            size /= 1024;
            divideCounter += 1;
        }

        size *= 1024;

        String roundedSize = decimalFormat.format(size);
        divideCounter -= 1;
        //System.out.println(divideCounter);

        switch (divideCounter) {
            case -1:
                finalSize = roundedSize + " bytes";
                break;

            case 0:
                finalSize = roundedSize + " bytes";
                break;

            case 1:
                finalSize = roundedSize + " KBytes";
                break;

            case 2:
                finalSize = roundedSize + " MBytes";
                break;

            case 3:
                finalSize = roundedSize + " GBytes";
                break;
        }

        return finalSize;

    }

    public String getParameter(String line) {
        String parameter = line.replace(getCommand(line) + " ", "");
        return parameter;

        /*String[] parameter = line.split(" ", 2);
        String str = "";

        if (parameter.length == 1) {
            return "";
        }
        else if (parameter.length == 2) { //  && parameter[1].toCharArray()[0] != '-'
            return parameter[1];
        }
        else if (parameter.length > 2) {
            for (int i = 1; i < parameter.length; i++) {
                str += parameter[i];
            }

            return str;
        }
        else {
            return "";
        }*/
    }

    public String getCommand(String line) {
        String[] array = line.split(" ");

        if (array.length <= 1) {
            return "";
        }
        else if (array[1].toCharArray()[0] == '-') {
            return array[0] + " " + array[1];
        }
        else {
            return array[0];
        }

        /*String[] command = line.split(" ", 2);

        if (command.length == 1) {
            return "";
        }
        if (command.length == 2) {
            if (command[1].toCharArray()[0] == '-') {
                return command[0] + " " + command[1];
            }
            else {
                return command[0];
            }
        }
        else {
            return command[0];
        }*/
    }

    public void setCurrentDirectory(String currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    public String getCurrentDirectory() {
        return currentDirectory;
    }

    public String[] getFilesInDirectory(String dir) {
        File folder = new File(dir);
        File[] fileList = folder.listFiles();
        String[] filesInDirectory = new String[fileList.length];

        for (int i = 0; i < fileList.length; i++) {
            filesInDirectory[i] = fileList[i].toString();
        }

        return filesInDirectory;
    }
}
