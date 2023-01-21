public class Vampire extends Monster{

    private final String name = "Vampire";

    public Vampire() {
        super(120, 20, "Vampire");
    }

    @Override
    public AttackResult attack(Monster target) {
        int damage = Math.min(target.getHitpoints(), this.getDamage());

        AttackResult atk = new AttackResult(0,0);
        if (bite() == 0) {
            setHitpoints(getHitpoints() + (getDamage() / 2));
            atk.setAttackerHPDiff(-getDamage()/2);
        }

        target.setHitpoints(target.getHitpoints() - damage);
        System.out.println("Vampire attacked " + target.getMonsterName() + " for " + damage + " damage. \n" +
                target.getMonsterName() + " now has " + target.getHitpoints() + " hitpoints.");
        System.out.println(".".repeat(150));

        atk.setTargetHPDiff(damage);
        return atk;
    }

    public int bite() {
        System.out.println("Vampire has bitten his target. He recovered " + (this.getDamage() / 2) + " hitpoints.");
        return (int) (Math.random() * 2);
    }
}
