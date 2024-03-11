import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;

        System.out.println("Digite um valor em Km");
        num1 = read.nextInt();
        num1 = num1 / 1.609;
        System.out.println("A conversão em Mi é: " + num1);
    }
}