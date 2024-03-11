import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;

        System.out.println("Informe um valor");
        n1 = read.nextDouble();
        n1 = n1 % 2;
        if (n1 > 0){
            System.out.println("É impar");
        } else {
            System.out.println("É par");
        }
    }
}