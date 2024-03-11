public class Main {
    public static void main(String[] args) {
        int [] [] matriza = {{3,5}          //matriz [3,2]
                            ,{6,3}
                            ,{5,4}};

        int [] [] matrizb = {{1,9}          //matriz [2,2] ∴ matrizc[2x3]
                            ,{6,8}};

        int [] [] matrizc = new int[2][3];

        for (int x=0; x<=1; x++) {
            for (int y = 0; y <= 2; y++) {
                matrizc[x][y] = matriza[y][0] * matrizb[0][x] + matriza[y][1] * matrizb[1][x];
            }
        }

        for (int y=0; y<=2; y++){
            for (int x=0; x<=1; x++)
                System.out.printf(matrizc[x][y] + " ");
            System.out.println("");
        }
    }
}