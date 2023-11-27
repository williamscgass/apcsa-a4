public class Wizard extends SpellCaster {
    private boolean barrier;

    public Wizard(String name, int maxHealth, int seed) {
        super(name, maxHealth, seed);
    }

    public int takeDamage(int damage) {
        if (!this.barrier) {
            super.takeDamage(damage);
        }
        this.barrier = false;
        return this.health;
    }
    
    public int normalCast() {
        return this.rgen.nextInt(51);
    }
    
    public void specialCast() {
        this.barrier = true;
    }
}
