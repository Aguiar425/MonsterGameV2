public class Player {

    public Monster[] team = new Monster[5];
    private String nickname;
    private int numMonsters;
    public int maxHP;

    public Player(String nickname, int numMonsters) {
        this.nickname = nickname;
        this.numMonsters = numMonsters;
        this.maxHP = 0;
    }

    public void pickTeam() {
        int numWerewolf = RandomNumber.generateRandom(this.numMonsters, 0);
        int numVampire = RandomNumber.generateRandom(numMonsters-numWerewolf, 0);
        int numMummy = numMonsters-numWerewolf-numVampire;

        int index = 0;
        for (int i = 0; i < numWerewolf; i++) {
            team[index] = new Werewolf();
            this.maxHP = maxHP + team[index].getHitpoints();
            index++;
        }
        for (int j = 0; j < numVampire; j++) {
            team[index] = new Vampire();
            this.maxHP = maxHP + team[index].getHitpoints();
            index++;
        }
        for (int k = 0; k < numMummy; k++) {
            team[index] = new Mummy();
            this.maxHP = maxHP + team[index].getHitpoints();
            index++;
        }
    }

    public AttackResult pickAttacker(Monster defender) {
        int temp1 = RandomNumber.generateRandom(numMonsters, 0);

        while (team[temp1].getHitpoints() < 1) {
            temp1 = RandomNumber.generateRandom(numMonsters, 0);
        }

        System.out.println(this.nickname + " picked " + team[temp1].getMonsterName() + " as an attacker.");
        return team[temp1].attack(defender);
    }

    public Monster pickDefender() {
        int temp2 = RandomNumber.generateRandom(numMonsters, 0);
        while (team[temp2].getHitpoints() < 1) {
            temp2 = RandomNumber.generateRandom(numMonsters, 0);
        }
        System.out.println(this.nickname + " picked " + team[temp2].getMonsterName() + " as a defender.");

        return team[temp2];
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public String getNickname() {
        return nickname;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void sufferMaxHP(int damage){

        this.maxHP = maxHP - damage;
    }
}
