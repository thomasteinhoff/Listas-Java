import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;
        double n2;
        double res;
        int op;

        System.out.println("Digite o primeiro número");
        n1 = read.nextDouble();
        System.out.printf(
                "Escolha um operador matemático %n" +
                " + = 1 %n" +
                " - = 2 %n" +
                " . = 3 %n" +
                " / = 4 %n"
        );
        op = read.nextInt();
        System.out.println("Digite o segundo número");
        n2 = read.nextDouble();

        if (op == 1){
            res = n1 + n2;
            System.out.println("O resultado é: " + res);
        } if (op == 2){
            res = n1 - n2;
            System.out.println("O resultado é: " + res);
        } if (op == 3){
            res = n1 * n2;
            System.out.println("O resultado é: " + res);
        } if (op == 4){
            res = n1 / n2;
            System.out.println("O resultado é: " + res);
        } if (op < 1 || op > 4){
            System.out.println("Algo deu errado");
        }
    }
}