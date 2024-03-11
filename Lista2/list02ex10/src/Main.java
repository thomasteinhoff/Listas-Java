import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int pos;

        System.out.println("Informe três número aleatórios");
        n1 = read.nextInt();
        n2 = read.nextInt();
        n3 = read.nextInt();

        if (n1 > n2) {
            pos = n1;
            n1 = n2;
            n2 = pos;
        }

        if (n2 > n3) {
            pos = n2;
            n2 = n3;
            n3 = pos;
        }

        if (n1 > n2) {
            pos = n1;
            n1 = n2;
            n2 = pos;
        }

        System.out.println("A ordem crescente é: " + n1 + ", " + n2 + ", " + n3);
    }
}