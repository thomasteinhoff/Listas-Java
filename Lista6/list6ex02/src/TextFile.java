public class TextFile {
    private String title;
    private int size;
    private String content;

    public TextFile(String title) {
        this.title = title;
        this.size = 0;
        this.content = "";
    }

    public String getTitle() {return title;}
    public int getSize() {return size;}
    public String getContent() {return content;}

    // methods

    public void open() {
        size = content.length() * 8;
        System.out.println(title +
                "\n" + size + " bites" +
                "\n" + content + "\n");
    }

    public void edit(String content) {this.content += content;}
    public void rename(String newTitle) {title = newTitle;}
    public void dump() {this.content = "";}
}