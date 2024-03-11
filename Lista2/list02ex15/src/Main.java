import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;
        double tc = 0;
        int op;

        System.out.println("Insira o dinheiro");
        n1 = read.nextDouble();
        System.out.printf(
                "Opções de bebidas: %n" +
                "1. Café expresso = R$ 0,50 %n" +
                "2. Café Longo    = R$ 1,00 %n" +
                "3. Capuccino     = R$ 2,50 %n" +
                "4. Chocolate     = R$ 2,00 %n"
        );
        op = read.nextInt();
        if (op < 1 || op > 4){
            System.out.println("Opção inválida");
        }
        if (op == 1 && (tc = n1 - 0.5) >= 0) {
            System.out.println("Bebida selecionada: Café expresso");
            System.out.println("Seu troco: R$" + tc);
        }
        if (op == 2 && (tc = n1 - 1) >= 0) {
            System.out.println("Bebida selecionada: Café Longo");
            System.out.println("Seu troco: R$" + tc);
        }
        if (op == 3 && (tc = n1 - 2.5) >= 0) {
            System.out.println("Bebida selecionada: Capuccino");
            System.out.println("Seu troco: R$" + tc);
        }
        if (op == 4 && (tc = n1 - 2) >= 0) {
            System.out.println("Bebida selecionada: Chocolate");
            System.out.println("Seu troco: R$" + tc);
        }
        if (tc < 0){
            System.out.printf("Saldo insuficiente %n" + "Seu troco: R$" + n1);
        }
    }
}