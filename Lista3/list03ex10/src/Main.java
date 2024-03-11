import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int max;
        int i;
        int j = 1, k = 0, l;

        System.out.println("Informe um número");
        max = read.nextInt();

        System.out.println("0");
        for (i=1; i<=(max-1); i++) {
            System.out.println(j);
            l = j + k;
            k = j;
            j = l;
        }
    }
}