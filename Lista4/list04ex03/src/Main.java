import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int [] lista = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Digite um número");
        int n1 = read.nextInt();

        if  (n1 >= 0 && n1 <= 9)
            System.out.println("Valor na posição " + n1 + ": " + lista[n1]);
        else
            System.out.println("Valor não encontrado");
    }
}