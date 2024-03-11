import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int n4;

        System.out.println("Informe duas notas");
        n1 = read.nextInt();
        n2 = read.nextInt();

        n3 = (n1 + n2)/2;

        if (n3 >= 50){
            System.out.println("Passou !");
        } else {
            System.out.println("Informe a nota da recuperação");
            n4 = read.nextInt();
            n3 = (n3 + n4)/2;

            if (n3 >= 50){
                System.out.println("Passou !");
            } else {
                System.out.println("Reprovou !");
            }
        }
    }
}