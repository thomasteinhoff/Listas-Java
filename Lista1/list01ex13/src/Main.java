import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o raio de um circulo");
        System.out.println("A área do circulo é: " + ((Math.pow(read.nextDouble(), 2))*Math.PI));
    }
}