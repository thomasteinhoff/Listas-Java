import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        int n4 = 0;

        System.out.println("Informe três lados de um triângulo");
        n1 = read.nextDouble();
        n2 = read.nextDouble();
        n3 = read.nextDouble();

        if (
                n1 >= (n2 + n3) &&
                n2 >= (n1 + n3) &&
                n3 >= (n1 + n2) &&
                n1 <= (n2 - n3) &&
                n2 <= (n1 - n3) &&
                n3 <= (n1 - n2)
        ) {
            System.out.println("Triângulo inválido!");
        } else {
            if (n1 == n2 && n1 == n3){
                n4 = 1;
                System.out.println("Esse é um triângulo equilátero");
            }
            if (n1 != n2 && n1 != n3) {
                n4 = 1;
                System.out.println("Esse é um triângulo escaleno");
            }
            if (n4 == 1){
                System.out.println(("Esse é um triângulo isóceles"));
            }
        }
    }
}