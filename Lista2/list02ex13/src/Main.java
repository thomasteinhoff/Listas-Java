import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;
        double n2;
        double res;
        int op;

        System.out.printf(
                "Escolha uma forma: %n" +
                " Círculo             = 1 %n" +
                " Triângulo Retângulo = 2 %n" +
                " Retângulo           = 3 %n"
        );
        op = read.nextInt();

        if (op == 1){
            System.out.println("Informe o raio");
            n1 = read.nextDouble();
            System.out.printf(
                    "A area é de: " + PI*pow(n1,2) + "%n" +
                    "A circunferência é de: " + 2*PI*n1
            );
        }
        if (op == 2){
            System.out.println("Informe a base");
            n1 = read.nextDouble();
            System.out.println("Informa a altura");
            n2 = read.nextDouble();
            res = (pow(n1,2) + pow(n2,2));
            System.out.printf(
                    "A area é de: " + (n1 * n2) / 2 + "%n" +
                    "O perímetro é de: " + sqrt(res)
            );
        }
        if (op == 3){
            System.out.println("Informe a base");
            n1 = read.nextDouble();
            System.out.println("Informa a altura");
            n2 = read.nextDouble();
            System.out.printf(
                    "A area é de: " + (n1 * n2) + "%n" +
                    "O perímetro é de: " + (n1 + n2) * 2
            );
        }
        if (op < 1 || op > 3){
            System.out.println("Algo deu errado");
        }
    }
}