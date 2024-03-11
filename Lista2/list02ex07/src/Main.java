import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;

        System.out.println("Ditige o valor de a numa equação de segundo grau");
        a = read.nextDouble();
        System.out.println("Digite o valor de b numa equação de segundo grau");
        b = read.nextDouble();
        System.out.println("Digite o valor de c numa equação de terceiro grau");
        c = read.nextDouble();

        delta = ((b*b) - (4*a*c));
        x1 = ((-b) + sqrt(delta)) / (2*a);
        x2 = ((-b) - sqrt(delta)) / (2*a);

        if (x1 > 0){ // Δ > 0 = 2 raizes | Δ == 0 = 1 raiz | Δ < 0 = 0 raizes |
            System.out.println("A solução é: S = {" + x1 + ", " + x2);
        } else {
            System.out.println("A equação não possui raízes reais");
        }
    }
}