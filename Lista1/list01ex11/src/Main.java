import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;

        System.out.println("Digite uma temperatura em Cº");
        num1 = read.nextInt();
        num1 = (num1 * 9 / 5) + 32;
        System.out.println("O valor em Fº é: " + num1);
    }
}