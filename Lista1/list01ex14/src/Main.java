import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;
        double num2;
        double num3;

        System.out.println("Digite a base de um triângulo retângulo");
        num1 = read.nextInt();
        System.out.println("Digite a altura");
        num2 = read.nextInt();
        num3 = (num1 * num2) / 2;
        System.out.println("A area do triângulo retângulo é: " + num3);
    }
}