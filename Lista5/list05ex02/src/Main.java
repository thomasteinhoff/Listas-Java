import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insert a number: ");
        int n1 = read.nextInt();
        System.out.println(res(n1));
    }

    static int res(int n1) {
        if (n1 == 1)
            return n1;
        return n1*res(n1-1);
    }
}