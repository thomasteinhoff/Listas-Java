import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;

        System.out.println("Digite uma velocidade em Km/h");
        num1 = read.nextDouble();
        num1 = num1 / 3.6;
        System.out.println("A conversão para m/s é: " + num1);
    }
}