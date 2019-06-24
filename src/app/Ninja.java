package app;

/**
 * Ninja
 */
public class Ninja extends Human{

    public Ninja() {
        this.stealth = 10;
    }

    public void steal(Human h) {
        this.health += this.stealth;
        h.health -= this.stealth;
    }

    public void runAway() {
        this.health -= 10;
    }
}