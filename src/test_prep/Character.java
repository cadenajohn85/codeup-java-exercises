package test_prep;

public class Character {

    private String name;
    private int maxHP;
    private int currentHP;

    public Character(String someName, int MaxHP) {
        this.name = someName;
        this.maxHP = MaxHP;
        this.currentHP = MaxHP;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getMaxHP() {
        return this.maxHP;
    }

    public void setMaxHP(int newMaxHP) {
        this.maxHP = newMaxHP;
    }

    public static int attack() {
        return (int) (Math.random() * 5) + 1;
    }

    public void heal() {
        if (this.maxHP - this.currentHP < 15) {
            this.currentHP = this.maxHP;
        } else {
            this.currentHP += 15;
        }
    }

}
