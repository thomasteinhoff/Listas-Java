public class Main {
    public static void main(String[] args) {
        int maxcol=0, maxlin=0, aux=0, idcol=0, idlin=0;
        int [] [] numbers = {{7,9,8,2,9}
                            ,{1,9,2,6,4}
                            ,{9,1,1,6,1}
                            ,{3,5,6,1,9}
                            ,{7,5,8,7,7}};

        for (int i=0; i<=4; i++) {
            maxlin += numbers[0][i];
            maxcol += numbers[i][0];
        }
        for (int j=1; j<=4; j++) {
            for (int i = 0; i <= 4; i++) {
                aux += numbers[j][i];
                if (aux > maxlin) {
                    maxlin = aux;
                    idlin = j;
                }
                aux = 0;
            }
        }
        for (int j=1; j<=4; j++) {
            for (int i = 0; i <= 4; i++) {
                aux += numbers[i][j];
                if (aux > maxcol) {
                    maxcol = aux;
                    idcol = j;
                }
                aux = 0;
            }
        }
        System.out.println("Maior linha: " + idlin + "\nMaior coluna: " + idcol);
    }
}