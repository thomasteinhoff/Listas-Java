import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;

        System.out.println("Informe um valor");
        n1 = read.nextInt();

        if (n1 >= 5 && n1 <= 9){
            System.out.println("Valor válido !");
        } else {
            System.out.println("Valor inválido !");
        }
    }
}