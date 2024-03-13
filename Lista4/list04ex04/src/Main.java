import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int [] numbers = new int[10];
        int max, min, aux, maxpos = 0, minpos = 0;

        System.out.println("Informe dez números inteiros (separe por input)");
        numbers[0] = read.nextInt();
        max = numbers[0];
        min = numbers[0];

        for (int i=1; i<=9; i++) {
            System.out.println(i+1 + "º ?:");
            numbers[i] = read.nextInt();
            aux = numbers[i];
            if (aux > max) {
                max = aux;
                maxpos = i;
            }

            if (aux < min) {
                min = aux;
                minpos = i;

            }
        }

        System.out.println("Maior: " + max + ", na posição " + maxpos + "\nMenor: " + min + ", na posição " + minpos + "\nArray:");
        for(int i=0;i<numbers.length;i++)
            System.out.printf(numbers[i] + ", ");
    }
}