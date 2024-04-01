import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um valor em polegadas");
        System.out.println("A conversão em milímetros é: " + read.nextDouble() * 25.4);
    }
}