public class Game {

    private Player player1;
    private Player player2;
    private int numMonster;

    public Game() {
        this.numMonster = RandomNumber.generateRandom(5, 2); //Random number 2-5
        this.player1 = new Player("Player 1", this.numMonster);
        this.player2 = new Player("Player 2", this.numMonster);
        System.out.println("Each player gets to choose " + this.numMonster + " Monsters.");
        System.out.println("=".repeat(50));
    }

    public void play(){
        this.player1.pickTeam();
        this.player2.pickTeam();

        while (!end()) {
            AttackResult atkResult = this.player1.pickAttacker(this.player2.pickDefender());
            player2.sufferMaxHP(atkResult.getTargetHPDiff());
            player1.sufferMaxHP(atkResult.getAttackerHPDiff());
            if (end()) {
                return;
            }
            atkResult = this.player2.pickAttacker(this.player1.pickDefender());
            player1.sufferMaxHP(atkResult.getTargetHPDiff());
            player2.sufferMaxHP(atkResult.getAttackerHPDiff());

            if (end()) {
                return;
            }
        }
    }

    public boolean end(){
        boolean p1Dead = false;
        boolean p2Dead = false;

        if ((player1.getMaxHP() <= 0)) {
            p1Dead = true;
        }

        if ((player2.getMaxHP() <= 0)) {
            p2Dead = true;
        }

        if (p1Dead) {
            System.out.println(player2.getNickname() + " has won the game.");
        } else if (p2Dead) {
            System.out.println(player1.getNickname() + " has won the game.");
        }
        return (p1Dead || p2Dead);

    }
}
