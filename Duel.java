public class Duel {
    public SpellCaster caster1;
    public SpellCaster caster2;
    public int turn = 1;
    public boolean isOver = false;
    public SpellCaster winner = null;

    public Duel(SpellCaster caster1, SpellCaster caster2) {
        this.caster1 = caster1;
        this.caster2 = caster2;
    }

    public void castBarriers(boolean special1, boolean special2) {
        if (this.caster1 instanceof Wizard && special1) {
            this.caster1.specialCast();
        }

        if (this.caster2 instanceof Wizard && special2) {
            this.caster2.specialCast();
        }
    }

    public void normalCasts(boolean special1, boolean special2) {
        if (!special1) {
            this.caster2.takeDamage(this.caster1.normalCast());
        }
        if (!special2) {
            this.caster1.takeDamage(this.caster2.normalCast());
        }
    }

    public void castHeals(boolean special1, boolean special2) {
        if (this.caster1 instanceof Witch && special1) {
            this.caster1.specialCast();
        }

        if (this.caster2 instanceof Witch && special2) {
            this.caster2.specialCast();
        }
    }

    public void simulateTurn(boolean special1, boolean special2) {
        if (this.isOver) {
            return;
        }

        // wizards cast barrier
        this.castBarriers(special1, special2);

        // normal casts
        this.normalCasts(special1, special2);

        // check for defeat
        if (this.caster1.isDefeated() && this.caster2.isDefeated()) {
            this.winner = this.caster1;
            if (this.caster2.health > this.caster1.health) {
                this.winner = this.caster2;
            }
            this.isOver = true;
        } else if (this.caster1.isDefeated()) {
            this.winner = this.caster2;
            this.isOver = true;
        } else if (this.caster2.isDefeated()) {
            this.winner = this.caster1;
            this.isOver = true;
        } else {
            // witches heal as they have survived
            this.castHeals(special1, special2);
        }

        // print out turn info
        this.printStats(special1, special2);
        this.turn++;
    }

    public void printStats(boolean special1, boolean special2) {
        String normalString = "Casted normal!";
        String specialString = "Casted special!";

        String caster1move = normalString;
        if (special1) {
            caster1move = specialString;
        }

        String caster2move = normalString;
        if (special2) {
            caster2move = specialString;
        }

        System.out.printf("Turn %d: %s (%d) %s vs. %s (%d) %s\n",
                this.turn,
                this.caster1.name,
                this.caster1.health,
                caster1move,
                this.caster2.name,
                this.caster2.health,
                caster2move);
    }
}
