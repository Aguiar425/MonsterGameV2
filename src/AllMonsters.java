public enum AllMonsters {

    WEREWOLF (150, 30, "A standard and reliable monster"),
    VAMPIRE (120, 20, "Sometimes bites it opponents to recover some lost HP"),
    MUMMY(200,50, "Hard hitting monster, but might hurt itself from time to time");

    private final int hitpoints;
    private final int damage;
    private final String description;

    private AllMonsters(int hitpoints, int damage, String description){
        this.hitpoints = hitpoints;
        this.damage = damage;
        this.description = description;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getDamage() {
        return damage;
    }
}
