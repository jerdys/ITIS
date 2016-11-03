import java.util.Scanner;

public class Task4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line: ");
        String s = sc.nextLine();
        checkString(s);
        
    }

    public static void checkString(String s) {
        int k = 0;

        for (char symbol : s.toCharArray()){
            if (symbol == ')') {
                k--;
            }
            else if (symbol == '(') {
                k++;
            }
            else if (k < 0) {
                break;
            }
        }

        if (k != 0) {
            System.out.println("Brackets in \"" + s + "\" are placed incorrectly");
        } 
        else {
            System.out.println("Brackets in \"" + s + "\" are placed correctly");
        }
    }

}
