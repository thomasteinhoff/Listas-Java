import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int n2;
        int i;

        System.out.println("Informe dois números");
        n1 = read.nextInt();
        n2 = read.nextInt();

        if (n1 > n2){
           for (i=n2; i<=n1; i++)
               System.out.println(i);
        } else if (n1 < n2){
            for (i=n1; i<=n2; i++)
                System.out.println(i);
        }
    }
}