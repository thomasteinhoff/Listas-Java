import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;
        int aux;
        int maior;
        int menor;
        int i;

        System.out.println("Informe cinco números (separe por input)");
        n1 = read.nextInt();
        maior = n1;
        menor = n1;


        for (i=1; i<=4; i++) {
            aux = read.nextInt();
            if (aux > maior)
                maior = aux;

            if (aux < menor)
                menor = aux;
        }

        System.out.println("Maior: " + maior + "\nMenor: " + menor);
    }
}