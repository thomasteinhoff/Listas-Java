import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;
        double num2;
        double num3;

        System.out.println("Ditige o valor de a numa euqação de primeiro grau");
        num1 = read.nextDouble();
        System.out.println("Digite o valor de b numa equação de primeiro grau");
        num2 = read.nextDouble();
        num3 = (0 - num2) / num1;
        System.out.println("O valor de X é: " + num3);
    }
}