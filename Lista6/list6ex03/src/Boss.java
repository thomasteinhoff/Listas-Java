public class Boss {
    private String name;
    private int hp;
    private int str;
    private int stagger;
    private boolean inspecioned;
    private boolean fallen;
    private boolean prepAttack;

    // Constructor

    public Boss() {
        this.name = "Door Guardian";
        this.hp = 1200;
        this.str = 100;
        this.stagger = 0;
        this.inspecioned = false;
        this.fallen = false;
        this.prepAttack = false;
    }

    // Getters n Setters
    public String getName() {
        if(inspecioned)
            return name;
        else
            return "Giant";
    }
    public int getHp() {return hp;}
    public int getStr() {return str;}
    public int getStagger() {return stagger;}
    public boolean isInspecioned() {return inspecioned;}
    public boolean isFallen() {return fallen;}
    public boolean isPrepAttack() {return prepAttack;}

    public void setHp(int dmg) {this.hp -= dmg;}
    public void addStagger(int stagger) {this.stagger += stagger;}
    public void zeroStagger() {this.stagger = 0;}
    public void setFallen(boolean fallen) {this.fallen = fallen;}
    public void setPrepAttack(boolean prepAttack) {this.prepAttack = prepAttack;}

    // Methods
    @Override
    public String toString() {
        this.inspecioned = true;
        return "\nYou remember the folks warning you about the Door Guardian." +
                "\nHis pacing is heavy in the right leg...\n" +
                "HP: " + hp + "/1200";
    }
}