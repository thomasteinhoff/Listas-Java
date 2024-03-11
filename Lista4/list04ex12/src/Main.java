public class Main {
    public static void main(String[] args) {
        int main1=1, main2=1, main3=1, nd1=1, nd2=1, nd3=1;
        int [] [] matrix = {{5,3,6}
                           ,{5,1,4}
                           ,{4,6,8}};

        for (int i=0; i<=2; i++) {
            main1 *= matrix[i][i];
            main2 *= matrix[i][(i + 1) % 3];
            main3 *= matrix[i][(i + 2) % 3];
            nd1 *= matrix[i][2 - i];
            nd2 *= matrix[i][2 - ((i + 1) % 3)];
            nd3 *= matrix[i][2 - ((i + 2) % 3)];
        }

        System.out.println("A determinante é: " + (main1+main2+main3-nd1-nd2-nd3));
    }
}