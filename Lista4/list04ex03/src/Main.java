import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int [] lista = {1,2,3,4,5,6,7,8,9,10};
        boolean j = false;

        System.out.println("Digite um número");
        int n1 = read.nextInt();

        for (int i=0; i<lista.length; i++) {
            if (lista[i] == n1) {
                System.out.println("Valor " + n1 + " encontrado no endereço " + i);
                j = true;
                break;
            }
        }

        if (!j)
            System.out.println("Valor não encontrado");
    }
}