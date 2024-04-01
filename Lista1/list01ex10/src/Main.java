import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um valor em Mi");
        System.out.println("A conversão em Km é: " + read.nextDouble() * 1.609);
    }
}