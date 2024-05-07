public class Char {
    private String name;
    private int maxHp;
    private int hp;
    private int str;
    private int def;
    private boolean evading;
    private int potions;

    // Constructor
    public Char(String name, int maxHp, int hp, int str, int def) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = hp;
        this.str = str;
        this.def = def;
        this.evading = false;
        this.potions = 3;
    }

    // Getters n Setters
    public int getHp() {return hp;}
    public int getStr() {return str;}
    public int getDef() {return def;}
    public boolean isEvading() {return evading;}
    public int getPotions() {return potions;}

    public void getAttacked(int hp) {this.hp -= hp;}
    public void setEvading(boolean evading) {this.evading = evading;}

    // Methods
    public void heal() {
        hp = Math.min(hp + 60, 100);
        this.potions--;
    }
    @Override
    public String toString() {
        return "\nI am " + name + ", what im doing here was forgotten long ago...\n" +
                "My HP: " + hp + "/" + maxHp;
    }
}