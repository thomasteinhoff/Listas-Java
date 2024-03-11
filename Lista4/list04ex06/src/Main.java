public class Main {
    public static void main(String[] args) {
        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        int aux;

        for (int i=0; i<numbers.length/2; i++) {
            aux = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = aux;
        }
        System.out.println("");
        for (int i=0; i<numbers.length; i++)
            System.out.printf(numbers[i] + " ");
    }
}