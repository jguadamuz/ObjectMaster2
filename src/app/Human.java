package app;

/**
 * Human
 */
public class Human {

    private int strength = 3;
    private int intelligence = 3;
    private int stealth = 3;
    private int health = 100;

    // getters
    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public int getHealth() {
        return health;
    }

    // setters
    public void setStrength(int s) {
        strength = s;
    }

    public void setIntelligence(int i) {
        intelligence = i;
    }

    public void setStealth(int s) {
        stealth = s;
    }

    public void setHealth(int h) {
        health = h;
    }

    public void attack(Human h) {
        h.health -= this.health;
    }
}