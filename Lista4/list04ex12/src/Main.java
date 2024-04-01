public class Main {
    public static void main(String[] args) {
        int detmain, detsecn, det = 0;
        int [] [] matrix = {{1,2,1}
                           ,{3,2,2}
                           ,{1,1,3}};

        for (int j=0; j< matrix.length; j++){
            detmain = 1;
            detsecn = 1;
            for (int i=0; i<=2; i++) {
                detmain *= matrix[i][(i + j) % matrix.length];
                detsecn *= matrix[i][(matrix.length - 1 - i + j) % matrix.length];
            }
            det += detmain - detsecn;
        }

        System.out.println(det);
    }
}