import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int i;

        System.out.println("Informe um número");
        n1 = read.nextInt();

        for (i=1; i<=10; i++){
            System.out.printf(n1 + " x " + i + " = " + n1*i + "%n");
        }
    }
}