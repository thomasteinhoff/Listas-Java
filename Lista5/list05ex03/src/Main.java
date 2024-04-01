import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insert a number to be powered: ");
        int n1 = read.nextInt();
        System.out.println("Insert its expoent: ");
        System.out.println(res(n1,read.nextInt()));
    }

    public static double res(int n1, int n2) {
        if (n2 == 1)
            return n1;
        return n1*res(n1, n2-1);
    }
}