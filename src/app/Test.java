package app;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Ninja n = new Ninja();
        Wizard w = new Wizard();
        Samurai s1 = new Samurai();
        Samurai s2 = new Samurai();

        System.out.println("Ninja: " + n);
        System.out.println("Wizard: " + w);
        System.out.println("Samurai: " + s1);
        System.out.println("Samurai: " + s2);
        System.out.println("Amount of samurais: " + Samurai.howMany());
        
        w.attack(n);
        System.out.println("Wizard: " + w);
        System.out.println("Ninja: " + n);
        n.steal(s1);
        System.out.println("Ninja: " + n);
        System.out.println("Samurai: " + s1);
        
    }
}