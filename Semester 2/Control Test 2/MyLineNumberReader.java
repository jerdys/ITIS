package MyLineNumberReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jerdys on 10.05.17.
 */

public class MyLineNumberReader {
    private FileReader fr;
    private int lineNumber = 0;
    private String filePath;
    private BufferedReader bufferedReader;

    public MyLineNumberReader(FileReader fr, String fileName) {
        this.fr = fr;
        this.filePath = fileName;
        String encoding = "UTF-8";
        File file = new File(fileName);

        if (file.isFile() && file.exists()) {
            InputStreamReader read;

            try {
                read = new InputStreamReader(new FileInputStream(file), encoding);
                this.bufferedReader = new BufferedReader(read);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    public String readLine() {
        int num = 0;
        ArrayList characters = new ArrayList();
        //List<Character> line = new ArrayList<>();
        char line = 0;
        String finished = "";
        int tmp;

        try {
            while ((num = fr.read()) != -1) {
                if (num == '\r') {
                    continue;
                }
                else if (num == '\n') {
                    lineNumber++;

                    for (int i = 0; i < characters.size(); i++) {
                        //System.out.println(characters.get(i));
                        tmp = Integer.parseInt(characters.get(i).toString());
                        line = (char) tmp;
                        finished += line;
                    }

                    return finished;
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

    public void close() {
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber=lineNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}