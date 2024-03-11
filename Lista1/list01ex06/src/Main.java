import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;

        System.out.println("Digite uma velocidade em m/s");
        num1 = read.nextFloat();
        num1 = num1 * 3.6;
        System.out.println("A conversão para Km/s é: " + num1);
    }
}