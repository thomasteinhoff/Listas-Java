import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite uma velocidade em Km/h");
        System.out.println("A conversão para m/s é: " + read.nextDouble() / 3.6);
    }
}