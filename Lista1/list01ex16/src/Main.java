import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;
        int num2;
        double num3;

        System.out.println("Digite o raio de um cone");
        num1 = read.nextInt();
        num1 = num1 * num1 * 3.141592653;
        System.out.println("Digite a altura");
        num2 = read.nextInt();
        num3 = (num1 * num2) / 3;
        System.out.println("O volume do cone é: " + num3);
    }
}