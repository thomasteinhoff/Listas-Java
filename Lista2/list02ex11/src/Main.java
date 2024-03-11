import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1;

        System.out.println("Informe um número de 1 à 7");
        n1 = read.nextInt();

        if (n1 == 1){
            System.out.println("Isso corresponde ao dia:  Sábado");
        }
        if (n1 == 2){
            System.out.println("Isso corresponde ao dia: Segunda-Feira");
        }
        if (n1 == 3){
            System.out.println("Isso corresponde ao dia: Terça-Feira");
        }
        if (n1 == 4){
            System.out.println("Isso corresponde ao dia: Quarta-Feira");
        }
        if (n1 == 5){
            System.out.println("Isso corresponde ao dia: Quinta-Feira");
        }
        if (n1 == 6){
            System.out.println("Isso corresponde ao dia: Sexta-Feira");
        }
        if (n1 == 7){
            System.out.println("Isso corresponde ao dia: Domingo");
        }
        if (n1 < 1 || n1 > 7){
            System.out.println("Eu disse de 1 à 7");
        }
    }
}