package Task66;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyString string = new MyString("Test");

        System.out.println(string.charAt(1));
        System.out.println(new MyString("Some text here"));
        System.out.println(string.equals(new MyString("T E X T")));

        string = string.concatenate(new MyString("This text will be added"));

        System.out.println(string);
        System.out.println(string.toCharArray());


        System.out.println(string.equals(new MyString("TestThis text will be added")));
        System.out.println(string.indexOf(new MyString("i")));
        System.out.println(string.length());

        string = new MyString("EXAAAAAAAAAAAMPLLEEEE");

        System.out.println(Arrays.toString(string.split('M')));
        System.out.println(string.substr(0,4));
    }

}