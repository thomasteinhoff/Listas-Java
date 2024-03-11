import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;

        System.out.println("Informe um número");
        n1 = read.nextInt();

        if (n1 >= 1){
            System.out.println("O quadrado de " + n1 + " é: " + (n1 *= n1));
        } else {
            System.out.println("Valor inválido");
        }
    }
}