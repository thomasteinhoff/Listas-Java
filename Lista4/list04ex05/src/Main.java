public class Main {
    public static void main(String[] args) {
        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        int [] invert = new int[10];

        for (int i=9; i>=0; i--)
            invert[9-i]=(numbers[i]);

        System.out.println("Array 1:");
        for (int i=0;i<numbers.length;i++)
            System.out.printf(numbers[i] + " ");

        System.out.println("\nArray 2:");
        for (int i=0;i<invert.length;i++)
            System.out.printf(invert[i] + " ");
    }
}