package MyLineNumberReader;

import java.io.*;

/**
 * Created by jerdys on 10.05.17.
 */

public class MyLineNumberReaderTestDrive {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/home/jerdys/IdeaProjects/Informatics-1/Semester 2/" +
                "MyLineNumberReader/test.txt");
        MyLineNumberReader numberReader = new MyLineNumberReader(reader, "/home/jerdys/IdeaProjects/" +
                "Informatics-1/Semester 2/MyLineNumberReader/test.txt");

        System.out.println(numberReader.readLine());
        System.out.println(numberReader.readLine());
        System.out.println(numberReader.readLine());
        System.out.println(numberReader.getLineNumber());
    }
}
