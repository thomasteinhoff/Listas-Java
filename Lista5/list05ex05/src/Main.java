import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int [] array = new int[(int) (Math.floor(Math.random()*11 + 20))];  // generate an array of 20 to 30 spaces
        for (int i=0; i <array.length; i++)                                 // populate the array with random numbers
            array[i] = (int) (Math.floor(Math.random() * 100));
        orderarray(array);                                                  // order the array in ascending

        System.out.println("Insert a number up to 100 to search: ");
        int target = read.nextInt();
        String result = binsearch(target, array);
        System.out.println(result != null ? result : closest(target, array));
    }
    public static void orderarray(int [] array) {
        int aux;
        for (int j=0; j< (array.length - 1); j++) {                         // bubble sort as many times as the
            for (int i=0; i< (array.length - 1 - j); i++) {                 // array length
                if (array[i] > array[i+1]) {
                    aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                }
            }
        }
    }
    public static String binsearch(int res, int [] array) {
        int midIndex = array.length / 2;                                    // THE thing
        int midValue = array[midIndex];

        if (res == midValue)
            return midValue + " found at the index: " + midIndex;
        else if (res < midValue && midIndex > 0)
            return binsearch(res, fsthalve(array, midIndex));
        else if (res > midValue && midIndex < array.length - 1)
            return binsearch(res, sndhalve(array, midIndex));
        else
            return null;
    }
    public static int[] fsthalve(int [] array, int midIndex) {
        int [] array1 = new int[midIndex];                                  // creates a new array of half the size of
        for (int i=0; i < midIndex; i++)                                    // the main array and returns it to re do
            array1[i] = array[i];                                           // all the analysis again
        return array1;
    }
    public static int[] sndhalve(int [] array, int midIndex) {
        int [] array1 = new int[array.length - midIndex - 1];               // same but the other half of the array
        for (int i = midIndex + 1; i < array.length; i++)
            array1[i - midIndex - 1] = array[i];
        return array1;
    }
    public static String closest(int target, int [] array) {                // if there isnt the number, search the
        for (int i=0; i< array.length; i++)                                 // closest number by searching the entire
            if (array[i] < target && target < array[i+1])                   // array
                return "Closest numbers: " + array[i] + ", " + array[i + 1];
        return null;
    }
}

/*
    not working code made witouth help of gpt:

    public static Serializable binsearch(int res, int [] array) {
        if (array.length == 1)                                              // stop searching when the array doesnt
            return ("Closest number is: " + array[0]);                        // have any more numbers
        if (res <= array[array.length / 2])                                 // if it's in the first half of the string
            return binsearch(res, fsthalve(array));
        if (res > array[array.length / 2])                                 // if it's in the secnd half of the string
            return binsearch(res, sndhalve(array));
        return -1;
    }
    public static int[] fsthalve(int [] array) {
        int [] array1 = new int[array.length/2];
        for (int i=0; i <= array.length/2; i++)
            array1[i] = i;
        return array1;
    }
    public static int[] sndhalve(int [] array) {
        int [] array1 = new int[array.length/2];
        for (int i=(array.length/2); i < array.length ; i++)
            array1[i] = i;
        return array1;
    }
 */