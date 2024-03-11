import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num1;

        System.out.println("Digite um número");
        num1 = read.nextInt();
        num1 = num1 / 5;
        System.out.println("Um quinto desse número é: " + num1);
    }
}