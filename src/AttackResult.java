public class AttackResult {

    private int attackerHPDiff;
    private int targetHPDiff;

    public AttackResult(int attackerHPDiff, int targetHPDiff) {
        this.attackerHPDiff = attackerHPDiff;
        this.targetHPDiff = targetHPDiff;
    }

    public int getAttackerHPDiff() {
        return attackerHPDiff;
    }

    public int getTargetHPDiff() {
        return targetHPDiff;
    }

    public void setAttackerHPDiff(int attackerHPDiff) {
        this.attackerHPDiff = attackerHPDiff;
    }

    public void setTargetHPDiff(int targetHPDiff) {
        this.targetHPDiff = targetHPDiff;
    }
}
