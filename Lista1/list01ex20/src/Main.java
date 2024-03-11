import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double a;
        double b;
        double c;
        double r1;
        double r2;

        System.out.println("Digite a primeira Raíz");
        r1 = read.nextDouble();
        System.out.println("Digite a segunda Raíz");
        r2 = read.nextDouble();

        a = 1;
        b = -(r1 + r2);
        c = r1 * r2;

        System.out.printf("a = %.0f %n", a);
        System.out.printf("A equação é: %.0f", a);
        System.out.printf("x² + %.0f", b);
        System.out.printf("x + %.0f", c);
        System.out.printf(" = 0");
    }
}