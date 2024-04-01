import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;
        System.out.println("Digite a base de um triângulo retângulo");
        n1 = read.nextInt();
        System.out.println("Digite a altura");
        System.out.println("A area do triângulo retângulo é: " + ((n1*read.nextDouble())/2));
    }
}