import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1;
        double num2;
        double num3;
        double num4;

        System.out.println("Digite a velocidade inicial");
        num1 = read.nextDouble();
        System.out.println("Digite a aceleração");
        num2 = read.nextDouble();
        System.out.println("Digite o tempo de percurso");
        num3 = read.nextDouble();
        num4 = num1 + num2 * num3;
        System.out.println("A velociade é de: " + num4);
    }
}