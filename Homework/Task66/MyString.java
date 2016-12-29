package Task66;

import java.util.ArrayList;
import java.util.Arrays;

/*
 *  Realisation of my own String class
 *
 *  @value characters is used to contain characters, obviously
 *
 *  @param MyString initializes the value of variable characters
 *  @param concatenate appends the string with another string
 *      @return only one appended string
 *  @param toCharArray converts the string into a char array
 *  @param charAt
 *      @return the index of character in string
 *  @param substr
 *      @return the string that contains in MyString
 *      @value start declares the index of first character of substring
 *      @value length declares the index of last character of substring
 *  @param indexOf
 *      @return the index of first appearance of entered symbol
 *  @param split divides the string into two between the entered symbol
 *
 *
 *  @version 1.1
 *  @author jerdys
 */

public class MyString {
    private char[] characters;

    public MyString(String characters) {
        this.characters = characters.toCharArray();
    }

    public MyString() {
        this.characters = new char[0];
    }

    public MyString(char[] characters) {
        this.characters = characters;
    }

    public MyString(int size) {
        this.characters = new char[size];
    }

    MyString concatenate(MyString string){
        int newLength = string.length();

        if (newLength == 0) {
            return this;
        }

        int length = characters.length;
        char[] temp = Arrays.copyOf(characters, length + newLength);
        System.arraycopy(string.characters, 0, temp, length, newLength);
        return new MyString(temp);
    }

    public char[] toCharArray() {
        return this.characters;
    }

    public char charAt(int index) throws StringIndexOutOfBoundsException{
        if ((index < 0) || (index >= characters.length)) {
            throw new StringIndexOutOfBoundsException(index);
        }

        return characters[index];
    }

    public MyString substr(int start, int length) {
        String string = "";

        for (int i = 0; i < length; i++) {
            string += this.characters[start + i];
        }

        return new MyString(string);
    }

    public int indexOf(MyString string) {
        int length = characters.length;
        int counter = 0;

        for (int i = 0; i < length; i++) {
            if (characters[i] != string.characters[0]) {
                continue;
            }

            for (int j = 0; j < string.characters.length; j++) {
                if (i + j < length && characters[i + j] == string.characters[j]) {
                    counter++;
                }
                else {
                    break;
                }
            }

            if (counter == string.characters.length) {
                return i;
            }
            else {
                counter = 0;
            }
        }
        return -1;
    }

    MyString[] split(char delimiter) {
        ArrayList<MyString> list = new ArrayList<>();
        int start = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == delimiter) {
                if (start != i) {
                    list.add(substr(start, i - start));
                }
                start = i + 1;
            }
            else if (i == characters.length - 1) {
                list.add(substr(start, i - start + 1));
            }
        }

        MyString[] splitted = new MyString[list.size()];
        return list.toArray(splitted);
    }

    @Override
    public String toString() {
        return new String(characters);
    }

    public int length() {
        return this.characters.length;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        MyString string = (MyString) object;

        return Arrays.equals(characters, string.characters);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(characters);
    }

}