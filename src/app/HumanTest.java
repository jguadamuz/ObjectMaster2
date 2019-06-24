package app;

/**
 * HumanTest
 */
public class HumanTest {

    public static void main(String[] args) {
        
        Human h1 = new Human();
        Human h2 = new Human();

        System.out.println("h1 " + h1.getStrength());
        System.out.println("h1 " + h1.getHealth());
        System.out.println("h1 " + h1.getIntelligence());
        System.out.println("h1 " + h1.getStealth());
        System.out.println("h2 " + h2.getStrength());
        System.out.println("h2 " + h2.getHealth());
        System.out.println("h2 " + h2.getIntelligence());
        System.out.println("h2 " + h2.getStealth());

        h1.setHealth(34);
        h1.attack(h2);
        
        System.out.println("h1 " + h1.getHealth());
        System.out.println("h2 " + h2.getHealth());
    }
}