import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int [] numbers = new int[10];
        int max, min, aux;

        System.out.println("Informe dez números inteiros (separe por input)");
        numbers[0] = read.nextInt();
        max = numbers[0];
        min = numbers[0];

        for (int i=1; i<=9; i++) {
            System.out.println(i+1 + "º ?:");
            numbers[i] = read.nextInt();
            aux = numbers[i];
            if (aux > max)
                max = aux;

            if (aux < min)
                min = aux;
        }

        System.out.println("Maior: " + max + "\nMenor: " + min + "\nArray:");
        for(int i=0;i<numbers.length;i++)
            System.out.printf(numbers[i] + ", ");
    }
}