import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insert a number: ");
        System.out.println("It squared is: " + Math.pow(read.nextInt(),2));
    }
}