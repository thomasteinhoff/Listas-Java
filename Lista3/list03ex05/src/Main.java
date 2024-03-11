import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int i;

        System.out.println("Informe um número");
        n1 = read.nextInt();
        i = n1;

        while (i>1) {
            i -= 1;
            n1 *= i;
        }

        System.out.println(n1);
    }
}