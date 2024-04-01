import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;

        System.out.println("Digite a primeira nota");
        n1 = read.nextDouble();
        System.out.println("Digite a segunda nota");
        System.out.println("A media é: " + (((read.nextDouble()*2)+n1)/3));
    }
}