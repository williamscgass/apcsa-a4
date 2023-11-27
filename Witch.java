public class Witch extends SpellCaster {
    public Witch(String name, int maxHealth, int seed) {
        super(name, maxHealth, seed);
    }
    
    public int normalCast() {
        return this.rgen.nextInt(16) + 15;
    }
    
    public void specialCast() {
        this.health = Math.min(this.health + 20, this.maxHealth);
    }
}
