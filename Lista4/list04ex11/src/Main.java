import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // informing matrices sizes
        System.out.println("Informe quantas colunas terá a matriz A");
        int macol = read.nextInt();
        System.out.println("Informe quantas linhas terpá a matriz A");
        int malin = read.nextInt();
        System.out.println("Informe quantas colunas terpá a matriz B");
        System.out.println("* A matriz B tem o mesmo tanto de linhas que as colunas da matriz A");
        int mbcol = read.nextInt();
        int mblin = macol;

        // declaration and initialization of the matrices
        int [] [] matriza = new int[malin][macol];
        int [] [] matrizb = new int[macol][mbcol];
        int [] [] matrizc = new int[malin][mbcol];

        for (int j=0; j<macol; j++) {
            for (int i=0; i<malin; i++) {
                System.out.println("Matriz A - Linha: " + i + " Coluna: " + j);
                matriza[i][j] = read.nextInt();
            }
        }

        System.out.println("");
        for (int j=0; j<mbcol; j++) {
            for (int i=0; i<macol; i++) {
                System.out.println("Matriz B - Linha: " + i + " Coluna: " + j);
                matrizb[i][j] = read.nextInt();
            }
        }

        // calc of the product matrix
        for (int x=0; x<mbcol; x++) {
            for (int y=0; y<malin; y++) {
                for (int z=0; z<mblin; z++)
                    matrizc[y][x] += matriza[y][z] * matrizb[z][x];
            }
        }

        // printing the product matrix
        for (int x=0; x<malin; x++) {
            for (int y = 0; y < mbcol; y++)
                System.out.printf(matrizc[x][y] + " ");
            System.out.println("");
        }
    }
}