import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1;
        double n2;
        double n3;

        System.out.println("Informe duas notas");
        n1 = read.nextDouble();
        n2 = read.nextDouble();
        n3 = (n1 + n2)/2;
        if (n3 >= 8.5){
            System.out.println("Nota A!");
        } else {
            if (n3 >= 7){
                System.out.println("Nota B!");
            } else {
                if (n3 >= 5){
                    System.out.println("Nota C!");
                } else {
                    System.out.println("Nota D!");
                }
            }
        }
    }
}