import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Cº");
        System.out.println("O valor em Fº é: " + ((read.nextDouble()*9/5)+32));
    }
}