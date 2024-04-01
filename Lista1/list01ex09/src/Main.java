import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um valor em Km");
        System.out.println("A conversão em Mi é: " + read.nextDouble() / 1.609);
    }
}