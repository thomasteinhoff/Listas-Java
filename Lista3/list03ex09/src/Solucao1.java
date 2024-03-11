import java.util.Scanner;
import java.util.Random;

public class Solucao1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random gen = new Random();

        int res;
        int replay = 1;
        boolean ans = true;
        int n1;
        int n2;

        while (replay == 1) {
            while (ans){
                n1 = gen.nextInt(11);
                n2 = gen.nextInt(11);
                if (n1 == 0)
                    n1++;
                if (n2 == 0)
                    n2++;

                System.out.println(n1 + " * " + n2 + " = ?");
                res = read.nextInt();

                if (res == (n1 * n2)) {
                    System.out.println("Acertou !");
                }
                else {
                    ans = false;
                }
            }
            System.out.printf("Errou ! %n" + "Jogar denovo? %n" + "1 = Sim %n" + "0 = Não %n");
            replay = read.nextInt();
            ans = true;
        }
    }
}