import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;
        double num2;
        double num3;

        System.out.println("Digite o primeiro número");
        num1 = read.nextInt();
        System.out.println("Digite o segundo número");
        num2 = read.nextInt();
        num3 = (num1 + num2) / 2;
        System.out.println("A média dos dois é: " + num3);
    }
}