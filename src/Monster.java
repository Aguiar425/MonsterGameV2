public abstract class Monster {

    private int hitpoints;
    private final int damage;
    private final String monsterName;

    public Monster(int hitpoints, int damage, String monsterName) {
        this.hitpoints = hitpoints;
        this.damage = damage;
        this.monsterName = monsterName;
    }

    public abstract AttackResult attack(Monster target);

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getDamage() {
        return damage;
    }

    public String getMonsterName() {
        return monsterName;
    }
}
