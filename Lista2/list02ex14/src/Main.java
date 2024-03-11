import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;
        double n2;
        double res;
        int op;

        System.out.println("Digite valor da compra");
        n1 = read.nextDouble();
        System.out.printf(
                "Qual a forma de pagamento? %n" +
                "Pix     = 1 %n" +
                "Débito  = 2 %n" +
                "Crédito = 3 %n" +
                "Crébito = █ %n"
        );
        op = read.nextInt();
        if (op != 1 && op != 2){
            System.out.printf("Crédito selecionado %n" + "Quantas parcelas? %n");
            n2 = read.nextInt();
            if (n2 < 5){
                n2 *= (n1 * 0.02);
                System.out.println("Valor final da coxmpra: $" + (n1 + n2));
            }
            if (n2 >= 5){
                res = n1 * pow((1+0.05),n2);
                System.out.println("Valor final da compra: $" + res);
            }
        } else {
            if (op == 1){
                System.out.println("Pix selecionado");
                System.out.println("Valor final da compra: $" + (n1 * 0.9));
            }
            if (op == 2){
                System.out.println("Débito selecionado");
                System.out.println("Valor final da compra: $" + (n1 * 0.95));
            }
        }
    }
}