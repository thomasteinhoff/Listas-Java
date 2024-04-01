import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Digite a velocidade inicial");
        n1 = read.nextDouble();
        System.out.println("Digite a aceleração");
        n2 = read.nextDouble();
        System.out.println("Digite o tempo de percurso");
        n3 = read.nextDouble();
        System.out.println("A velociade é de: " + (n1+n2*n3));
    }
}