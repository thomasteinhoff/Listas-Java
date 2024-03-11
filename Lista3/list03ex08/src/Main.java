import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;
        double i = 5;
        int def = 1;

        System.out.println("Informe um número");
        n1 = read.nextInt();

        if (n1 <= 1)                            // checks if n = 1
            def = 0;
        else if (n1 <= 3)                       // checks if n = 2 or 3
            def = 1;
        else if (n1 % 2 == 0 || n1 % 3 == 0)    // checks if n is divisible by 2 or 3
            def = 0;
        else {
            while (i <= (n1 /2)){                // checks if is divisible by 5 till is bigger than n
                if (n1 % i == 0) {              // if yes, not a prime
                    def = 0;
                    break;
                }
                i += 6;                         // sum 6 in 6 to check the next odd number
            }                                   // pointless to check 2, 3 or 4 (line 20)
        }

        if (def == 1)
            System.out.println("É primo");
        else
            System.out.println("Não é primo");
    }
}