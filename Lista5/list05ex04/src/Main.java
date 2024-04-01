import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insert a word or phrase: ");
        char [] string = read.nextLine().toCharArray();
        System.out.println(palicheck(string, 0));
    }

    public static String palicheck(char [] string, int i) {
        if (i < string.length) {
            if (string[i] == string[string.length - i - 1])
                return palicheck(string, (i+1));
            else
                return "It isn't a palindrome";
        } else
            return "It is a palindrome";
    }
}