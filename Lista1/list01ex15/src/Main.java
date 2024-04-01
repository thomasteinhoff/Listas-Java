import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;

        System.out.println("Digite o raio de um cilíndro");
        n1 = Math.pow(read.nextDouble(),2) * Math.PI;
        System.out.println("Digite a altura");
        System.out.println("O volume do cilíndro é: " + (n1* read.nextDouble()));
    }
}