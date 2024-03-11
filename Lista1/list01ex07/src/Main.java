import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;

        System.out.println("Digite um valor em milímetros");
        num1 = read.nextInt();
        num1 = num1 / 25.4;
        System.out.println("A conversão em polegadas é: " + num1);
    }
}