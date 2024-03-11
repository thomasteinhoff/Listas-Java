public class Main {
    public static void main(String[] args) {
        int [] lista = {1,2,3,4,5,6,7,8,9,10};

        for (int i=0; i<=9; i++) {
            if (i % 2 == 0)
                lista[i] += 2;
            else
                lista[i] *= 2;
            System.out.println(lista[i]);
        }
    }
}