public class Main {
    public static void main(String[] args) {
        TextFile file = new TextFile("NewFile");

        file.open();
        file.edit("Hello World!");
        file.open();
        file.rename("Nice file 1");
        file.dump();
        file.open();
    }
}