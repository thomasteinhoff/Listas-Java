import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1, n2;

        System.out.println("Ditige o valor de a numa euqação de primeiro grau");
        n1 = read.nextDouble();
        System.out.println("Digite o valor de b numa equação de primeiro grau");
        n2 = read.nextDouble();
        System.out.println("O valor de X é: " + ((0 - n2) / n1));
    }
}