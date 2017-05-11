package MyLineNumberReader;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by jerdys on 10.05.17.
 */

public class MyLineNumberReader {
    private FileReader fr;
    private int lineNumber = 0;
    private String filePath;
    private BufferedReader bufferedReader;
    private int skipCounter;

    public MyLineNumberReader(FileReader fr, String path) {
        this.fr = fr;
        this.filePath = path;
        File file = new File(path);

        if (file.isFile() && file.exists()) {
            try (InputStreamReader read = new InputStreamReader(new FileInputStream(file))) {
                this.bufferedReader = new BufferedReader(read);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int read() {
        try {
            int lineTxt;

            while ((lineTxt = this.bufferedReader.read()) != 0) {
                return lineTxt;
            }
        } catch (Exception e) {
            System.out.println("Error reading content from file");
            e.printStackTrace();
        }

        return -1;
    }

    public String readLine() {
        int num = 0;
        ArrayList characters = new ArrayList();
        //List<Character> line = new ArrayList<>();
        char line = 0;
        String finishedLine = "";
        int tmp;

        try {
            while ((num = fr.read()) != -1) {
                if (num == '\n') {
                    lineNumber++;

                    for (int i = 0; i < characters.size(); i++) {
                        //System.out.println(characters.get(i));
                        tmp = Integer.parseInt(characters.get(i).toString());
                        line = (char) tmp;
                        finishedLine += line;
                    }

                    return finishedLine;
                }
                else {
                    characters.add(num);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

            return null;
        }

        if (characters.size() > 0) {
            lineNumber++;

            Character.toString(line);
        }

        return null;
    }

    public void close() {
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void skip(long n) {
        if (n > 0) {
            //UNIMPLEMENTED
        }
        else {
            throw new IllegalArgumentException("Value must be positive");
        }
    }

    //SETTERS & GETTERS
    public void setLineNumber(int lineNumber) {
        this.lineNumber=lineNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
