import java.util.Random;

public class SpellCaster {
    public String name;
    public int maxHealth;
    public int health;
    public int battlesWon;
    protected Random rgen;

    public SpellCaster(String name, int maxHealth, int seed) {
        this.rgen = new Random(seed);

        /*
         * Your code goes here...
         */
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.battlesWon = 0;
    }
    
    /*
     * These two get overridden...
     */
    public int normalCast() {
        return 0;
    }
    public void specialCast() {
        return;
    }

    public int takeDamage(int damage) {
        this.health -= damage;
        return this.health;
    }

    public void increaseBattlesWon() {
        this.battlesWon++;
    }

    public boolean isDefeated() {
        return this.health <= 0;
    }
}