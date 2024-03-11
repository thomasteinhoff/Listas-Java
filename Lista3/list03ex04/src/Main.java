public class Main {
    public static void main(String[] args) {
        int i;

        for (i=-80; i<=80; i+=10)
            System.out.println(i + "C° = " + ((1.8*i)+32) + "F°");
    }
}