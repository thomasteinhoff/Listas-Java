import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num1;

        System.out.println("Digite um número");
        num1 = read.nextInt();
        num1 = num1 * 2;
        System.out.println("O dobro do número é: " + num1);
    }
}