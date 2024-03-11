public class Main {
    public static void main(String[] args) {
        int [] [] numbers = {{7,9,8,2,9}
                            ,{1,9,2,6,4}
                            ,{9,1,1,6,1}
                            ,{3,5,6,1,9}
                            ,{7,5,8,7,7}};

        for (int i=0; i<=4; i++) {
            System.out.printf(numbers[i][i] + " ");
        }
    }
}