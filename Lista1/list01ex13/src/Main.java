import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;

        System.out.println("Digite o raio de um circulo");
        num1 = read.nextInt();
        num1 = num1 * num1 * 3.141592653;
        System.out.println("A área do circulo é: " + num1);
    }
}