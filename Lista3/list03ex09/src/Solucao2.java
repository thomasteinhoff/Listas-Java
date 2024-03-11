import java.util.Scanner;

public class Solucao2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int res;
        int replay = 1;
        boolean ans = true;
        int n1 = 1;
        int n2 = 1;

        while (replay == 1) {
            while (ans){
                System.out.println(n1 + " * " + n2 + " = ?");
                res = read.nextInt();

                if (res == (n1 * n2)) {
                    System.out.println("Acertou !");
                }
                else {
                    ans = false;
                }

                if (n2 >= 10){
                    if (n1 >= 10){
                        System.out.println("Parabéns");
                        break;
                    }
                    n1++;
                    n2 = 1;
                } else
                    n2++;
            }
            System.out.printf("Errou ! %n" + "Jogar denovo? %n" + "1 = Sim %n" + "0 = Não %n");
            replay = read.nextInt();
            ans = true;
        }
    }
}