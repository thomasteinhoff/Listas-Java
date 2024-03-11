import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;
        double num2;
        double num3;

        System.out.println("Digite a primeira nota");
        num1 = read.nextDouble();
        System.out.println("Digite a segunda nota");
        num2 = read.nextDouble();

        num3 = ((num1 * 1) + (num2 * 2)) / 3;

        System.out.println("A media é: " + num3);
    }
}