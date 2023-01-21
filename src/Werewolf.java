public class Werewolf extends Monster{

    public Werewolf() {
        super(150, 30, "Werewolf");
    }

    @Override
    public AttackResult attack(Monster target) {
        int damage = Math.min(target.getHitpoints(), this.getDamage());

        target.setHitpoints(target.getHitpoints() - damage);
        System.out.println("Werewolf attacked " + target.getMonsterName() + " for " + damage + " damage. \n" +
                target.getMonsterName() + " now has " + target.getHitpoints() + " hitpoints.");
        System.out.println(".".repeat(150));

        return new AttackResult(0, damage);
    }
}
