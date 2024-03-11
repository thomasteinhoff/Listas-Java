import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("Informe dois números (em duas respostas)");
        n1 = read.nextDouble();
        n2 = read.nextDouble();

        if(n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        } else {
            if (n1 == n2){
                System.out.println(n1 + " é igual a " + n2);
            } else {
                System.out.println(n2 + " é maior que " + n1);
            }
        }
    }
}