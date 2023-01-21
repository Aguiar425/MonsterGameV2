public class Mummy extends Monster{

    private int attackCounter;

    public Mummy() {
        super(200, 50, "Mummy");
    }

    @Override
    public AttackResult attack(Monster target) {
        attackCounter++;
        int damage = Math.min(target.getHitpoints(), this.getDamage());

        AttackResult atk = new AttackResult(0,0);
        if (attackCounter == 3) {
            int selfDamage = Math.min(getHitpoints(), this.getDamage()/2);
            this.setHitpoints(this.getHitpoints() - selfDamage);
            System.out.println("Mummy failed the attack and got some bandages unrolled. It took "
                    + selfDamage + " damage.");
            attackCounter = 0;
            return new AttackResult(selfDamage, 0);
        }
        target.setHitpoints(target.getHitpoints() - damage);
        System.out.println("Mummy attacked " + target.getMonsterName() + " for " + damage + " damage. \n" +
                target.getMonsterName() + " now has " + target.getHitpoints() + " hitpoints.");
        System.out.println(".".repeat(150));

        atk.setTargetHPDiff(damage);
        return atk;
    }

}
